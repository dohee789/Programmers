/*
 * 두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수
   예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
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
