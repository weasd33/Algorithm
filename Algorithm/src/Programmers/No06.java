package Programmers;

//코딩테스트 연습 > 연습문제 > 평균 구하기
//https://school.programmers.co.kr/learn/courses/30/lessons/12944

/*
	- 문제 설명 -
	
	정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.

	- 제한 조건 -
	
	arr은 길이 1 이상, 100 이하인 배열입니다.
	arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.
*/

public class No06 {

	public static double solution(int[] arr) {
		double sum = 0;
		
		for(int v : arr) { sum += v; }
		
		return sum / arr.length;
	}
	
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4}; 
		System.out.println(solution(arr1));
	}
}
