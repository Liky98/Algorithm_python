package น้มุ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class no10989 {

	public static void main(String[] args) throws IOException{
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(bfr.readLine());
		//ArrayList<Integer> array = new ArrayList<Integer>();
		int a[] = new int[T];
		for(int i = 0 ; i<T; i++)
		a[i] = (Integer.parseInt(bfr.readLine()));
		
		Arrays.sort(a);
		
		for(int i=0; i<T; i++)
			bfw.write(a[i] + "\n");
		
		bfw.flush();
		bfw.close();
	}

}

