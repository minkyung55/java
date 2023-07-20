package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz1_2_t {

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
				sc.nextLine();
				while(true) {
					for(String m : menus.keySet()) {
						System.out.println(m + "\t" + menus.get(m) + "원");
					}
					
					System.out.println("1. 메뉴 수정");
					System.out.println("2. 메뉴 삭제");
					System.out.println("3. 나가기");
					System.out.print(">> ");
					select = sc.nextLine();
					if(select.equals("3"))
						break;
					else if(select.equals("1")) {
						System.out.print("메뉴 수정 : ");
						menu = sc.nextLine();
						if(menus.containsKey(menu) == true) {
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
							sc.nextLine();
							menus.put(menu, price);
							System.out.println(menu +"이/가 수정 되었습니다.");
						}else {
							System.out.println("등록된 메뉴가 아닙니다.");
						}
					}else if(select.equals("2")) {
						System.out.print("메뉴 삭제 : ");
						menu = sc.nextLine();
						if(menus.containsKey(menu) == true) {
							menus.remove(menu);
							System.out.println(menu +"이/가 삭제 되었습니다.");
						}else {
							System.out.println("등록된 메뉴가 아닙니다.");
						}
					}else {
						System.out.println("메뉴를 확인 후 다시 입력하세요.");
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
