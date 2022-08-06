package Programmers;

//코딩테스트 연습 > 연습문제 > 문자열을 정수로 바꾸기
//https://school.programmers.co.kr/learn/courses/30/lessons/12925

/*
	- 문제 설명 -
	문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.
	
	- 제한 조건 -
	s의 길이는 1 이상 5이하입니다.
	s의 맨앞에는 부호(+, -)가 올 수 있습니다.
	s는 부호와 숫자로만 이루어져있습니다.
	s는 "0"으로 시작하지 않습니다.
	
	- 입출력 예 -
	예를들어 str이 "1234"이면 1234를 반환하고, "-1234"이면 -1234를 반환하면 됩니다.
	str은 부호(+,-)와 숫자로만 구성되어 있고, 잘못된 값이 입력되는 경우는 없습니다.
*/

public class No18 {

	public int solution1(String s) { // 나의 풀이

		return Integer.parseInt(s);
	}

	public int solution2(String s) { // 다른 사람 풀이

		boolean sign = true;
		int answer = 0;
		
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if(ch == '-') {
				sign = false;
			} else {
				// 문자열 0으로 빼거나 0은 아스키 코드에서 48이기에 48을 빼도 된다.
				answer = answer * 10 + (ch - '0');
//				answer = answer * 10 + (ch - 48); 
			}
		}
		
		return sign ? 1 : -1 * answer;
	}

	public static void main(String[] args) {
		No18 test = new No18();
		System.out.println(test.solution1("-1234"));	
		System.out.println(test.solution2("-1234"));	
	}
}
