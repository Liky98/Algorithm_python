package ����;

import java.util.Scanner;

public class no2475 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int e = scan.nextInt();
		
		int output = (a*a + b*b + c*c + d*d + e*e)%10;
		System.out.println(output);

	}

}
