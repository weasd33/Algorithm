package Programmers;

//코딩테스트 연습 > 연습문제 > 두 정수 사이의 합
//https://school.programmers.co.kr/learn/courses/30/lessons/12912

/*
	- 문제 설명 -
	두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
	예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
	
	- 제한 조건 -
	a와 b가 같은 경우는 둘 중 아무 수나 리턴하세요.
	a와 b는 -10,000,000 이상 10,000,000 이하인 정수입니다.
	a와 b의 대소관계는 정해져있지 않습니다.
	
	- 입출력 예 -
	a = 3, b = 5, return = 12
	a = 3, b = 3, return = 3
	a = 5, b = 3, return = 12
*/

public class No26 {

	public long solution1(int a, int b) { // for문 사용
		long answer = 0;

		for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
			answer += i;
		}

		return answer;
	}
	
	public long solution2(int a, int b) { // 등차수열 사용
//		(큰 수 - 작은 수 + 1)(a + b) / 2
		return (Math.max(a, b) - Math.min(a, b) + 1) * (a + b) / 2;
	}

	public static void main(String[] args) {
		No26 test = new No26();
		System.out.println(test.solution1(3, 5));
		System.out.println(test.solution1(3, 3));
		System.out.println(test.solution1(5, 3));
		System.out.println("------------------");
		System.out.println(test.solution2(3, 5));
		System.out.println(test.solution2(3, 3));
		System.out.println(test.solution2(5, 3));
	}
}
