package Programmers;

//코딩테스트 연습 > 연습문제 > [1차] 비밀지도
//https://school.programmers.co.kr/learn/courses/30/lessons/17681

/*
	- 문제 설명 -	
	지도는 한 변의 길이가 n인 정사각형 배열 형태로, 각 칸은 "공백"(" ") 또는 "벽"("#") 두 종류로 이루어져 있다.
	전체 지도는 두 장의 지도를 겹쳐서 얻을 수 있다. 
	각각 "지도 1"과 "지도 2"라고 하자. 지도 1 또는 지도 2 중 어느 하나라도 벽인 부분은 전체 지도에서도 벽이다. 
	지도 1과 지도 2에서 모두 공백인 부분은 전체 지도에서도 공백이다.
	"지도 1"과 "지도 2"는 각각 정수 배열로 암호화되어 있다.
	암호화된 배열은 지도의 각 가로줄에서 벽 부분을 1, 공백 부분을 0으로 부호화했을 때 얻어지는 이진수에 해당하는 값의 배열이다.

	- 입출력 예 -
	매개변수	값												|	매개변수	값
	n		5												|	n		6
	arr1	[9, 20, 28, 18, 11]								|	arr1	[46, 33, 33, 22, 31, 50]
	arr2	[30, 1, 21, 17, 28]								|	arr2	[27, 56, 19, 14, 14, 10]
	출력		["#####", "# # #", "### #", "#  ##", "#####"]	|	출력		["######", "###  #", "##  ##", " #### ", " #####", "### # "]
*/

public class No30 {

	public String[] solution(int n, int[] arr1, int[] arr2) { // 나의 풀이
		String[] answer = new String[n];

		for (int i = 0; i < n; i++) {
			String str = "";
			String line1 = getBinary(n, arr1[i]);
			String line2 = getBinary(n, arr2[i]);

			for (int j = 0; j < n; j++) {
				if (line1.charAt(j) == '1' || line2.charAt(j) == '1') {
					str += "#";
				} else {
					str += " ";
				}
			}
			answer[i] = str;
		}
		return answer;
	}

	private String getBinary(int n, int num) {
		String binary = "";
		
		for (int i = 0; i < n - Integer.toBinaryString(num).length(); i++) {
			binary += "0";
		}
		return binary + Integer.toBinaryString(num);
	}

	public String[] another(int n, int[] arr1, int[] arr2) { // 다른 사람 풀이
		String[] result = new String[n];
		for (int i = 0; i < n; i++) {
			result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
		}

		for (int i = 0; i < n; i++) {
			result[i] = String.format("%" + n + "s", result[i]);
			result[i] = result[i].replaceAll("1", "#");
			result[i] = result[i].replaceAll("0", " ");
		}

		return result;
	}

	public static void main(String[] args) {
		No30 test = new No30();

		int[] arr1 = { 9, 20, 28, 18, 11 };
		int[] arr2 = { 30, 1, 21, 17, 28 };
		for (String v : test.solution(5, arr1, arr2)) {
			System.out.print(v + "\t");
		}
		
		System.out.println();

		int[] arr3 = { 46, 33, 33, 22, 31, 50 };
		int[] arr4 = { 27, 56, 19, 14, 14, 10 };
		for (String v : test.another(6, arr3, arr4)) {
			System.out.print(v + "\t");
		}
	}
}
