package 백준;


import java.util.*;

public class no2447 {
    static char array[][];

    public static void star (int x, int y, int n) {
    	System.out.println("x = " + x + ", y = " + y + ", n = " + n);
        if (n == 1){
            array[x][y] = '*';
            return;
        }
        
        int m = n/3; //하위 칸으로 줄임. 
        
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                if (i==1 && j==1) continue; // 가운데는 어쩌피 빈칸이니 그냥 다음으로 넘김
                star(x+m*i, y+m*j, m); 
            }
        }
        
    }
    
    public static void main(String args[]) {
    	Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        scan.close();
        
        array = new char[number][number];

        for (int i = 0; i < number; i++) //모든값 ' ' 로 설정.
            Arrays.fill(array[i], ' '); 

        star(0, 0, number);
        
        for (int i = 0; i < number; i++)  // 모든값 출력
            System.out.println(array[i]);
        
    }
}