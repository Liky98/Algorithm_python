package ����;

import java.util.Scanner;


//����
//���л� ��������� 90%�� �ڽ��� �ݿ��� ����� �Ѵ´ٰ� �����Ѵ�.
//����� �׵鿡�� ���� ������ �˷���� �Ѵ�.
//
//�Է�
//ù° �ٿ��� �׽�Ʈ ���̽��� ���� C�� �־�����.
//
//��° �ٺ��� �� �׽�Ʈ ���̽����� �л��� �� N(1 �� N �� 1000, N�� ����)�� ù ���� �־�����,�̾ N���� ������ �־�����.
//������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.
//
//���
//�� ���̽����� �� �پ� ����� �Ѵ� �л����� ������ �ݿø��Ͽ� �Ҽ��� ��° �ڸ����� ����Ѵ�.
public class no4344 {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int C = scan.nextInt(); //�׽�Ʈ���̽�.
		
		int student[][] = new int[C][]; //�л��� ���� ����.
	

		for(int i=0; i<student.length; i++) {
			float sum = 0;
			float avg = 0;
			float count = 0;

			student[i] = new int [scan.nextInt()]; //2�����迭 �����Ҵ� //���⼭ ������ �׽�Ʈ�� ���������� �ְ� ���;ȴ����� �ȳѾ��
			
			for(int j=0; j<student[i].length; j++) { //�� �� ���ϱ�.
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
