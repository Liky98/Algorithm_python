package น้มุ;

import java.util.Scanner;

public class no7568 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int people[][] = new int [N][2];
		for(int i=0; i<N; i++) {
			people[i][0] = scan.nextInt();
			people[i][1] = scan.nextInt();
		}
		scan.close();
		
		for(int i=0; i<N; i++) {
			int rank = 1;
			for(int j=0; j<N; j++) 
				if(people[i][0] < people[j][0] && people[i][1] < people[j][1])
					rank++;
			System.out.println(rank);
		}
	}
}
//int N = scan.nextInt();
//int x[] = new int[N];
//int y[] = new int[N];
//for(int i=0; i<N; i++) {
//	x[i] = scan.nextInt();
//	y[i] = scan.nextInt();
//}
//scan.close();
//int maxX = 0;
//int maxY = 0;
//int countX = 0;
//int countY = 0;
//int rank[] = new int[N];
//int count = 1;
//for(int i = 0; i<N; i++) {
//	if(maxX < x[i]) {
//		maxX =x[i];
//		countX = i;
//	}
//	if(maxY < y[i]) {
//		maxY = y[i];
//		countY = i;
//	}
//if(countX == countY) {
//	rank[countX] = count;
//	count ++;
//	maxX = 0;
//	}
//}
//