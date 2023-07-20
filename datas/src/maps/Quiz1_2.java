package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz1_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> menus = new HashMap<>();
		String menu = "";
		
		while(true) {
			System.out.println("1. 메뉴 등록");
			System.out.println("2. 메뉴별 가격보기");
			System.out.println("3. 메뉴 종료");
			System.out.print(">> ");
			String select = sc.next();
			switch (select) {
			case "1" : 
				System.out.print("메뉴 이름 : ");
				menu = sc.next();
				if(menus.containsKey(menu)) {
					System.out.println("등록된 메뉴입니다.");
				}else {
					int price = 0 ;
					while(true) {
						try {
							System.out.print("메뉴 가격 : ");
							price = sc.nextInt();
						} catch (Exception e) {
							sc.nextLine();
							continue;
						}
						
						if(price >= 0)
							break;
					}
					menus.put(menu, price);
					System.out.println(menu + "이/가 등록되었습니다.");
				}
				break;
			case "2" : 
				
				if(menus.isEmpty()) {
					System.out.println("등록 후 이용하세요.");
					break;
				}
				System.out.println();
				while(true) {
					for(String m : menus.keySet()) {
						System.out.println(m + " " + menus.get(m) + "원");
					}
					
				System.out.println("1.수정 2.삭제 3.나가기");
				System.out.print(">>> ");
				int num = sc.nextInt();
				
			
				switch(num) {
					case 1 :
							System.out.println("상품명입력 : ");
							menu = sc.next();
						
						if(menus.containsKey(menu)) {
							System.out.println("가격수정해주세요 : ");
							int price = sc.nextInt();
							menus.put(menu, price);
						}break;
					
					case 2 :
						
						System.out.print("상품명입력 : ");
						menu = sc.next();
						if(menus.containsKey(menu)) {
							menus.remove(menu);
						}break;
						
					case 3 :
						break;
					}
				}
				
			case "3" : System.out.println("프로그램을 종료합니다."); System.exit(0);
			default: System.out.println("메뉴를 확인 후 다시 입력하세요.");
			}
			System.out.println();
		}
	}
}
