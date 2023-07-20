package arrays;

import java.util.Scanner;

public class Quiz12_t {

	public static void main(String[] args) {//이게 while문이라서 변수를 따로 만들어서 arr[i]에 넣지않고 변수를 만들어 따로 넣는건가?? 싶음
		
		//무한배열 만들기 (무한배열, 중복금지)
		
		Scanner sc = new Scanner(System.in);
		
		int dataCount = 0;
		int[] arr = new int[3];
		while(true) {
			for(int i = dataCount; i < arr.length; i++) {
				int iTmp;
				while(true) {
					try {
						System.out.print("입력(현재길이:" + arr.length + ") : ");
						iTmp = sc.nextInt();
					} catch (Exception e) {
						sc.nextLine();
						continue;
					}
					
					//퀴즈 11번에서 아래 내용만 추가 
					
					boolean result = true;
					for(int j = 0; j < dataCount; j++) {
						if(arr[j] == iTmp) {
							System.out.println("중복!");
							result = false;
							break;
						}
					}
					if(result) {
						arr[i] = iTmp;
						break;
					}
				}
				
				// 여기까지만 추가
				
				dataCount++;
				for(int j = 0; j < dataCount;j++)
					System.out.print(arr[j] + ",");
				System.out.println();
			}
			
			int[] tmp = arr;
			arr = new int[dataCount+3];
			
			for(int i = 0; i < tmp.length; i++) {
				arr[i] = tmp[i];
			}
			
		}
	}

}
