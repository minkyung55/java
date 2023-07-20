package arrays;

import java.util.Scanner;

public class Quiz11_t {

	public static void main(String[] args) {
		
		//무한배열 만들기 (입력아래에 전 수부터 출력.)
		
		Scanner sc = new Scanner(System.in);
		
		int dataCount = 0;
		int[] arr = new int[3];
		while(true) {
			for(int i = dataCount; i < arr.length; i++) {
			
				while(true) {
					try {
						System.out.print("입력(현재길이:" + arr.length + ") : ");
						arr[i] = sc.nextInt();
					} catch (Exception e) {
						sc.nextLine();
						continue;
					}
					break;
				}
				
				dataCount++;
				for(int j = 0; j < dataCount;j++)
					System.out.print(arr[j] + ",");
				System.out.println();
			}
			
			// 아래부분은 원래 있는 값 복사해주는 과정 
			int[] tmp = arr;
			arr = new int[dataCount+3];
			
			for(int i = 0; i < tmp.length; i++) {
				arr[i] = tmp[i];
			}
			
		}
		
		
	}

}
