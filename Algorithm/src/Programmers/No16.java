package Programmers;

//코딩테스트 연습 > 연습문제 > 약수의 합
//https://school.programmers.co.kr/learn/courses/30/lessons/12928

/*
	- 문제 설명 -
	정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.

	- 제한 사항 -
	n은 0 이상 3000이하인 정수입니다.
	
	- 입출력 예 #1 -
	12의 약수는 1, 2, 3, 4, 6, 12입니다. 이를 모두 더하면 28입니다.
	
	- 입출력 예 #2 -
	5의 약수는 1, 5입니다. 이를 모두 더하면 6입니다.
*/

public class No16 {
	
	public static int solution(int n) {
		int answer = 0;
		
		for(int i = 1; i <= n / 2; i++) { // n = 12 
			if(n % i == 0) { // 1 2 3 4 6 n
				answer += i;
			}
		}
		
		return answer + n;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(5));
		System.out.println(solution(12));
	}
}
