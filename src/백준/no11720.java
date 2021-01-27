package 백준;

import java.util.Scanner;

public class no11720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int a[] = new int[scan.nextInt()];
		int sum = 0;
		String x = scan.next();
		for(int i=0; i<a.length; i++) {
			a[i] = x.charAt(i) -'0'; //charAt은 아스키코드값을 반환하기에 '0'(48)을 빼줘야함.
			sum += a[i];
		}
		
		System.out.println(sum);
	}

}
