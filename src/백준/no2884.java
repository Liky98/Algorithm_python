package ����;
// ��, �� �� �Է��ϸ� �� �ð����� 45�� �� �ð��� ����Ѵ�.
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
