/*
 * �� ���� a, b�� �־����� �� a�� b ���̿� ���� ��� ������ ���� �����ϴ� �Լ�
   ���� ��� a = 3, b = 5�� ���, 3 + 4 + 5 = 12�̹Ƿ� 12�� �����մϴ�.
 */
package step01;

public class sum {

	public static long solution1(int a, int b) {
		int x = 0, y = 0;
		long sum = 0;

		if (a == b) {
			return a;
		} else if (a < b) {
			x = a;
			y = b;
		} else if (b < a) {
			x = b;
			y = a;
		}

		for (int i = x; i <= y; i++) {
			sum += i;
		}

		return sum;
	}
	
	public static long solution2(int a, int b) {
	      long answer = 0;
	      if(a!=b){
	          for(int i=Math.min(a,b);i<=Math.max(a,b);i++){
	              answer+=i;
	          }
	      }else{
	          answer=a;
	      }
	      return answer;
	  }

	public static void main(String[] args) {
		System.out.println(solution2(1,10));
	}

}
