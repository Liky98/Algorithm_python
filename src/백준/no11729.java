package 백준;

import java.util.Scanner;

public class no11729 {
	static StringBuilder sb = new StringBuilder();
//n = 도형개수
//	a = 첫번째막대
//	b = 두번째막대
//	c = 세번째 막대
			
	public static void f(int n, int a, int b, int c) {
		if(n==1) {
			sb.append(a + " " + c + '\n');
			return;
		}
		f(n-1, a, c, b); // n-1을 b에다 넣어야 하고 중간은 c임.
		sb.append(a + " " + c + '\n'); // n이 혼자 첫번째 막대에 있으니 세번째 막대로 옮김.
		f(n-1, b, a, c); //두번째 막대에 있는 것들을 c로 이동.
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.close();
		int count =0;
		for(int i = 0; i< N; i++) {
			count = count* 2 +1;
		}
		System.out.println(count);
		f(N, 1, 2, 3);
		System.out.println(sb);
	}

}
