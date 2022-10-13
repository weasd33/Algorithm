package Programmers;

import java.util.ArrayList;
import java.util.List;

//코딩테스트 연습 > 완전탐색 > 모의고사
//https://school.programmers.co.kr/learn/courses/30/lessons/42840

/*
	- 문제 설명 -
	수포자는 수학을 포기한 사람의 준말입니다. 
	수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 
	수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
	
	1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
	2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
	3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
	
	1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 
	가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
	
	- 제한 조건 -
	시험은 최대 10,000 문제로 구성되어있습니다.
	문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
	가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
	
	- 입출력 예 -
	answers			return
	[1,2,3,4,5]		[1]
	[1,3,2,4,2]		[1,2,3]
	
	- 입출력 예 설명 -
	입출력 예 #1
	
	수포자 1은 모든 문제를 맞혔습니다.
	수포자 2는 모든 문제를 틀렸습니다.
	수포자 3은 모든 문제를 틀렸습니다.
	따라서 가장 문제를 많이 맞힌 사람은 수포자 1입니다.
	
	입출력 예 #2
	
	모든 사람이 2문제씩을 맞췄습니다.
*/

public class No47 {

	public int[] solution(int[] answers) {
		int[] answer = {};
		
		// 각 학생들의 찍는 패턴
		int[] student1 = { 1, 2, 3, 4, 5 };
		int[] student2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] student3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		
		// 각 학생들의 정답 수
		int answer1 = 0, answer2 = 0, answer3 = 0;
		
		for(int i = 0; i < answers.length; i++) {
			// i를 students의 길이로 나눠서 반복 검사 (여기서 i는 answers의 인덱스)
			if(answers[i] == student1[i % student1.length]) answer1++;
			if(answers[i] == student2[i % student2.length]) answer2++;
			if(answers[i] == student3[i % student3.length]) answer3++;
		}
		
		// 고득점자 뽑기
		int max = Math.max(answer1, Math.max(answer2, answer3));
		List<Integer> list = new ArrayList<>();
		
		if(max==answer1) list.add(1);
		if(max==answer2) list.add(2);
		if(max==answer3) list.add(3);
		
		answer = new int[list.size()];
		
		// 배열로 복사
		for(int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		
 		return answer;
	}

	public static void main(String[] args) {
		No47 test = new No47();
		int[] answers = { 1, 2, 3, 4, 5 };
//		int[] answers = { 1, 3, 2, 4, 2 };
		for(int v : test.solution(answers)) {
			System.out.print(v + " ");
		}
	}
}
