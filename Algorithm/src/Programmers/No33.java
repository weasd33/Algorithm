package Programmers;

import java.time.LocalDate;

//코딩테스트 연습 > 연습문제 > 2016년
//https://school.programmers.co.kr/learn/courses/30/lessons/12901

/*
	- 문제 설명 -
	2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요?
	두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요.
	요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT입니다. 
	예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 "TUE"를 반환하세요.

	- 제한 조건 -
	2016년은 윤년입니다.
	2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)
*/

public class No33 {

	public String solution(int a, int b) { // 나의 풀이
		return LocalDate.of(2016, a, b).getDayOfWeek().toString().substring(0, 3);
	}

	public String another(int a, int b) { // 다른 사람 풀이
		String[] day = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
		int[] date = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int select = 0;

		for (int i = 0; i < a - 1; i++) {
			select += date[i];
		}
		// b-1 : 1월 1일이 하루가 지난 날이 아니기 때문
		select += b - 1;

		return day[select % 7];
	}

	public static void main(String[] args) {
		No33 test = new No33();
		System.out.println(test.solution(5, 24));
		System.out.println(test.another(5, 24));
	}
}