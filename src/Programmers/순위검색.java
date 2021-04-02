package Programmers;

import java.util.*;


public class 순위검색 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a[] = {"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
		String b[] = {"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"};
		Solution1 c = new Solution1();
		System.out.println(c.solution(a,b));
	}


}

class Solution1 {
    public int[] solution(String[] info, String[] query) {
        int[] answer = new int[query.length];
        String array01[][] = new String[info.length][5];
        String array02[][] = new String[query.length][5];
        String temp[][] = new String[query.length][5];
        
        for(int i=0; i<info.length; i++) {
        	array01[i]=info[i].split(" ");
        }
        
        for(int i=0; i<query.length; i++) {
        	temp[i] = query[i].split(" and ");
        	array02[i][0] = temp[i][0];
        	array02[i][1] = temp[i][1];
        	array02[i][2] = temp[i][2];
        	String temp02[] = temp[i][3].split(" ");
        	array02[i][3] = temp02[0];
        	array02[i][4] = temp02[1];
        }
        // 위에까지 입력 받은 것들.
        
        int countArray[] = new int[query.length];
        for(int i=0; i<countArray.length; i++) {
        	int count =0;
        	for(int z=0; z<array01.length; z++) {//array02[z] 조건에 맞는 모든 array01을 찾아라
            	boolean tf = true;
        		for(int j=0; j<4; j++) {//첫번째
        			if(array02[i][j].equals(array01[z][j]) || array02[i][j].equals("-")) {
        			}
        			else tf=false;
        		}
        		if(Integer.parseInt(array02[i][4])<=Integer.parseInt(array01[z][4]) || array02[i][4].equals("-")) {}
        		else tf=false;
        		
        		if(tf) count++;
        	}
        	countArray[i] = count;
        }
        
        answer = countArray;
     
//        for(int i=0; i<array01.length; i++) {
//        	for(int j=0; j<array01[i].length; j++) {
//        		System.out.print(array01[i][j]+ " ");}
//        	System.out.println();
//        }
//        System.out.println();
//        for(int i=0; i<array02.length; i++) {
//        	for(int j=0; j<array02[i].length; j++) {
//        		System.out.print(array02[i][j]+ " ");}
//        	System.out.println();
////        }
//        System.out.println(answer[0]);
//        System.out.println(answer[1]);
//        System.out.println(answer[2]);
//        System.out.println(answer[3]);
//        System.out.println(answer[4]);
//        System.out.println(answer[5]);
        
        return answer;
    }
}