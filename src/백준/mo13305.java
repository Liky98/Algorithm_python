package 백준;

import java.util.Scanner;

public class mo13305 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//입력값 입력받기
		int T = scan.nextInt();
		long km[] = new long[T-1];
		long city[] = new long[T];
		for(int i=0; i<T-1; i++){
			km[i] = scan.nextLong();
		}			
		
		for(int i=0; i<T; i++)
			city[i] = scan.nextLong();
		
		long price = 0;
		
		for(int i=0; i<T-1; i++) {

			if(city[i] > city[i+1]) { //다음부분이 현재부분보다 저렴한가?
				price += km[i]*city[i];//현재가격으로 최소거리 이동. 다음지역으로
			}
			else {//현재 도시가 다음지역보다 더 저렴하니 다음지역까지 keep
				city[i+1] = city[i];
				price += km[i]*city[i]; //마지막도시이면 지금까지값 저장.
			}
		}
		
		System.out.println(price);
	}

}
