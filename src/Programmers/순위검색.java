package Programmers;

import java.util.*;

public class 순위검색 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a[] = {"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
		String b[] = {"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"};
		Solution c = new Solution();
		System.out.println(c.solution(a,b));
	}


}

class Solution {
    public int[] solution(String[] info, String[] query) {
        int[] answer = {};
        return answer;
    }
}