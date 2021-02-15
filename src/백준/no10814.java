package น้มุ;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class no10814 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		String array[][] = new String [T][2];
		for(int i = 0 ; i<T; i++) {
			array[i][0] = scan.next();
			array[i][1] = scan.next();
		}
		
		Arrays.sort(array, new Comparator<String[]>() {
			public int compare(String[] a, String[] b) {
				return Integer.parseInt(a[0]) - Integer.parseInt(b[0]);
			}
		});
		
		for(int i=0; i<T; i++) {
			System.out.println(array[i][0] + " " + array[i][1]);
		}
	}

}
