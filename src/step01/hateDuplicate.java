/*
 * �迭 arr�� �־����ϴ�. �迭 arr�� �� ���Ҵ� ���� 0���� 9������ �̷���� �ֽ��ϴ�. 
 * �̶�, �迭 arr���� ���������� ��Ÿ���� ���ڴ� �ϳ��� ����� ���� �����Ϸ��� �մϴ�. 
 * ��, ���ŵ� �� ���� ������ ��ȯ�� ���� �迭 arr�� ���ҵ��� ������ �����ؾ� �մϴ�.
 * ���� ���,
 * arr = [1, 1, 3, 3, 0, 1, 1] �̸� [1, 3, 0, 1] �� return �մϴ�.
 * arr = [4, 4, 4, 3, 3] �̸� [4, 3] �� return �մϴ�.
 * �迭 arr���� ���������� ��Ÿ���� ���ڴ� �����ϰ� ���� ������ return 
 */
package step01;

import java.util.ArrayList;

public class hateDuplicate {
	
	public static int[] solution(int []arr) {
		int[] answer = {};
		ArrayList<Integer> list = new ArrayList<Integer>();
		int num = 10;//������ 0-9�����̹Ƿ� 10�̸� ������ if�� ����
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
