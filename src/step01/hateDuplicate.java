/*
 * 배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다. 
 * 이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다. 
 * 단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다.
 * 예를 들면,
 * arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
 * arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
 * 배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 
 */
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
