package Programmers;

//코딩테스트 연습 > 연습문제 > 가운데 글자 가져오기
//https://school.programmers.co.kr/learn/courses/30/lessons/12903

/*
	- 문제 설명 -
	단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 
	단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
	
	- 제한 사항 -
	s는 길이가 1 이상, 100이하인 스트링입니다.
	
	- 입출력 예 -
	   s		return
	"abcde"		 "c"	
	"qwer"		 "we"
*/

public class No29 {
	
	public String solution(String s) {
        
        return s.length() % 2 == 0 ? s.substring((s.length() / 2)-1, (s.length() / 2)+1) : String.valueOf(s.charAt(s.length() / 2));
    }
	
	public static void main(String[] args) {
		No29 test = new No29();
		System.out.println(test.solution("abcde"));
		System.out.println(test.solution("qwer"));
	}
}
