/*
 * String�� �迭 seoul�� element�� "Kim"�� ��ġ x�� ã��, "�輭���� x�� �ִ�"�� String�� ��ȯ�ϴ� �Լ�
 * seoul�� "Kim"�� ���� �� ���� ��Ÿ���� �߸��� ���� �ԷµǴ� ���� �����ϴ�.
 */
package step01;

import java.util.Arrays;

public class kim {
	
	public static String solution(String[] seoul) {
		String answer = "";
		for(int i = 0; i < seoul.length; i++) {
			if(seoul[i] == "Kim") {
				answer = "�輭����" + i + "�� �ִ�";
			}
		}
		return answer;
	}
	
	public static String solution2(String[] seoul) {
        String answer = "";

        for(int i = 0; i < seoul.length; i++){
            if(seoul[i].equals("Kim")){
                answer = "�輭���� " + i + "�� �ִ�";
            }
        }
        
        return answer;
    }

	public static String solution3(String[] seoul){
        //Array(�迭)�� List�� ����
		//indexOf() �� Ư�� ���ڳ� ���ڿ��� �տ������� ó�� �߰ߵǴ� �ε����� ��ȯ
        int x = Arrays.asList(seoul).indexOf("Kim");

        return "�輭���� "+ x + "�� �ִ�";
    }

	public static void main(String[] args) {
		String seoul[] = {"a","b","c","d","e","Kim","f"};
		System.out.println(solution3(seoul));
	}

}


