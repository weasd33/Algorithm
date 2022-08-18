package Programmers;

//코딩테스트 연습 > 연습문제 > [1차] 다트 게임
//https://school.programmers.co.kr/learn/courses/30/lessons/17682

/*
	- 문제 설명 -
	1. 다트 게임은 총 3번의 기회로 구성된다.
	2. 각 기회마다 얻을 수 있는 점수는 0점에서 10점까지이다.
	3. 점수와 함께 Single(S), Double(D), Triple(T) 영역이 존재하고 각 영역 당첨 시 점수에서 1제곱, 2제곱, 3제곱 (점수1 , 점수2 , 점수3 )으로 계산된다.
	4. 옵션으로 스타상(*) , 아차상(#)이 존재하며 스타상(*) 당첨 시 해당 점수와 바로 전에 얻은 점수를 각 2배로 만든다. 아차상(#) 당첨 시 해당 점수는 마이너스된다.
	5. 스타상(*)은 첫 번째 기회에서도 나올 수 있다. 이 경우 첫 번째 스타상(*)의 점수만 2배가 된다. (예제 4번 참고)
	6. 스타상(*)의 효과는 다른 스타상(*)의 효과와 중첩될 수 있다. 이 경우 중첩된 스타상(*) 점수는 4배가 된다. (예제 4번 참고)
	7. 스타상(*)의 효과는 아차상(#)의 효과와 중첩될 수 있다. 이 경우 중첩된 아차상(#)의 점수는 -2배가 된다. (예제 5번 참고)
	8. Single(S), Double(D), Triple(T)은 점수마다 하나씩 존재한다.
	9. 스타상(*), 아차상(#)은 점수마다 둘 중 하나만 존재할 수 있으며, 존재하지 않을 수도 있다.
	
	0~10의 정수와 문자 S, D, T, *, #로 구성된 문자열이 입력될 시 총점수를 반환하는 함수를 작성하라.
	
	- 입력 형식 -
	"점수|보너스|[옵션]"으로 이루어진 문자열 3세트.
	예) 1S2D*3T
	
	점수는 0에서 10 사이의 정수이다.
	보너스는 S, D, T 중 하나이다.
	옵선은 *이나 # 중 하나이며, 없을 수도 있다.
	
	- 입출력 예 -
	dartResult		answer	 			설명
	 1S2D*3T		  37		1¹ * 2 + 2² * 2 + 3³
	 1D2S#10S		   9		1² + 2¹ * (-1) + 10¹
	 1D2S0T			   3		1² + 2¹ + 0³
	 1S*2T*3S		  23		1¹ * 2 * 2 + 2³ * 2 + 3¹
	 1D#2S*3S		   5		1² * (-1) * 2 + 2¹ * 2 + 3¹
	 1T2D3D#		  -4		1³ + 2² + 3² * (-1)
	 1D2S3T*		  59		1² + 2¹ * 2 + 3³ * 2
*/

public class No28 {
	
	public int solution(String dartResult) {
        int answer = 0;
        
        String n = "";
        int[] value = new int[3]; // 3번의 라운드 점수
        int idx = 0;
        
        for(int i = 0; i < dartResult.length(); i++) {
        	switch(dartResult.charAt(i)) {
        	case '*' :
        		value[idx-1] *= 2;
        		if(idx > 1) { value[idx-2] *= 2; }
        		break;
        	case '#' :
        		value[idx-1] *= -1;
        		break;
        	// S, D, T의 경우 수를 계산 후 다음 배열에 저장하기 위해 idx를 증가하고 n을 초기화 해줘야 한다.
        	case 'S' :
        		value[idx] = (int) Math.pow(Integer.parseInt(n), 1);
        		idx++;
        		n = "";
        		break;
        	case 'D' :
        		value[idx] = (int) Math.pow(Integer.parseInt(n), 2);
        		idx++;
        		n = "";
        		break;
        	case 'T' :
        		value[idx] = (int) Math.pow(Integer.parseInt(n), 3);
        		idx++;
        		n = "";
        		break;
        	default:
        		n += String.valueOf(dartResult.charAt(i));
        		break;
        	}
        }
        
        for(int v : value) { answer += v; }
        
        return answer;
    }
	
	public static void main(String[] args) {
		No28 test = new No28();
		System.out.println(test.solution("1S2D*3T"));
		System.out.println(test.solution("1D2S#10S"));
		System.out.println(test.solution("1D2S0T"));
		System.out.println(test.solution("1S*2T*3S"));
		System.out.println(test.solution("1D#2S*3S"));
		System.out.println(test.solution("1T2D3D#"));
		System.out.println(test.solution("1D2S3T*"));
	}
}









