package arrays;

import java.util.Random;
import java.util.Scanner;

public class Quiz8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int[][] arr = new int[5][5];
		
		// 랜덤숫자로 했을때 0~9까지
		
		
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				int n = r.nextInt(10);  // arr[i][j] = r.nextInt(10);  이렇게하면 한번에 가능
				arr[i][j] = n;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
				
			}System.out.println();
		}
		
		//랜덤문자열 a~z는 97~122
		
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				int n = r.nextInt(26)+97;  //이것도 arr[i][j] = r.nextInt(26)+97; 한번에 표현가능
				arr[i][j] = n;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print((char)arr[i][j] + "\t");
				
			}System.out.println();
		}
		
	}
}

