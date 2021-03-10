package น้มุ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no1931 {
	static int T;
	static int[][] array;
	static int max;
	
	static int checkA(int samenum) {
		if(samenum == max) return -1;
		int small=0;
		int temp=24;
		for(int i=0; i<T; i++) {
			if(array[i][0] == samenum)
				if(temp>array[i][1]) {
					small = i;
					temp = array[i][1];
				}			
		}
		if(small == 0) return checkA(samenum+1); 
		else return temp;
	}

	public static void main(String[] args) throws IOException{
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz;

		T = Integer.parseInt(bfr.readLine());
		
		array = new int[T][2];
		for(int i=0; i<T; i++) {
			stz = new StringTokenizer(bfr.readLine());
			array[i][0] = Integer.parseInt(stz.nextToken());
			array[i][1] = Integer.parseInt(stz.nextToken());			
		}
		max = 0;
		for(int i=0; i<T; i++) {
			if(max < array[i][1])
				max = array[i][1];
		}
		
		int maximum =0;
		for(int i=0; i<T; i++){
			int count = 0;
			int t = array[i][1];
			int temp=0;
			while(temp != -1) {
				temp = checkA(t);
				count++;
				t = temp;
			}
			if(maximum < count) maximum = count;
		}
		
		System.out.println(maximum);
	}

}
