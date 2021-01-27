package 백준;
//두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 
//예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 
//수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다.
//그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
import java.util.Scanner;

public class no3052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int number =10;
		int a[] = new int[number];
		int b[] = new int[number];
		int count = 10;
		for(int i= 0; i<number; i++) {		
			a[i] = scan.nextInt();
			b[i] = a[i]%42;
			for(int j=0; j<i; j++) {
				if(b[i] == b[j]) {
					count--;
					break;
				}
			}
		}
		System.out.println(count);

		scan.close();
		}
}
