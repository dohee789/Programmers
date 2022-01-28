package step01;

import java.util.ArrayList;

public class hateDuplicate {
	
	public static int[] solution(int []arr) {
		int[] answer = {};
		ArrayList<Integer> list = new ArrayList<Integer>();
		int num = 10;//조건이 0-9까지이므로 10이면 무조건 if문 만족
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != num) {
				list.add(arr[i]);
				num = arr[i];
			}
		}
		
		answer = new int[list.size()];
        for (int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }
        
		return answer;
	}
	public static void main(String[] args) {
		int arr[] = {3,3,3,4,4};
		System.out.println(solution(arr));
	}

}
