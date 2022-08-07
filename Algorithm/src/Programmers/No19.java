package Programmers;

//코딩테스트 연습 > 연습문제 > 수박수박수박수박수박수?
//https://school.programmers.co.kr/learn/courses/30/lessons/12922

/*
	- 문제 설명 -
	길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 
	예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.
	
	- 제한 조건 -
	n은 길이 10,000이하인 자연수입니다.
*/

public class No19 {
	
	public String solution1(int n) { // 나의 풀이
        String answer = "";
        
        for(int i = 0; i < n; i++) {
        	answer += i % 2 == 0 ? "수" : "박";
        }
        
        return answer;
    }
	
	public String solution2(int n) { // 다른 사람 풀이
		// 빈 char 배열은 \0으로 먼저 생성된다.
		return new String(new char [n/2+1]).replace("\0", "수박").substring(0,n);
	}
	
	public static void main(String[] args) {
		No19 test = new No19();
		System.out.println(test.solution1(3));
		System.out.println(test.solution2(4));
	}
}
