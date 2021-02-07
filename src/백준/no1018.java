package ����;

import java.util.Scanner;

public class no1018 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		scan.nextLine();
		StringBuffer sbf;
		String test[] = new String[N]; //�ٴ����� �Է��� ���� �ް�
		for(int i=0; i<N; i++)
			test[i] = scan.nextLine();
			
		boolean chess[][] = new boolean [N][M]; // 2���� �迭�����
		for(int i=0; i<N; i++) { //�Ѵܾ 2�����迭�� �ְ� ü���� �׸�.
			sbf = new StringBuffer(test[i]);
			for(int j=0; j<M; j++) {
				if(sbf.charAt(j) == 'W') chess[i][j] = true;
				else chess[i][j] = false;
			}
		}
		
		int min = 64;
		
		for(int i=0; i<=N-8; i++) {
			for(int j=0; j<=M-8; j++) {
				boolean TF = chess[i][j];
				int count = 0;
				for(int x = i; x< i+8; x++) {
					for(int y= j; y< j+8; y++) {
						if(chess[x][y] != TF) count++;
						TF = !TF;
					}
					TF = !TF;
				}
				count =Math.min(count, 64-count);
				if(min > count) min = count;
			}
		}
		
		System.out.println(min);
	}
	

}
