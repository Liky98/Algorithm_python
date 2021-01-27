package น้มุ;

import java.util.Scanner;

public class no1193 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();
		scan.close();
		int sum = 0;
		int i= 0;
		while(true) {
			if(sum+1<= X && X <= sum+i) {
				if(i%2==0) {
					int count = X - sum;
					System.out.println(count + "/" + (i+1-count));
					break;
				}
				else {
					int count = X - sum;
					System.out.println((i+1-count) + "/" + count );
					break;
				}
			}
			else {
				sum += i;
				i++;
			}
		}

	}

}
