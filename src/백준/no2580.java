package 백준;

import java.util.ArrayList;
import java.util.Scanner;

public class no2580 {
	static int array[][] = new int [9][9];
	static ArrayList<int []> list = new ArrayList<int[]>();
	
	public static void backTracking(int depth) {
		if(depth == list.size()) {
			for(int i=0; i<9; i++) { 
				for(int j =0; j<9; j++) {
					System.out.print(array[i][j] + " ");	
				}
				System.out.println();
			}
			System.exit(0);//다출력했으면 종료함.
		}
		
		else {
			int x = list.get(depth)[0];
			int y = list.get(depth)[1];
			for(int i = 1; i<=9; i++) {
				if(check(x,y,i)) {
					array[x][y] = i;
					backTracking(depth+1);
					array[x][y] = 0;
				}
			}
		}
	}
	
	
	public static boolean check(int x, int y, int num) {
		for(int i=0; i<9; i++)
			if(array[x][i] == num) return false;
		
		for(int i=0; i<9; i++)
			if(array[i][y]==num) return false;
		
		int xx = x/3 *3;
		int yy = y/3 *3;
		for(int i= xx; i<xx+3; i++)
			for(int j = yy; j<yy+3; j++)
				if(num == array[i][j]) return false; 
		
		return true;
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i<9; i++) //2차원 배열 입력받음.
			for(int j=0; j<9; j++)
				if((array[i][j] = scan.nextInt()) ==0)
					list.add(new int [] {i,j});
		backTracking(0);
	
	}

}
