package 백준;

import java.io.*;
import java.util.StringTokenizer;
public class no11047 {
	

	public static void main(String[] args) throws IOException{
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer bd = new StringTokenizer(bfr.readLine()); 
		int T = Integer.parseInt(bd.nextToken());
		int money = Integer.parseInt(bd.nextToken());
		
		int array[] = new int[T];
		
		for(int i=0; i<T; i++) { //사용될 돈 단위 입력받음
			array[i] = Integer.parseInt(bfr.readLine());
		}
		int count = 0;
		

			for(int i=array.length-1; i>=0; i--) {
				if(money/array[i] > 0) {
					count += money/array[i];
					money %= array[i];
				}
			}
		
		
		System.out.println(count);
		
	}

}

