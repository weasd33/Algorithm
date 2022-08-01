package Programmers;

//코딩테스트 연습 > 연습문제 > 자연수 뒤집어 배열로 만들기
//https://school.programmers.co.kr/learn/courses/30/lessons/12932

/*
	- 문제 설명 -
	
	자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 
	예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

	- 제한 조건 -
	
	n은 10,000,000,000이하인 자연수입니다.
*/

public class No13 {
	
	public static int[] solution(long n) {

		String s = "" + n; // 배열 크기를 위한 숫자 길이 측정
		
		int[] answer = new int[s.length()];
		int count = 0;
		
		while(n > 0) {
			answer[count] = (int) (n % 10);
			n /= 10;
			count++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		for(int v : solution(12345)) {
			System.out.print(v + " ");
		}
	}
}
