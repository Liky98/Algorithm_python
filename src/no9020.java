package πÈ¡ÿ;

import java.util.Scanner;

public class no9020 {
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
		int T = scan.nextInt();
		for(int t = 0; t<T; t++) {
			int N = scan.nextInt();	
			array = new boolean[10000]; // default = false
			Eratos();

			for(int i = 0; i<(N/2); i++) {
				if(!array[N/2 - i] && !array[N/2 + i]) {
					System.out.println((N/2 -i) + " " + (N/2 +i));
					break;
				}
		}
		
		}
	}
	
}
