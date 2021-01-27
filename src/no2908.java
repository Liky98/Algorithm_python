package น้มุ;

import java.io.*;
public class no2908 {

	public static void main(String[] args) throws IOException{
		int x[] = new int[2];
		for(int i=0; i<2; i++) {
			int a = System.in.read() -'0';
			int b = System.in.read()-'0';
			int c = System.in.read()-'0';
			int line = System.in.read();
			x[i] = c*100 + b*10 + a;
		}
		if(x[0] > x[1]) System.out.println(x[0]);
		else System.out.println(x[1]);
	}
}
