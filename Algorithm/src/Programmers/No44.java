package Programmers;

import java.util.Arrays;

//코딩테스트 연습 > 정렬 > K번째수
//https://school.programmers.co.kr/learn/courses/30/lessons/42748

/*
	- 문제 설명 -
	배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.
	예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면
	array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
	1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
	2에서 나온 배열의 3번째 숫자는 5입니다.
	배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때, 
	commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.
	
	- 제한사항 -
	array의 길이는 1 이상 100 이하입니다.
	array의 각 원소는 1 이상 100 이하입니다.
	commands의 길이는 1 이상 50 이하입니다.
	commands의 각 원소는 길이가 3입니다.
	
	- 입출력 예 -
	array					commands							return
	[1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	[5, 6, 3]
	
	- 입출력 예 설명 -
	[1, 5, 2, 6, 3, 7, 4]를 2번째부터 5번째까지 자른 후 정렬합니다. [2, 3, 5, 6]의 세 번째 숫자는 5입니다.
	[1, 5, 2, 6, 3, 7, 4]를 4번째부터 4번째까지 자른 후 정렬합니다. [6]의 첫 번째 숫자는 6입니다.
	[1, 5, 2, 6, 3, 7, 4]를 1번째부터 7번째까지 자릅니다. [1, 2, 3, 4, 5, 6, 7]의 세 번째 숫자는 3입니다.
*/

public class No44 {

	public int[] solution(int[] array, int[][] commands) { // 나의 풀이
		int[] answer = new int[commands.length];
		int cutArr[] = {}; // 해당 범위 배열 저장
		int idx = 0; // cutArr의 인덱스로 사용
		
		for(int i = 0; i < commands.length; i++) {
			cutArr = new int[commands[i][1] - commands[i][0] + 1]; // commands 배열의 범위만큼의 크기로 생성 
			
			for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
				cutArr[idx] = array[j]; // 해당 범위 원소 저장
				idx++;
			}
			idx = 0;
			Arrays.sort(cutArr); // 정렬
			answer[i] = cutArr[commands[i][2]-1]; // K번째 수 answer배열에 저장
		}
		
		return answer;
	}
	
	public int[] another(int[] array, int[][] commands) { // 다른 사람 풀이
		int[] answer = new int[commands.length];
		
		// 나의 풀이 for문을 Arrays.copyOfRange를 사용한 것 외에 다른 점 없음 
		for(int i = 0; i < commands.length; i++) {
			int[] cutArr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
			Arrays.sort(cutArr);
			answer[i] = cutArr[commands[i][2]-1];
		}
		
		return answer;
	}

	public static void main(String[] args) {
		No44 test = new No44();
		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
		
		for(int v : test.solution(array, commands)) {
			System.out.print(v + " ");
		}
	}
}
