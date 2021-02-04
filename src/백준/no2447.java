package ����;


import java.util.*;

public class no2447 {
    static char array[][];

    public static void star (int x, int y, int n) {
    	System.out.println("x = " + x + ", y = " + y + ", n = " + n);
        if (n == 1){
            array[x][y] = '*';
            return;
        }
        
        int m = n/3; //���� ĭ���� ����. 
        
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                if (i==1 && j==1) continue; // ����� ��¼�� ��ĭ�̴� �׳� �������� �ѱ�
                star(x+m*i, y+m*j, m); 
            }
        }
        
    }
    
    public static void main(String args[]) {
    	Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        scan.close();
        
        array = new char[number][number];

        for (int i = 0; i < number; i++) //��簪 ' ' �� ����.
            Arrays.fill(array[i], ' '); 

        star(0, 0, number);
        
        for (int i = 0; i < number; i++)  // ��簪 ���
            System.out.println(array[i]);
        
    }
}