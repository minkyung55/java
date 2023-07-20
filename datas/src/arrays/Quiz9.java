package arrays;

import java.util.Random;
import java.util.Scanner;

public class Quiz9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int[][] arr = new int[5][6];
		
		
		for(int row = 0; row < arr.length; row++) { // 행을 나타내는 for문
			
			for(int i = 0; i < arr[row].length; i++ ) {
				arr[row][i] = r.nextInt(45)+1;
				for(int j = 0; j<i; j++) {
					if(arr[row][j] == arr[row][i]) {
						i--;
						break;
					}
					                         
				}
				
			}
		
		
		
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j]= r.nextInt(45)+1;  // arr[i][j] = r.nextInt(10);  이렇게하면 한번에 가능	
				int n = arr[i][j];
				
			}
		}
		}
		
		
		
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
				
			}System.out.println();
		}
		

		
	}
}

