package ����;

import java.util.Scanner;

//"OOXXOXXOOO"�� ���� OX������ ����� �ִ�.
//O�� ������ ���� ���̰�, X�� ������ Ʋ�� ���̴�.
//������ ���� ��� �� ������ ������ �� �������� ���ӵ� O�� ������ �ȴ�.
//���� ���, 10�� ������ ������ 3�� �ȴ�.
//"OOXXOXXOOO"�� ������ 1+2+0+0+1+0+0+1+2+3 = 10���̴�.
//OX������ ����� �־����� ��, ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
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