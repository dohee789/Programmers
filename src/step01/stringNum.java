/*
 * 대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 
 * 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
 * 예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.
 */
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
