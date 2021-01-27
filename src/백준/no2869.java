package น้มุ;

import java.io.*;
import java.util.StringTokenizer;
public class no2869 {

	public static void main(String[] args) throws IOException{
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz = new StringTokenizer(bfr.readLine()," ");

		int A = Integer.parseInt(stz.nextToken());
		int B = Integer.parseInt(stz.nextToken());
		int V = Integer.parseInt(stz.nextToken());

		int day = (V-B) / (A-B);
			if((V-B) % (A-B) != 0)
				day ++;
		System.out.println(day);
//		int count = 1;
//		int sum = 0;
//		while(true) {
//			sum+=A;
//			if(sum >= V) {
//				break;
//			}
//			sum -= B;
//			count++;
//		}
//		
//		System.out.println(count);
	}

}
