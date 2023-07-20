package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz1_t {

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
				}else {
					for(String m : menus.keySet()) {
						System.out.println(m + " " + menus.get(m) + "원");
					}
				}
				break;
			case "3" : System.out.println("프로그램을 종료합니다."); System.exit(0);
			default: System.out.println("메뉴를 확인 후 다시 입력하세요.");
			}
			System.out.println();
		}
	}
}
