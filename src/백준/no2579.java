package 백준;

import java.util.Scanner;

public class no2579 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      //입력값 입력받기
      int T = scan.nextInt();
      int array[] =new int [T+1];
      int dp[]= new int [T+1];
      
      for(int i=1; i<=T; i++)
         array[i] = scan.nextInt();
      
      dp[1] = array[1];
      if(T>=2) dp[2] = array[2]+dp[1];
      
      for(int i=3; i<=T; i++) {
    	  dp[i] = Math.max((array[i] + array[i-1] + dp[i-3]), (array[i] + dp[i-2]));
      }
	  System.out.println(dp[T]);
	  
   }
}