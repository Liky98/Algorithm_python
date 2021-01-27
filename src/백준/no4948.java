package πÈ¡ÿ;

import java.util.Scanner;

public class no4948 {
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
		while(true) {
			int N = scan.nextInt();
			if(N==0) return;		
		array = new boolean[2*N+1]; // default = false
		Eratos();
		int count = 0;
		for(int i = N+1; i<=2*N; i++) 
			if(array[i] == false) count++;
		System.out.println(count);
		}
	}
	
}