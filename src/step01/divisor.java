/*
 * ���� n�� �Է¹޾� n�� ����� ��� ���� ���� �����ϴ� �Լ�
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
		return answer + n;	//�ڱ� �ڽ��� ������ ��� �����̴ϱ�
	}

	public static void main(String[] args) {
		System.out.println(solution2(6));
	}

}
