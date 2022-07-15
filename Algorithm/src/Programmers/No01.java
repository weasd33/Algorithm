package Programmers;

import java.util.Scanner;
import java.util.stream.IntStream;

// 코딩테스트 연습 > 연습문제 > 직사각형 별찍기
// https://school.programmers.co.kr/learn/courses/30/lessons/12969

/*
	- 문제 설명 -
	
	이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
	별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.
	
	- 제한 조건 -
	
	n과 m은 각각 1000 이하인 자연수입니다.
*/

public class No01 {
	
	/*
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// n = 가로, m = 세로
		int n, m;
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// n = 가로, m = 세로
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		IntStream.range(0, n).forEach(s -> sb.append("*"));
		IntStream.range(0, m).forEach(s -> System.out.println(sb.toString()));
	}
}
