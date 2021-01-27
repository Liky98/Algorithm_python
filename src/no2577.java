package น้มุ;

import java.util.Scanner;

public class no2577 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int number[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		
		String mix = Integer.toString(a*b*c);
		String zz[] = mix.split("");
		
		for(int i=0; i<mix.length(); i++) {
			switch (zz[i]) {
			case "0" : number[0]+=1; break;
			case "1" : number[1]+=1;break;
			case "2" : number[2]+=1;break;
			case "3" : number[3]+=1;break;
			case "4" : number[4]+=1;break;
			case "5" : number[5]+=1;break;
			case "6" : number[6]+=1;break;
			case "7" : number[7]+=1;break;
			case "8" : number[8]+=1;break;
			case "9" : number[9]+=1; break;
			default:
				break;
			}
//			if(zz[i] == "0")
//				number[0] += 1;
//			else if(zz[i] == "1")
//				number[1] += 1;
//			else if(zz[i] == "2")
//				number[2] += 1;
//			else if(zz[i] == "3")
//				number[3] += 1;
//			else if(zz[i] == "4")
//				number[4] += 1;
//			else if(zz[i] == "5")
//				number[5] += 1;
//			else if(zz[i] == "6")
//				number[6] += 1;
//			else if(zz[i] == "7")
//				number[7] += 1;
//			else if(zz[i] == "8")
//				number[8] += 1;
//			else 
//				number[9] += 1;
//			System.out.print("");
		}
		
		for(int i=0; i<10; i++)
			System.out.println(number[i]);
		scan.close();
	}

}
