package น้มุ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no1541 {

	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz = new StringTokenizer(bfr.readLine(), "-");
		
		String a[] = new String[stz.countTokens()];


		for(int i=0; i<stz.countTokens(); i++) {
			a[i] = stz.nextToken();
			System.out.println(a[i]);	
		}
		
//		String temp = null;

		
//		while(stz.hasMoreTokens()) {
//			if(stz.nextToken() == "-" || stz.nextToken() == "+") {
//				v.add(temp);
//				temp = null;
//				v.add(stz.nextToken());
//			}
//			else {
//				temp.concat(stz.nextToken());
//				if(stz.nextToken()==null) v.add(temp);
//			}
//		}
//		
//		for(int i=0; i<v.size(); i++) 
//			System.out.println(v.get(i));
//		
	
	
	}

}
