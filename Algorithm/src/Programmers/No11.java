package Programmers;

//코딩테스트 연습 > 연습문제 > 정수 제곱근 판별
//https://school.programmers.co.kr/learn/courses/30/lessons/12934

/*
	- 문제 설명 -
	
	임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
	n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.

	- 제한 사항 -
	
	n은 1이상, 50000000000000 이하인 양의 정수입니다.
*/

public class No11 {
	
	public static long solution1(long n) { // 나의 풀이
		if(Math.sqrt(n) % 1 == 0) { // 제곱근이 정수
			return (long) Math.pow(Math.sqrt(n) + 1, 2);
		}
		
		return -1;
	}
	
	public static long solution2(long n) { // 다른 사람의 풀이
		double result = Math.sqrt(n);
		
		return Math.floor(result) == result ? (long) Math.pow(result + 1, 2) : -1;
	}
	
	public static void main(String[] args) {
		System.out.println(solution1(121));
		System.out.println(solution1(3));
		System.out.println(solution2(121));
		System.out.println(solution2(3));
	}
}
