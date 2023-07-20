package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashMap< String, Integer> map = new HashMap<>();
		
		
		int sel=0;
		
		while(true) {
			
			try {
				
				System.out.println("1.메뉴 등록");
				System.out.println("2.메뉴별 가격 보기");  //전체목록확인
				System.out.println("3.종 료");
				System.out.print(">>> ");
				sel = input.nextInt();
				
			} catch (Exception e) {
				input.nextLine();
				System.out.println("다시 입력해주세요");
				continue;
			}
			
			
			if(sel == 3) {
			System.out.println("프로그램을 종료합니다.");
			break;
			}
		
		
		switch(sel) {
			case 1 : 
				
				System.out.print("상품명입력 : ");
				String name = input.next();
				System.out.print("가격입력 : ");
				int price = input.nextInt();
				
				if (!(map.containsKey(name))) {
					map.put(name, price);
				} break;
			
			case 2 : 
				System.out.println(map + "\n");
				break;
				
				
				
			
			}
		
		
		} //while
		
		
	
	}

}
