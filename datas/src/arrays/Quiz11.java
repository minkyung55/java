package arrays;

import java.util.Scanner;

public class Quiz11 {

	public static void main(String[] args) {
		
		//무한배열 만들기 (입력아래에 전 수부터 출력.)
		
		Scanner sc = new Scanner(System.in);
		
		int n = 3;
		int num;
		int[] arr = new int [n];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("입력(현재길이:"+ n +") :");
			num = sc.nextInt();
			arr[i] = num;
			
			for(int j = i-1; j<i; j++) {
			System.out.println(arr[j]);
			}
		}
			
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +", ");
		}
		
		
		
	}

}
