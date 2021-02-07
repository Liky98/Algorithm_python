package น้มุ;

import java.util.Scanner;

public class no1436 {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int T = scan.nextInt();
      scan.close();
      int count = 0;
      int i = 0;
      while(T != count) {
         i++;
         if(String.valueOf(i).contains("666") == true) count++;
         
      }
      System.out.println(i);
   }

}