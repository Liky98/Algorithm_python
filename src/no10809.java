package ����;

import java.util.Scanner;

public class no10809 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String S = scan.nextLine();
		scan.close();
		
		for(int j = 97; j<123; j++) { //a�� �ƽ�Ű�ڵ� =97, z�� �ƽ�Ű�ڵ� = 122
			for(int i = 0; i< S.length(); i++) {
				int a = S.charAt(i);

				if(a==j) {
					System.out.print(i + " ");
					break;			
					}
				if(i == S.length()-1) 
					System.out.print("-1 ");	
			}
		}	
		
	}
}
