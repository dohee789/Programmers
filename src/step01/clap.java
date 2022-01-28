/*
 * 길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수
 * 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.
 */
package step01;

public class clap {
	public static String solution(int n) {

		String answer = "";

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				answer += "수";
			} else {
				answer += "박";
			}
		}
		return answer;
	}

	public static String solution2(int n) {

		String answer = "";

		for (int i = 0; i < n; i++)
			answer += i % 2 == 0 ? "수" : "박";
		return answer;
	}
	
	//new String(char[])를 통해 길이 배정.
	//n/2 절반을 나누고, +1을 통해 무조건 "박"으로 끝나게 함.
	//replace() 메소드를 사용하여 char형의 기본값인 "\0"을 "수박"으로 교체한다.
	//substring() 메소드를 사용하여 0번째 문자부터 시작해서 n번째 문자 앞까지 자른다.
	public static String solution3(int n){
        return new String(new char [n/2+1]).replace("\0", "수박").substring(0,n);
    }

	public static void main(String[] args) {
		System.out.println(solution3(6));
	}

}
