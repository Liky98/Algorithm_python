package 백준;

import java.util.Scanner;

public class no2579 {
      static int dp[];
      static int array[];
      static int T;
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      //입력값 입력받기
      T = scan.nextInt();
      array =new int [T];
      dp = new int [T];
      
      for(int i=0; i<T; i++)
         array[i] = scan.nextInt();
      
      dp[0] = array[0];
      dp[1] = array[1];
      dp[2] = array[2];
      
      for(int i=3; i<T; i++) {
    	  dp[i] = Math.max((array[i] + array[i-1] + dp[i-3]),(array[i] + dp[i-2]));
      }
	  System.out.println(dp[T-1]);
   }
}