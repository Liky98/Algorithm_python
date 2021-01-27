package น้มุ;

import java.util.Scanner;

public class no9498 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		
		if(A>89)
			System.out.println("A");
		else if(79<A && A<90)
			System.out.println("B");
		else if(69<A && A <80)
			System.out.println("C");
		else if(59<A && A < 70)
			System.out.println("D");
		else
			System.out.println("F");
		
		scan.close();
	}

}
