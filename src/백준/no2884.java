package 백준;
// 시, 분 을 입력하면 그 시간에서 45분 뺀 시간을 출력한다.
import java.util.Scanner;

public class no2884 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int hour = scan.nextInt();
		int minute = scan.nextInt();
		
		if(minute - 45 <0) {
			hour -= 1;
			if(hour<0)
				hour = 23;
			minute = 60 +(minute -45);
		}
		
		else minute -= 45;
	
		System.out.print(hour + " ");
		System.out.print(minute);
		scan.close();
	}
}
