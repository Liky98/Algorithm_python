package น้มุ;

import java.util.Scanner;

public class no1541B {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a[] = scan.nextLine().split("\\-");
		
		int sum= Integer.MAX_VALUE;
		
		for(int i=0; i < a.length; i++) {
			int temp =0;
			String b[] = a[i].split("\\+");
			
			for(int j=0; j<b.length; j++) {
				temp += Integer.parseInt(b[j]);
			}
			if (sum== Integer.MAX_VALUE) {
				sum = temp;
			}
			else sum -= temp;
		}
		System.out.println(sum);
	}

}
