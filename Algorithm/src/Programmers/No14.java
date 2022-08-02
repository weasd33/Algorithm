package Programmers;

//코딩테스트 연습 > 연습문제 > 자릿수 더하기
//https://school.programmers.co.kr/learn/courses/30/lessons/12931

/*
	- 문제 설명 -
	
	자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
	예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.

	- 제한 조건 -
	
	N의 범위 : 100,000,000 이하의 자연수
*/

public class No14 {
	
	public static int solution(int n) {
		int answer = 0;

		while(n > 0) {
			answer += n % 10;
			n /= 10;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(123));
		System.out.println(solution(987));
	}
}
