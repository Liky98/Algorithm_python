package น้มุ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;


public class no2751 {

	public static void main(String[] args) throws IOException{
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(bfr.readLine());
		ArrayList<Integer> array = new ArrayList<Integer>();
		for(int i = 0 ; i<T; i++)
			array.add(Integer.parseInt(bfr.readLine()));
		
		Collections.sort(array);
		
		for(int i=0; i<T; i++)
			bfw.write(array.get(i) + "\n");
		
		bfw.flush();
		bfw.close();
	}

}
