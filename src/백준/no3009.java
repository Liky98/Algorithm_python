package น้มุ;

import java.util.Scanner;

public class no3009 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ax = scan.nextInt();
		int ay = scan.nextInt();
		int bx = scan.nextInt();
		int by = scan.nextInt();
		int cx = scan.nextInt();
		int cy = scan.nextInt();
	
		int x = 0 , y = 0;

		if(ax == bx) x= cx;
		else if(ax == cx) x= bx;
		else x= ax;
		
		if(ay == by) y =cy;
		else if(ay == cy) y = by;
		else y = ay;
		
		System.out.println(x + " " + y);
	
	}

	
}
