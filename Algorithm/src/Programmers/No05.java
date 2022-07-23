package Programmers;

//코딩테스트 연습 > 연습문제 > 하샤드 수
//https://school.programmers.co.kr/learn/courses/30/lessons/12947

/*
	- 문제 설명 -
	
	양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 
	예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다. 
	자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.

	- 제한 조건 -
	
	x는 1 이상, 10000 이하인 정수입니다.
*/

public class No05 {

	public static boolean solution(int x) {
		
		int num = x;
		int sum = 0;
		
		while(num != 0) {
			sum += num % 10;
			num /= 10;
		}
		
		return x % sum == 0 ? true : false;
	}
	
	public static void main(String[] args) {
		
		System.out.println(solution(112));
		System.out.println(solution(13));
	}
	
}
