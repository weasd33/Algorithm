package Programmers;

//코딩테스트 연습 > 월간 코드 챌린지 시즌1 > 3진법 뒤집기
//https://school.programmers.co.kr/learn/courses/30/lessons/68935

/*
	- 문제 설명 -
	자연수 n이 매개변수로 주어집니다. 
	n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.
	
	- 제한사항 -
	n은 1 이상 100,000,000 이하인 자연수입니다.
	
	- 입출력 예 -
	n	result
	45	7
	125	229
	
	- 입출력 예 설명 -
	입출력 예 #1

	n (10진법)	n (3진법)		앞뒤 반전(3진법)	10진법으로 표현
	45			1200		0021			7
	따라서 7을 return 해야 합니다.
	
	입출력 예 #2
	
	n (10진법)	n (3진법)		앞뒤 반전(3진법)	10진법으로 표현
	125			11122		22111			229
	따라서 229를 return 해야 합니다.
*/

public class No36 {
	
	public int solution(int n) {
        String ternary = "";
        
        while(n > 0) {
        	ternary += n % 3; // 3진법 바로 뒤집기
        	n /= 3;
        }
        
        return Integer.parseInt(ternary, 3);
    }
	
	public static void main(String[] args) {
		No36 test = new No36();
		System.out.println(test.solution(49));
	}
}
