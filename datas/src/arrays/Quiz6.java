package arrays;

import java.util.Random;

public class Quiz6 {

	public static void main(String[] args) {
		
		/*
		 배열을 이용하여 Lotto 프로그램 만들기.
		 난수의 범위 : 1~45
		 중복 되지 않은 6개의 수를 출력하시오.
		 출력의 결과는 오름차순으로 출력하시오.
		 */
		
		
		Random r = new Random();
		
		
		int[] arr = new int[6];
		
		
			System.out.print("번호 : ");
		for(int i = 0 ; i < arr.length; i++ ) {
			int Lotto = r.nextInt(45)+1;
			arr[i] = Lotto;
			
			for(int j = 0; j<i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
				                         
			}
			
		}
		
		for(int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) { // 오름차순
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
					
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		
		/*

		 */
	}
}

