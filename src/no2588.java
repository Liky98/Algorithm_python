package ����;

import java.util.Scanner;

public class no2588 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int No1 = scan.nextInt();
		int No2 = scan.nextInt();
		
		int No3 = No2%10;//1���ڸ�
		int No4 = (No2%100)/10;//10���ڸ�
		int No5 = No2 / 100; //100���ڸ�
		
		System.out.println(No1 * No3);
		System.out.println(No1 * No4);
		System.out.println(No1 * No5);
		
		System.out.println(No1*No2);
		scan.close();
	}

}
