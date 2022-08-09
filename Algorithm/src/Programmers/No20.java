package Programmers;

//코딩테스트 연습 > 연습문제 > 소수 찾기
//https://school.programmers.co.kr/learn/courses/30/lessons/12921

/*
	- 문제 설명 -
	1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
	
	소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
	(1은 소수가 아닙니다.)
	
	- 제한 조건 -
	n은 2이상 1000000이하의 자연수입니다.
*/

public class No20 {

	public int solution1(int n) {
		int answer = 0;
		
		for (int i = 2; i <= n; i++) {
			boolean flag = true;
			
			/*
				Math.sqrt()를 사용하는 이유는 제곱근을 기준으로 약수의 개수가 대칭을 이루기 때문
				n까지의 숫자를 나눠볼 필요 없이, 제곱근 이전의 숫자들만 나눠봐도 결과가 나옴
			*/
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) { // 소수가 아닌 경우
					flag = false;
					break;
				}
			}
			
			if (flag == true) 
				answer++;
		}
		return answer;
	}
	
	// 에라토스테네스의 체
	public int solution2(int n) {
		int answer = 0;
		
		boolean[] prime = new boolean[n + 1];
		
		for(int i = 2; i <= n; i++) {
			prime[i] = true; // 2 ~ n까지의 수를 true 초기화
		}
		
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(prime[i] == true) { // i번째가 소수일 때
				for(int j = i; i * j <= n; j++) { // 그의 배수들은 모두 false
					prime[i * j] = false;
				}
			}
		}
		
		for(int i = 2; i <= n; i++) {
			if(prime[i] == true) {
				answer++;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		No20 test = new No20();
		System.out.println(test.solution1(10));
		System.out.println(test.solution2(5));
	}
}
