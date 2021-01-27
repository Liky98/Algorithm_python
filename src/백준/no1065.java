package 백준;

import java.util.Scanner;

public class no1065 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		int count =0;
		
		if(n<100) { //n이 100이 안되면.
			for(int i = 0; i<n; i++) count++;
			System.out.println(count);
		}
		if(n>=100 && n<1000) {	//n이 3자리수 이면.
			count = 99; //1~100까지의 한수 미리 저장.

			for(int i=100; i<=n; i++) {
				int x = i;
				int a = x/100;
				int b = x/10 - a*10;
				int c = x%10;
				
				if(a==b && b==c) {
					count++;
					continue;
					}
				if(a+1 == b && b+1 ==c) {
					count++;
					continue;
				}
				if(a+2 == b && b+2 ==c) {
					count++;
					continue;
				}
				if(a+3 == b && b+3 ==c) {
					count++;
					continue;
				}
				if(a+4 == b && b+4 ==c) {
					count++;
					continue;
				}
				if(c+1 == b && b + 1 == a) {
					count++;
					continue;
				}
				if(c+2 == b && b + 2 == a) {
					count++;
					continue;
				}
				if(c+3 == b && b + 3 == a) {
					count++;
					continue;
				}
				if(c+4 == b && b + 4 == a) {
					count++;
					continue;
				}
			}
				System.out.println(count);
		}
		if(n==1000)
			System.out.println(144);
	}

}
