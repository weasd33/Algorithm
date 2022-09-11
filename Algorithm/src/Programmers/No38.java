package Programmers;

import java.util.ArrayList;
import java.util.List;

//코딩테스트 연습 > 2019 KAKAO BLIND RECRUITMENT > 실패율
//https://school.programmers.co.kr/learn/courses/30/lessons/42889

/*
	- 문제 설명 -

	슈퍼 게임 개발자 오렐리는 큰 고민에 빠졌다. 
	그녀가 만든 프랜즈 오천성이 대성공을 거뒀지만, 요즘 신규 사용자의 수가 급감한 것이다. 
	원인은 신규 사용자와 기존 사용자 사이에 스테이지 차이가 너무 큰 것이 문제였다.
	
	이 문제를 어떻게 할까 고민 한 그녀는 동적으로 게임 시간을 늘려서 난이도를 조절하기로 했다. 
	역시 슈퍼 개발자라 대부분의 로직은 쉽게 구현했지만, 실패율을 구하는 부분에서 위기에 빠지고 말았다. 
	오렐리를 위해 실패율을 구하는 코드를 완성하라.
	
	*실패율은 다음과 같이 정의한다.
		스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
		전체 스테이지의 개수 N, 게임을 이용하는 사용자가 현재 멈춰있는 스테이지의 번호가 담긴 배열 stages가 매개변수로 주어질 때, 
		실패율이 높은 스테이지부터 내림차순으로 스테이지의 번호가 담겨있는 배열을 return 하도록 solution 함수를 완성하라.
	
	- 제한사항 -
	
	스테이지의 개수 N은 1 이상 500 이하의 자연수이다.
	stages의 길이는 1 이상 200,000 이하이다.
	stages에는 1 이상 N + 1 이하의 자연수가 담겨있다.
	각 자연수는 사용자가 현재 도전 중인 스테이지의 번호를 나타낸다.
	단, N + 1 은 마지막 스테이지(N 번째 스테이지) 까지 클리어 한 사용자를 나타낸다.
	만약 실패율이 같은 스테이지가 있다면 작은 번호의 스테이지가 먼저 오도록 하면 된다.
	스테이지에 도달한 유저가 없는 경우 해당 스테이지의 실패율은 0 으로 정의한다.
	
	입출력 예
	N	stages						result
	5	[2, 1, 2, 6, 2, 4, 3, 3]	[3,4,2,1,5]
	4	[4,4,4,4,4]					[4,1,2,3]
	
	- 입출력 예 설명 -
	
	입출력 예 #1
	1번 스테이지에는 총 8명의 사용자가 도전했으며, 이 중 1명의 사용자가 아직 클리어하지 못했다. 따라서 1번 스테이지의 실패율은 다음과 같다.
	
	1 번 스테이지 실패율 : 1/8
	2번 스테이지에는 총 7명의 사용자가 도전했으며, 이 중 3명의 사용자가 아직 클리어하지 못했다. 따라서 2번 스테이지의 실패율은 다음과 같다.
	
	2 번 스테이지 실패율 : 3/7
	마찬가지로 나머지 스테이지의 실패율은 다음과 같다.
	
	3 번 스테이지 실패율 : 2/4
	4번 스테이지 실패율 : 1/2
	5번 스테이지 실패율 : 0/1
	각 스테이지의 번호를 실패율의 내림차순으로 정렬하면 다음과 같다.
	
	[3,4,2,1,5]
	
	- 입출력 예 #2 -
	
	모든 사용자가 마지막 스테이지에 있으므로 4번 스테이지의 실패율은 1이며 나머지 스테이지의 실패율은 0이다.
	
	[4,1,2,3]
*/

public class No38 {
	
	public int[] solution(int N, int[] stages) {
		int[] answer = new int[N];
		int[] fail = new int[N+1];
		double[] rate = new double[N+1];
		
		for(int v : stages) { // 1 3 2 1 0 1
			fail[v-1]++;
		}
		
		double total = stages.length;
		List<failRate> list = new ArrayList<>();
		
		for(int i = 0; i < N+1; i++) {
			rate[i] = (double) fail[i] / total;
			total -= fail[i];

			failRate v = new failRate(fail[i], rate[i]);
			list.add(v);
		}
		
		
		return answer;
	}
	
	class failRate implements Comparable<failRate> {

		private int failPeople;
		private double rate;
		
		public failRate(int failPeople, double rate) {
			this.failPeople = failPeople;
			this.rate = rate;
		}
		
		@Override
		public int compareTo(failRate o) {
			if(rate < o.rate) {
				return -1;
			} else if (rate > o.rate) {
				return 1;
			} else {
				return 0;
			}
		}
		
	}

	public static void main(String[] args) {
		No38 test = new No38();
		int[] stages = { 2, 1, 2, 6, 2, 4, 3, 3 };
		test.solution(5, stages);
	}
}
