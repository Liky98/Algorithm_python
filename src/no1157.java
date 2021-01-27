package น้มุ;

import java.io.*;
public class no1157 {

	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		String input = bfr.readLine();
		int a[] = new int [26];
		bfr.close();
		for(int i=0; i<input.length(); i++) {
			if((int)input.charAt(i) >64 && (int)input.charAt(i) <91) {
				a[(int)input.charAt(i)-65] +=1;
			}
			if((int)input.charAt(i) >96 && (int)input.charAt(i) <123) {
				a[(int)input.charAt(i)-97] +=1;
			}
		}
		int max = a[0];
		int maxNumber = 0;
		char output = (char)(maxNumber+65);
		for(int i=1; i<26; i++) {
			if(max < a[i]) {
				max = a[i];
				maxNumber = i;
				output = (char)(maxNumber+65);
			}		
			else if(max == a[i]) {
				output = '?';
			}
		}
		System.out.println(output);
	}

}
