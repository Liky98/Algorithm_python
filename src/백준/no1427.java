package น้มุ;

import java.util.Arrays;
import java.util.Scanner;

public class no1427 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String N = scan.nextLine();
		char array[] = new char[N.length()];
		for(int i =0; i<N.length(); i++) {
			array[i] = N.charAt(i);
		}
		Arrays.sort(array);
		
		for(int i=array.length-1; i>-1; i--)
			System.out.print(array[i]);

	}

}
