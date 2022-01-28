package step01;

public class middle {
	public static String solution(String s) {
		String answer = "";
		if(s.length() % 2 == 0) {
			int index = s.length() % 2;
			//answer = s.charAt(index);
		}
		return answer;
	}
	public static void main(String[] args) {
		System.out.println(solution("abcde"));
	}

}
//길이 짝수 개수는 홀수개 만약 4면 2로 나눈 위치값 6이면 abcdefg