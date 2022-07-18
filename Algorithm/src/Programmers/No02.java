package Programmers;

import java.util.Scanner;

// 코딩테스트 연습 > 연습문제 > x만큼 간격이 있는 n개의 숫자
// https://school.programmers.co.kr/learn/courses/30/lessons/12954

/*
	- 문제 설명 -
	
	함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 
	다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.

	- 제한 조건 -
	
	x는 -10000000 이상, 10000000 이하인 정수입니다.
	n은 1000 이하인 자연수입니다.
*/
public class No02 {

	public static long[] solution(int x, int n) {
		long[] answer = new long[n];
		for(int i = 0; i < n; i++) {
			answer[i] = (long) (i + 1) * x;	
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long[] value = solution(sc.nextInt(), sc.nextInt());
		for(long v : value) { System.out.print(v + " "); }
		
		sc.close();
	}
}
