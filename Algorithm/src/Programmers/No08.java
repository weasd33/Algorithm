package Programmers;

//코딩테스트 연습 > 연습문제 > 최대공약수와 최소공배수
//https://school.programmers.co.kr/learn/courses/30/lessons/12940

/*
	- 문제 설명 -
	
	두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요. 
	배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다. 
	예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.

	- 제한 사항 -
	
	두 수는 1이상 1000000이하의 자연수입니다.
*/

/*
	- 유클리드 호제법 -
	
	최대공약수(gcd) : 두 양의 정수 a, b(a > b)에 대하여 a를 b로 나눈 나머지를 r이라고 정하고,
	 		b를 r로 나눈 나머지를 rm...rm+n이라 할 때 rm+1로 rm을 나눴을 때 0이 되면 rm+1은 최대공약수가 된다.
	 		
	 		ex) a=1071, b=1029
	 		1071 % 1029 == 42 -> rm
	 		1029 % 42 == 21 -> rm+1
	 		42 % 21 == 0 -> 최대공약수 == 21
	 		
	최소공배수(lcm) : 두 자연수의 곱 / 최대공약수
	 		ex) a=72, b=30
	 		72 % 30 == 12 -> rm
	 		30 % 12 == 6 -> rm+1
	 		12 % 6 == 0 -> 최대공약수 == 6
	 		72 x 30 == 2160
	 		2160 / 6 == 360 -> 최소공배수 == 360
*/

public class No08 {

	public static int[] solution(int n, int m) {
		int[] answer = new int[2];
		int max = Math.max(n, m); // 큰 수
		int min = Math.min(n, m); // 작은 수
		
		answer[0] = gcd(max, min);
		answer[1] = ((max * min) / answer[0]);
		
		return answer;
	}
	
	private static int gcd(int max, int min) { // 최대공약수
		if(max % min == 0) { return min; }
		return gcd(min, max % min);
	}

	public static void main(String[] args) {
		solution(3, 12);
	}
}
