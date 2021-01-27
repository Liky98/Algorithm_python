package น้มุ;
import java.util.Scanner;

public class no2941 {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		char x[] = new char[a.length()];
		int count = 0;
		
		for(int i = 0; i<a.length(); i++){
			x[i] = a.charAt(i);
		}
		
		for(int i = 0; i<a.length(); i++) {
		if(i<x.length-1) {
			if(x[i] == 'c' && (x[i+1] == '-' || x[i+1] == '='))
				i++;
				
			if (x[i] == 'd') { 
				if(x[i+1] == '-') 
					i++;
				
				else if (i< x.length-2)
					if( x[i+1] == 'z' && x[i+2] == '=' ) 
						i+=2;
			}
			
			if(x[i] == 'l' && x[i+1] == 'j')
				i++;
				
			if(x[i] == 'n'  && x[i+1] == 'j')
				i++;
					
			if(x[i] == 's' && x[i+1] == '=')
				i++;
				
			if(x[i] == 'z' && x[i+1] == '=')
				i++;
		}
			count++;
		}
		System.out.println(count);
		scan.close();
	}
}



