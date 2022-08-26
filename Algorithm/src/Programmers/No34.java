package Programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

//코딩테스트 연습 > 월간 코드 챌린지 시즌1 > 두 개 뽑아서 더하기
//https://school.programmers.co.kr/learn/courses/30/lessons/68644

/*
	- 문제 설명 -
	정수 배열 numbers가 주어집니다. 
	numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
	
	- 제한사항 -
	numbers의 길이는 2 이상 100 이하입니다.
	numbers의 모든 수는 0 이상 100 이하입니다.
	
	- 입출력 예 -
	numbers			result
	[2,1,3,4,1]		[2,3,4,5,6,7]
	[5,0,2,7]		[2,5,7,9,12]
*/

public class No34 {
	
	public int[] solution(int[] numbers) { // 나의 풀이
		HashSet<Integer> set = new HashSet<Integer>(); // Set을 사용해 중복 제거

        for(int i = 0; i < numbers.length-1; i++) {
        	for(int j = i+1; j < numbers.length; j++) {
        		set.add(numbers[i] + numbers[j]);
        	}
        }
        
        // set을 정렬 후 Integer 값을 int 배열로 변환 후 return
        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
	
	public int[] another(int[] numbers) { // 다른 사람 풀이
		int tempVal = 0;
		ArrayList<Integer> arrList = new ArrayList<>();
		
		for(int i = 0; i < numbers.length-1; i++) {
			for(int j = i+1; j < numbers.length; j++) {
				tempVal = numbers[i] + numbers[j]; // tempVal 변수에 먼저 저장
				if(!arrList.contains(tempVal)) { // tempVal에 저장된 값이 배열 내에 존재하지 않는다면 arrList 배열에 추가 
					arrList.add(tempVal);
				}
			}
		}
		
		Collections.sort(arrList); // 오름차순 정렬
		int[] answer = new int[arrList.size()];
		
		for(int i = 0; i < answer.length; i++) {
			answer[i] = arrList.get(i); // ArrayList를 int 배열로 저장
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		No34 test = new No34();
		int[] v1 = {2, 1, 3, 4, 1};
		test.solution(v1);
		for(int v : test.solution(v1)) { System.out.print(v + "\t"); }
		System.out.println();
		int[] v2 = {5, 0, 2, 7};
		for(int v : test.another(v2)) { System.out.print(v + "\t"); }
	}
}
