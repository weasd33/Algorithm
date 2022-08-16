package Programmers;

import java.util.Arrays;

//코딩테스트 연습 > 연습문제 > 나누어 떨어지는 숫자 배열
//https://school.programmers.co.kr/learn/courses/30/lessons/12910

/*
	- 문제 설명 -
	array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
	divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
	
	- 제한 조건 -
	arr은 자연수를 담은 배열입니다.
	정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
	divisor는 자연수입니다.
	array는 길이 1 이상인 배열입니다.
	
	- 입출력 예 -
	arr = [5, 9, 7, 10], divisor = 5, return = [5, 10]
	arr = [2, 36, 1, 3], divisor = 1, return = [1, 2, 3, 36]
	arr = [3, 2, 6], divisor = 10, return = [-1]
*/

public class No27 {

	public int[] solution1(int[] arr, int divisor) { // for문 사용
        int cnt = 0;
        int arrCnt = 0;
        
        for(int v : arr) {
        	if(v % divisor == 0) {
        		cnt++;
        	}
        }
        
        if(cnt == 0) {
        	int[] answer = {-1};
        	return answer;
        }
        
        int[] answer = new int[cnt];
        
        for(int v : arr) {
        	if(v % divisor == 0) {
        		answer[arrCnt] = v;
        		arrCnt++;
        	}
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
	
	public int[] solution2(int[] arr, int divisor) { // stream 사용
		int[] answer = Arrays.stream(arr).filter(idx -> idx % divisor == 0).toArray();
		if(answer.length == 0) {
			answer = new int[] {-1};
		}
		Arrays.sort(answer); // Arrays.sort의 반환 형태는 void이기 때문에 초기 스트림 잡을 때나 return에 함께 작성 불가능
        return answer;
    }
	
	public static void main(String[] args) {
		No27 test = new No27();
		int[] arr1 = {5, 9, 7, 10};
		int[] arr2 = {2, 36, 1, 3};
		int[] arr3 = {3, 2, 6};
		
		for(int v : test.solution1(arr1, 5)) { System.out.print(v + " "); }
		for(int v : test.solution1(arr2, 1)) { System.out.print(v + " "); }
		for(int v : test.solution1(arr3, 10)) { System.out.print(v + " "); }
		System.out.println("\n---------------------------");
		for(int v : test.solution2(arr1, 5)) { System.out.print(v + " "); }
		for(int v : test.solution2(arr2, 1)) { System.out.print(v + " "); }
		for(int v : test.solution2(arr3, 10)) { System.out.print(v + " "); }
	}
}
