package น้มุ;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class no11651 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		int position[][] = new int [T][2];
		for(int i=0; i<T; i++) {
			position[i][0] = scan.nextInt();
			position[i][1] = scan.nextInt();
		}
		
		Arrays.sort(position, new Comparator<int[]>() {
			public int compare(int a[], int b[]) {
				if(a[1]==b[1]) return a[0]-b[0];
				else return a[1] - b[1];
			}
		});
		
		for(int i=0; i<T; i++) {
			
		
			System.out.println(position[i][0] + " " +position[i][1]);
			
		}
	}

}
