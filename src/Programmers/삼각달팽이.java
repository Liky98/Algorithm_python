package Programmers;

import java.util.ArrayList;


public class ªÔ∞¢¥ﬁ∆ÿ¿Ã {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution2 a = new Solution2();
		System.out.println(a.solution(5));
	}
}
class Solution2 {
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> answer =new ArrayList<Integer>();
        int temp = n;
        int array[][] = new int[n][n];
        int count =1;
        int condition =1;
        int tempX =-1;
        int tempY =0;
        
        while(n>0) {
        	if(condition ==1) {
        		for(int i=0; i<n; i++) {
        			tempX++;
        			array[tempX][tempY] = count;
        			count++;
        		}
        		n--;
        		condition =2;
        	}
        	else if(condition ==2) {
        		for(int i=0; i<n; i++) {
        			tempY++;
        			array[tempX][tempY] = count;
        			count++;
        		}
        		n--;
        		condition =3;
        	}
        	else if(condition ==3) {
        		for(int i=0; i<n; i++) {
        			tempX--;
        			tempY--;
        			array[tempX][tempY] = count;
        			count++;
        		}
        		n--;
        		condition = 1;
        	}
        }
        
        int countTemp =0;
        for(int i=0; i<temp; i++) {
        	for(int j=0; j<temp; j++) {
        		if(array[i][j] != 0) {
        			answer.add(array[i][j]);
        			countTemp++;
        		}
        	}
        }
        
        return answer;
    }
}

        
        
//        boolean tf = true;
//        int count = 1;
//    	int tempX =0;
//    	int tempY =0;
//    	
//        for(int i=0; i<n; i++) {
//        	
//        	if(tf) {
//        		while(true) {
//        			array[tempX][tempY] = count;
//        			tempX++;
//        			count++;
//        			if(tempX == array.length) {
//        				i++;
//        				break;
//        			}
//        		}
//        		while(true) {
//        			array[tempX][tempY] = count;
//        			tempY++;
//        			count++;
//        			if(tempY == array.length) {
//        				tf=false;
//        				break;
//        			}
//        		}
//        	}
//        	
//        	else {
//
//        	}
//        }
//        
