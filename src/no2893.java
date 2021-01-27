package น้มุ;

import java.util.Scanner;

public class no2893 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.close();
		
		int five = N/5;
		int three = (N%5)/3;

		if(five*5 + three*3 != N) {
			int count= 0;
			if(N%3==0) System.out.println(N/3);
			else {
			while(true) {
				if(N %3 != 0) {
					N -= 5;
					count++;
					if(N<=0) {
						System.out.println(-1);
						break;
					}
				}
				else {
					System.out.println(N/3 + count);
					break;
				}

				
			}		
			}
		}
		else
			System.out.println(five + three);
	}
}

//if((N%5)%3 != 0 ) {
//	if(N>4 &&(N%5+5)%3 == 0) {
//		five = N/5-1;
//		three = (N%5+5)/3;				
//	}
//	else if(N%3 != 0) {
//	five = 0;
//	three = -1;
//	}
//	else {
//		five = 0;
//		three = N/3;
//	}
//}
//
