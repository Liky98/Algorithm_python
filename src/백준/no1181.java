package น้มุ;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class no1181 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		scan.nextLine();
		String array[] = new String[T];
		for(int i=0; i<T; i++) 
			array[i] = scan.nextLine();
		
		
		Arrays.sort(array, new Comparator<String>() {
			public int compare(String a, String b) {
				if(a.length() == b.length()) return a.compareTo(b);
				else return a.length() - b.length();
			}
		});
		System.out.println(array[0]);
		for(int i=1; i<T; i++) {
			if(!array[i].equals(array[i-1]))
			System.out.println(array[i]);
			
		}
	}

}
