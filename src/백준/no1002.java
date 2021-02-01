package 백준;

import java.util.Scanner;

public class no1002 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int i = 0; i<T; i++) {
			int x1 = scan.nextInt();
			int y1 = scan.nextInt();
			int r1 = scan.nextInt();
			int x2 = scan.nextInt();
			int y2 = scan.nextInt();
			int r2 = scan.nextInt();
			
			if(x1 == x2 && y1 == y2) {// 두 점의 좌표가 같으면
				if(r1 != r2) {//접점없음
					System.out.println(0); 
					continue;
				}
				else { //접점 무한대
					System.out.println(-1);
					continue;
				}
			}
			else {
				double dis = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1,2));
			
				if(dis > r1 + r2 || dis <Math.abs(r1-r2)) System.out.println(0);
			
				else if(dis == r1+r2 || dis == Math.abs(r1-r2)) System.out.println(1);
			
				else System.out.println(2);
			}
		}
		scan.close();

	}

}
