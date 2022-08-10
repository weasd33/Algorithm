package Programmers;

import java.util.Arrays;

//코딩테스트 연습 > 연습문제 > 서울에서 김서방 찾기
//https://school.programmers.co.kr/learn/courses/30/lessons/12919

/*
	- 문제 설명 -
	String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아, "김서방은 x에 있다"는 String을 반환하는 함수, solution을 완성하세요. 
	seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.
	
	- 제한 사항 -
	seoul은 길이 1 이상, 1000 이하인 배열입니다.
	seoul의 원소는 길이 1 이상, 20 이하인 문자열입니다.
	"Kim"은 반드시 seoul 안에 포함되어 있습니다.
*/

public class No21 {
	
	public String solution(String[] seoul) {
		// 자바 배열에서는 indexOf()를 지원하지 않고
		// ArrayList 자료구조에서만 지원하므로 asList()를 통해 변환시켜 인덱스를 구해야 한다.
		return "김서방은 " + Arrays.asList(seoul).indexOf("Kim") + "에 있다";
	}
	
	public static void main(String[] args) {
		No21 test = new No21();
		String[] name = {"Jane", "Kim"};
		System.out.println(test.solution(name));
	}
}
