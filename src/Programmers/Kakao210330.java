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
        
        //1단계 : 소문자로 치환
        new_id = new_id.toLowerCase();
        
        //2단계 : 사용되는 문자 외에 다른 문자 제거
        new_id = new_id.replaceAll("[^a-z0-9-_.]", "");

        //3단계 : 마침표두개연속(..) 이면 하나로 바꿈
        new_id = new_id.replaceAll("[.]{2,}", ".");
        
        //4단계 : 마침표(.)가 처음이거나 마지막이면 삭제
        new_id = new_id.replaceAll("^\\.|\\.$", "");
        
        //5단계 : 빈 문자열이면 a를 대입
        if(new_id.isEmpty()) new_id = "a";
        
        //6단계 : 16자리 이상이면 처음15자리만 저장, 마지막이 마침표(.)이면 마침표제거
        if(new_id.length()>15) new_id = new_id.substring(0, 15).replaceAll("\\.$", "");
        
        //7단계 : 2자리 이하면 마지막 문자를 3이 될 때 까지 반복
        while(new_id.length()<=2) new_id += new_id.charAt(new_id.length()-1);
        
        answer = new_id;
        return answer;
    }
}
