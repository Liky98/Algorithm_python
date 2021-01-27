package 백준;

import java.util.Scanner;

public class no1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int old_new = n;
		int count = 0;
		while(true) {
			
			int a = n/10;//주어진 값의 10의자리
			int b = n%10;//주어진 값의 1의자리
			
			int c = a+b; //처음 주어진 값의 합
			int x = c%10;//처음 주어진 값의 1의자리
			
			n = b*10 + x; //새로 만들어진 값.
			count++;
			if(old_new == n) break;
		}
			System.out.println(count);
			scan.close();
	}

}
