package arrays;

import java.util.Scanner;

public class Quiz10 {

	public static void main(String[] args) {
		
		//예제 9번 참고해서 하기! 
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("===== 아파트 입주자 정보 =====");
		System.out.print("건물의 층수를 입력하세요 : ");
		int floor = input.nextInt();
		String[][] arr = new String[floor][];
		
		int i, room=0;
		
		for (i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "층의 총 호실 입력 : ");
			room = input.nextInt();
			arr[i] = new String[room];
		}

		
		System.out.println("각 호실의 입주자 정보를 입력하세요");
		System.out.println("1층 정보를 입력하세요.");
		for (i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				
				System.out.println();
				
				System.out.print(i+1+"층"+(int)(j+1)+"호실: ");
				arr[i][j] = input.nextLine();
				 
			}
		}
		
		for (i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
				
			}System.out.println();
		}
		
		
		
		
		
	}

}
