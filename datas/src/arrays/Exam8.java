package arrays;

import java.util.Scanner;

public class Exam8 {

	public static void main(String[] args) {
		//이차원 배열 
		
		int arr[][] =  new int [5][5];
		int data = 1;
		
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = data++;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	
	}

}
