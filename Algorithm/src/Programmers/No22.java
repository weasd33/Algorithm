package Programmers;

//코딩테스트 연습 > 연습문제 > 문자열 다루기 기본
//https://school.programmers.co.kr/learn/courses/30/lessons/12918

/*

	- 문제 설명 -
	문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 
	예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
	
	- 제한 사항 -
	s는 길이 1 이상, 길이 8 이하인 문자열입니다.
	s는 영문 알파벳 대소문자 또는 0부터 9까지 숫자로 이루어져 있습니다.

*/

public class No22 {

	public boolean solution1(String s) { // 나의 풀이
		
		if(s.length() == 4 || s.length() == 6) {
			try {
				int value = Integer.parseInt(s); // 정수로 변경 못할 시 예외 발생
				return true;
			} catch (NumberFormatException e) {
				return false;
			}
		} else {
			return false;
		}
	}
	
	public boolean solution2(String s) { // 다른 사람 풀이
		
		if(s.length() != 4 && s.length() != 6) return false;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) < '0' || s.charAt(i) > '9') return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		No22 test = new No22();
		System.out.println(test.solution1("a234"));
		System.out.println(test.solution1("1234"));
		System.out.println(test.solution2("a234"));
		System.out.println(test.solution2("1234"));
	}
}
