package น้มุ;

import java.util.Scanner;

public class no10872 {
	static int factory = 1;
	public static int fac(int num) {
		if(num ==0) return factory;
		else{
			factory *= num;
			return fac(num-1);			
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		fac(x);
		System.out.println(factory);
	}

}
