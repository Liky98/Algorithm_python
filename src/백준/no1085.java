package น้มุ;

import java.util.Scanner;

public class no1085 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N[] = new int[4];
		for(int i = 0; i<N.length; i++)
			N[i] = scan.nextInt();
		
		N[2] -= N[0];
		N[3] -= N[1];
		
		int min = N[0];
		
		for(int i=1; i<4; i++) 
			if(min>N[i])
				min = N[i];
		
		System.out.println(min);
		
	}

}
