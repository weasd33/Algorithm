package Programmers;

import java.util.Arrays;

//코딩테스트 연습 > 연습문제 > 정수 내림차순으로 배치하기
//https://school.programmers.co.kr/learn/courses/30/lessons/12933

/*
	- 문제 설명 -
	
	함수 solution은 정수 n을 매개변수로 입력받습니다. 
	n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 
	예를들어 n이 118372면 873211을 리턴하면 됩니다.

	- 제한 조건 -
	
	n은 1이상 8000000000 이하인 자연수입니다.
*/

public class No12 {
	
	public static long solution(long n) {
		
		String[] list = String.valueOf(n).split(""); // 자릿수 나눠서 담는다.
		Arrays.sort(list); // 정렬
		
		StringBuilder sb = new StringBuilder();
		for(String v : list) {
			sb.append(v);
		}
		
//		System.out.println(sb.getClass().getName());
		return Long.parseLong(sb.reverse().toString()); // type : StringBuilder -> String -> Long
	}

	public static void main(String[] args) {
		System.out.println(solution(118372));
	}
}
