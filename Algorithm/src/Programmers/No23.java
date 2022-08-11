package Programmers;

import java.util.Arrays;

//코딩테스트 연습 > 연습문제 > 문자열 내림차순으로 배치하기
//https://school.programmers.co.kr/learn/courses/30/lessons/12917

/*
	- 문제 설명 -
	문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
	s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
	
	- 제한 사항 -
	str은 길이 1 이상인 문자열입니다.
	
	- 입출력 예 - 
	s = "Zbcdefg" -> return = "gfedcbZ"
*/

public class No23 {

	public String solution1(String s) { // 나의 풀이
		String[] answer = s.split("");

		Arrays.sort(answer);

		StringBuilder sb = new StringBuilder();
		for(String v : answer) { sb.append(v); }
		
		return sb.reverse().toString();
	}
	
	public String solution2(String s) { // 다른 사람 풀이
		char[] answer = s.toCharArray();
		Arrays.sort(answer);
		
		return new StringBuilder(new String(answer)).reverse().toString();
	}

	public static void main(String[] args) {
		No23 test = new No23();
		System.out.println(test.solution1("Zbcdefg"));
		System.out.println(test.solution2("Zbcdefg"));
	}
}
