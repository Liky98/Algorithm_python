package น้มุ;

import java.util.Scanner;

public class no10870 {
	public static int f(int x) {
		if(x == 0) return 0;
		if(x == 1) return 1;
		return f(x-1) + f(x-2);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(f(scan.nextInt()));
		scan.close();
	}

}
