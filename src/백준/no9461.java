package น้มุ;

import java.util.Scanner;

public class no9461 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int i =0; i<T; i++) {
			int a = scan.nextInt();
			if(a==1 || a==2 || a==3) {
				System.out.println(1);
				continue;
			}
	
			int array[] = new int[a];
			array[0] =1;
			array[1] =1;
			array[2] =1;
			
			for(int j=3; j<a; j++) {
				array[j] = array[j-3] + array[j-2];
			}
			System.out.println(array[a-1]);
		}

	}

}
