/*
 * 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수
 */
package step01;

public class divisor {

	public static int solution(int n) {
		int answer = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				answer += i;
			}
		}
		return answer;
	}

	public static int solution2(int n){
		int answer = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0)
				answer += i;
		}
		return answer + n;	//자기 자신은 무조겆 약수 포함이니까
	}

	public static void main(String[] args) {
		System.out.println(solution2(6));
	}

}
