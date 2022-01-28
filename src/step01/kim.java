/*
 * String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아, "김서방은 x에 있다"는 String을 반환하는 함수
 * seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.
 */
package step01;

import java.util.Arrays;

public class kim {
	
	public static String solution(String[] seoul) {
		String answer = "";
		for(int i = 0; i < seoul.length; i++) {
			if(seoul[i] == "Kim") {
				answer = "김서방은" + i + "에 있다";
			}
		}
		return answer;
	}
	
	public static String solution2(String[] seoul) {
        String answer = "";

        for(int i = 0; i < seoul.length; i++){
            if(seoul[i].equals("Kim")){
                answer = "김서방은 " + i + "에 있다";
            }
        }
        
        return answer;
    }

	public static String solution3(String[] seoul){
        //Array(배열)을 List로 변경
		//indexOf() 는 특정 문자나 문자열이 앞에서부터 처음 발견되는 인덱스를 반환
        int x = Arrays.asList(seoul).indexOf("Kim");

        return "김서방은 "+ x + "에 있다";
    }

	public static void main(String[] args) {
		String seoul[] = {"a","b","c","d","e","Kim","f"};
		System.out.println(solution3(seoul));
	}

}


