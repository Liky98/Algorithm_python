package πÈ¡ÿ;

import java.util.Scanner;

public class no1929 {
	public static boolean array[];
	
	public static void Eratos() {
		array[0] = array[1] = true;
		
		for(int i = 2; i <= Math.sqrt(array.length); i++) { //¡¶∞ˆ±Ÿ
			if(array[i] == true) continue; 
			for(int j = i * i; j < array.length; j += i) {
				array[j] = true;
			}
		}
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int M = scan.nextInt();
		int N = scan.nextInt();
		scan.close();
		
		array = new boolean[N+1]; // default = false
		Eratos();
		for(int i = M; i<=N; i++) {
			if(array[i] == false) System.out.println(i);
		}
	}
	
}