package 백준;

import java.util.Scanner;

//"OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다.
//O는 문제를 맞은 것이고, X는 문제를 틀린 것이다.
//문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다.
//예를 들어, 10번 문제의 점수는 3이 된다.
//"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
//OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
public class no8958 {

   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);

	  String a[] = new String [scan.nextInt()];
	  scan.nextLine();
      for(int i=0; i<a.length; i++) 
    	  a[i] = scan.nextLine();
    	  
      for(int i= 0; i<a.length; i++) {
          int score = 0;
          int sum = 0;
    	  
    	  for(int j=0; j<a[i].length(); j++) {
        	 
    		  if(a[i].charAt(j) == 'O') {
            score++;
            sum += score;
    		  }
            else score = 0;
      
         }
         System.out.println(sum);
      }
      
      scan.close();
   }
}

      
      
      
      
      
      
      
      
      //      Scanner scan = new Scanner(System.in);
//      
//      int testCase = scan.nextInt();
//      String a[][] = new String[testCase][];
//      String std = "O";
//      int score = 0;
//      int sum = 0; 
//      
//      for(int i=0; i<testCase; i++) { 
//         a[i] = new String[0];
//         for(int j=0; scan.hasNext(); j++) {
//            a[i][j] = scan.nextLine();
//               
//         }
//         if(a[i].equals(std)) {
//            score++;
//            sum += score;
//         }
//         else
//            score = 0;
//         }
//      
//      
//      for(int i=0; i<testCase; i++) {
//
//      System.out.println(sum);   
//      scan.close();
//   }
//
//   }}