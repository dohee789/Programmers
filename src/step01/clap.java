/*
 * ���̰� n�̰�, "���ڼ��ڼ��ڼ�...."�� ���� ������ �����ϴ� ���ڿ��� �����ϴ� �Լ�
 * ������� n�� 4�̸� "���ڼ���"�� �����ϰ� 3�̶�� "���ڼ�"�� �����ϸ� �˴ϴ�.
 */
package step01;

public class clap {
	public static String solution(int n) {

		String answer = "";

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				answer += "��";
			} else {
				answer += "��";
			}
		}
		return answer;
	}

	public static String solution2(int n) {

		String answer = "";

		for (int i = 0; i < n; i++)
			answer += i % 2 == 0 ? "��" : "��";
		return answer;
	}
	
	//new String(char[])�� ���� ���� ����.
	//n/2 ������ ������, +1�� ���� ������ "��"���� ������ ��.
	//replace() �޼ҵ带 ����Ͽ� char���� �⺻���� "\0"�� "����"���� ��ü�Ѵ�.
	//substring() �޼ҵ带 ����Ͽ� 0��° ���ں��� �����ؼ� n��° ���� �ձ��� �ڸ���.
	public static String solution3(int n){
        return new String(new char [n/2+1]).replace("\0", "����").substring(0,n);
    }

	public static void main(String[] args) {
		System.out.println(solution3(6));
	}

}
