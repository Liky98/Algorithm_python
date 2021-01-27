package 백준;

import java.util.Scanner;


//문제
//대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다.
//당신은 그들에게 슬픈 진실을 알려줘야 한다.
//
//입력
//첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
//
//둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고,이어서 N명의 점수가 주어진다.
//점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
//
//출력
//각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
public class no4344 {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int C = scan.nextInt(); //테스트케이스.
		
		int student[][] = new int[C][]; //학생의 수와 점수.
	

		for(int i=0; i<student.length; i++) {
			float sum = 0;
			float avg = 0;
			float count = 0;

			student[i] = new int [scan.nextInt()]; //2차원배열 동적할당 //여기서 마지막 테스트에 마지막점수 넣고 엔터안누르면 안넘어가짐
			
			for(int j=0; j<student[i].length; j++) { //행 값 구하기.
				student[i][j] = scan.nextInt();

				sum += student[i][j];
			}
			
			avg = sum / student[i].length;
			for(int z=0; z<student[i].length; z++)
				if(student[i][z] > avg) count++;
			
			float percent = (100/(float)student[i].length) * count;
			System.out.printf("%.3f", percent);
			System.out.println("%");
		}

		scan.close();
	}
}
//				student[i][j] = scan.nextInt();
//				sum += student[i][j];
//			}
//			avg = sum / N; 
//			
//			for(int j=0; j<N; j++)
//				if(student[i][j] > avg) count++;
//			
//			if(count==0) {
//				System.out.println("error");
//				continue;
//			}
//			
//			float p = 100/ (float)N;
//			float y = count * p; 
//			
//			System.out.printf("%.3f", y);
//			System.out.println("%");
//			avg = 0;
//			sum = 0;
//			count =0;
//		}
//		
//		
//		scan.close();
//	}
//
//}
