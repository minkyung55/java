package arrays;

import java.util.Scanner;

public class Quiz13 {

	public static void main(String[] args) {
		
		//숙박 관리 프로그램 
		
		Scanner sc = new Scanner(System.in);
		
		String[][] admin = new String [2][3];
		
		while(true) {
			System.out.println("1. 입실");
			System.out.println("2. 퇴실");
			System.out.println("3. 전체보기");
			System.out.println("4. 종료");
			System.out.print(">>");
			int sel = sc.nextInt();
			
			switch(sel) {
				case 1 : 
					System.out.println("입실 호수 선택 : " );
					int romnum = sc.nextInt();
					String name = sc.next();
				case 2 :
					
			}
			
			
		
		}
		
		
		
		
	}

}
