package arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz01_t {

	public static void main(String[] args) {
		
		// 연락처 저장 프로그램 만들기
		
		Scanner sc = new Scanner(System.in);
			
			ArrayList<String> names = new ArrayList<>();
			ArrayList<String> mobiles = new ArrayList<>();
			String tel = ""; 
			int index = 0;
			
			while(true) {
				System.out.println("1. 연락처 등록");
				System.out.println("2. 연락처 검색");
				System.out.println("3. 연락처 삭제");
				System.out.println("4. 모두 보기");
				System.out.println("5. 종료");
				System.out.print(">> ");
				String select = sc.next();
				switch (select) {
				case "1" : 
					System.out.print("전화번호 : ");
					tel = sc.next();
					if(mobiles.contains(tel) == false) {
						mobiles.add(tel);
						System.out.print("이름 : ");
						names.add(sc.next());
						System.out.println("등록되었습니다.");
					}else {
						System.out.println("등록된 전화번호입니다.");
					}
					break;
				case "2" : 
					System.out.print("전화번호 : ");
					tel = sc.next();
					index = mobiles.indexOf(tel);
					if(index != -1) {
						System.out.println("이름 : " + names.get(index));
						System.out.println("전화번호 : " + mobiles.get(index));
					}else {
						System.out.println("미등록 정보입니다.");
					}
					break;
				case "3" : 
					System.out.print("전화번호 : ");
					tel = sc.next();
					index = mobiles.indexOf(tel);
					if(index != -1) {
						System.out.println("이름 : " + names.remove(index));
						System.out.println("전화번호 : " + mobiles.remove(index));
						System.out.println("정보가 삭제되었습니다.");
					}else {
						System.out.println("미등록 정보입니다.");
					}
					break;
				case "4" : 
					if(names.isEmpty() == false) {
						for(int i = 0; i < names.size(); i++) {
							System.out.println("이름 : " + names.get(i));
							System.out.println("전화번호 : " + mobiles.get(i));
							System.out.println();
						}
					}else {
						System.out.println("등록된 정보가 없습니다.");
					}
					break;
				case "5" : System.out.println("프로그램을 종료합니다."); System.exit(0);
				default: System.out.println("메뉴를 확인 후 다시 입력하세요.");
				}
				System.out.println();
			}
		}
	}

