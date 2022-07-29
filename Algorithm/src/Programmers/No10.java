package Programmers;

import java.util.stream.IntStream;

//코딩테스트 연습 > 연습문제 > 제일 작은 수 제거하기
//https://school.programmers.co.kr/learn/courses/30/lessons/12935

/*
	- 문제 설명 -
	
	정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 
	단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 
	예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
	
	- 제한 조건 -
	
	arr은 길이 1 이상인 배열입니다.
	인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.
*/

public class No10 {

	public static int[] solution1(int[] arr) { // 나의 풀이
		int[] answer;
		int min = arr[0];
		
		if(arr.length <= 1) { // 빈 배열인 경우 -1 return
			answer = new int[1];
			answer[0] = -1;
			return answer;
		} else {
			answer = new int[arr.length - 1];
			
			for(int v : arr) { // 가장 작은 값을 min 변수에 담음
				if(min > v) { min = v; }
			}
			
			int index = 0;
			for(int i = 0; i < arr.length; i++) {
				if(min == arr[i]) { // 가장 작은 변수 무시
					continue;
				} else {
					answer[index++] = arr[i];
				}
			}
		}

		return answer;
	}
	
	public static int[] solution2(int[] arr) { // 다른 사람 풀이
		if(arr.length == 1) return new int[] {-1};
	    
		int min = IntStream.of(arr).min().getAsInt(); // min() : 가장 작은 값 반환
		return IntStream.of(arr).filter(i -> i != min).toArray(); // 가장 작은 수를 제외 후 나머지 탐색
	}

	public static void main(String[] args) {
//		int[] value = {10};
		int[] value = {16, 7, 26, 257};
		for(int v : solution1(value)) { System.out.print(v + " "); }
		for(int v : solution2(value)) { System.out.print(v + " "); }
	}
}
