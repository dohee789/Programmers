package step01;

public class stringNum {
	public static boolean solution(String s) {
		boolean answer = true;
		int cnt1 = 0;
		int cnt2 = 0;
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'p') {
				cnt1++;
			} else if (s.charAt(i) == 'y') {
				cnt2++;
			}
		}
		if (cnt1 == cnt2) {
			answer = true;
		} else {
			answer = false;
		}

		return answer;
	}
	
	public static boolean solution2(String s) {
		 s = s.toUpperCase();

	     return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
	}

	public static void main(String[] args) {
		System.out.println(solution("pPoooyY"));

	}

}
