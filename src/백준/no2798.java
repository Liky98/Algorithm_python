package น้มุ;

import java.util.Scanner;

public class no2798 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		int Max = scan.nextInt();
		int n[] = new int [T];
		for(int i = 0; i<T; i++)
			n[i] = scan.nextInt();
		scan.close();
		
		int sum = 0;
		for(int i= 0 ; i<T-2; i++) {
			for(int j= i+1; j<T-1; j++) {
				for(int z=j+1; z<T; z++) {
					if(n[i]+n[j]+n[z] <= Max && n[i]+n[j]+n[z] > sum)
						sum = n[i]+n[j]+n[z];
				}
			}
		}
		
		System.out.println(sum);
	}

}
