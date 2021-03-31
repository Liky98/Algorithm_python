package Programmers;

import java.util.*;

public class Kakao210330 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		Solution b = new Solution();
		System.out.println(b.solution(a));
	}


}

class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        //1�ܰ� : �ҹ��ڷ� ġȯ
        new_id = new_id.toLowerCase();
        
        //2�ܰ� : ���Ǵ� ���� �ܿ� �ٸ� ���� ����
        new_id = new_id.replaceAll("[^a-z0-9-_.]", "");

        //3�ܰ� : ��ħǥ�ΰ�����(..) �̸� �ϳ��� �ٲ�
        new_id = new_id.replaceAll("[.]{2,}", ".");
        
        //4�ܰ� : ��ħǥ(.)�� ó���̰ų� �������̸� ����
        new_id = new_id.replaceAll("^\\.|\\.$", "");
        
        //5�ܰ� : �� ���ڿ��̸� a�� ����
        if(new_id.isEmpty()) new_id = "a";
        
        //6�ܰ� : 16�ڸ� �̻��̸� ó��15�ڸ��� ����, �������� ��ħǥ(.)�̸� ��ħǥ����
        if(new_id.length()>15) new_id = new_id.substring(0, 15).replaceAll("\\.$", "");
        
        //7�ܰ� : 2�ڸ� ���ϸ� ������ ���ڸ� 3�� �� �� ���� �ݺ�
        while(new_id.length()<=2) new_id += new_id.charAt(new_id.length()-1);
        
        answer = new_id;
        return answer;
    }
}
