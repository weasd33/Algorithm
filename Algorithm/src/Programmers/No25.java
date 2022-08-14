package Programmers;

import java.util.ArrayList;
import java.util.Collections;

//코딩테스트 연습 > 문자열 내 마음대로 정렬하기
//https://school.programmers.co.kr/learn/courses/30/lessons/12915

/*
	- 문제 설명 -
	문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다. 
	예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.
	
	- 제한 조건 -
	strings는 길이 1 이상, 50이하인 배열입니다.
	strings의 원소는 소문자 알파벳으로 이루어져 있습니다.
	strings의 원소는 길이 1 이상, 100이하인 문자열입니다.
	모든 strings의 원소의 길이는 n보다 큽니다.
	인덱스 1의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치합니다.
	
	- 입출력 예 -
	strings = ["sun", "bed", "car"], n = 1, return = ["car", "bed", "sun"]
	strings = ["abce", "abcd", "cdx"], n = 2, return = ["abcd", "abce", "cdx"]
*/

public class No25 {
	
	public String[] solution(String[] strings, int n) {
		String[] answer = {};
		ArrayList<String> value = new ArrayList<String>();
		
		for(int i = 0; i < strings.length; i++) {
			// 문자열의 n번째 자리를 맨 앞으로 보내서 정렬을 시킨다.
			value.add(strings[i].charAt(n) + strings[i]);
		}
		
		Collections.sort(value);
		
		answer = new String[value.size()];
		
		for(int i = 0; i < answer.length; i++) {
			answer[i] = value.get(i).substring(1);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		No25 test = new No25();
		
		String[] value1 = {"sun", "bed", "car"};
		System.out.print("value1 >> ");
		for(String v1 : test.solution(value1, 1)) { System.out.print(v1 + " "); }
		System.out.println();
		String[] value2 = {"abcd", "abce", "cdx"};
		System.out.print("value2 >> ");
		for(String v2 : test.solution(value2, 2)) { System.out.print(v2 + " "); }
	}
}
