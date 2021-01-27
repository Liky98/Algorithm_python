package น้มุ;

import java.util.Scanner;

public class no2581 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int M = scan.nextInt();
	int N = scan.nextInt();
	scan.close();
	int array[] = new int[N-M+1];
	int count = 0;
	int sum = 0;

	
	if(M==1 && N ==1);
	else if((M==2 || M ==1) && N==2) {
		array[0] = 2;
		count++;
	}
	else {
		for(int i =M; i<= N; i++) {
			if(i==1) continue;
			else if (i==2) {
				array[count] = 2;
				count++;
				continue;
			}
			for(int j=2; j<i; j++) {
				if(i%j ==0 ) break;
				if(i ==j+1) {
					array[count] = i;
					count++;
				}
			}
			
		}
	}
	if(count == 0) System.out.println(-1);
	else {
		for(int i =0; i<array.length; i++) {
			sum += array[i];
		}
		System.out.println(sum);
		System.out.println(array[0]);

		}
	}

}
