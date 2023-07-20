package arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		/*
	 	-회원 등록 : 이름(중복 허용), 전화번호(중복 허용), 이메일(중복 허용 안됨)
	 	-회원 확인 : 이메일로 검색하여 있으면 이름, 전화번호, 이메일 출력 / 없으면 없음 출력
	 	-회원 삭제 : 이메일로 검색하여 있으면 이름, 전화번호, 이메일 삭제 / 없으면 없음 출력
	 	-회원 수정 : 이메일로 검색하여 있으면 이름과 전화번호 수정 / 없으면 없음 출력
	 */
	
Scanner sc = new Scanner(System.in);
	
	ArrayList<String> names = new ArrayList<>();
	ArrayList<String> mobiles = new ArrayList<>();
	ArrayList<String> emails = new ArrayList<>();
	String tel = "", mail = ""; 
	int index = 0;
	
	while(true) {
		System.out.println("1. 회원 등록");
		System.out.println("2. 회원 확인");
		System.out.println("3. 회원 삭제");
		System.out.println("4. 회원 모두 보기");
		System.out.println("5. 회원 수정");
		System.out.println("6. 프로그램 종료");
		System.out.print("선택 > ");
		String select = sc.next();
		
		switch (select) {
		case "1" : 
				System.out.println("=== 회원 등록 ===");
				System.out.print("이메일 : ");
				mail = sc.next();
				if(emails.contains(mail) == false) {
				emails.add(mail);
				System.out.print("전화번호 : ");
				tel = sc.next();
				mobiles.add(tel);
				System.out.print("이름 : ");
				names.add(sc.next());
				System.out.println("등록되었습니다.");
			}else {
				System.out.println("등록된 이메일입니다.");
			}
			break;
		case "2" : 
			System.out.print("이메일 : ");
			mail = sc.next();
			index = emails.indexOf(mail);
			if(index != -1) {
				System.out.println("이름 : " + names.get(index)); //get메서드 쓰려면 index값이 필요하다
				System.out.println("전화번호 : " + mobiles.get(index));
				System.out.println("이메일 : " + emails.get(index));
			}else {
				System.out.println("미등록 정보입니다.");
			}
			break;
		case "3" : 
			System.out.print("이메일 : ");
			mail = sc.next();
			index = emails.indexOf(mail);
			if(index != -1) {
				System.out.println("이름 : " + names.remove(index));
				System.out.println("전화번호 : " + mobiles.remove(index));
				System.out.println("이메일 : " + emails.remove(index));
				System.out.println("정보가 삭제되었습니다.");
			}else {
				System.out.println("미등록 정보입니다.");
			}
			break;
		case "4" : 
			if(names.isEmpty() == false) { // (name.size() != 0) 으로 할 수도 있음 
				for(int i = 0; i < names.size(); i++) {
					System.out.println("이름 : " + names.get(i));
					System.out.println("전화번호 : " + mobiles.get(i));
					System.out.println("이메일 : " + emails.get(i));
					System.out.println();
				}
			}else {
				System.out.println("등록된 정보가 없습니다.");
			}
			break;
			
		case "5" :
			System.out.print("이메일 : ");
			mail = sc.next();
			index = emails.indexOf(mail);
			if(index != -1) {
				
				System.out.print("이름 수정 입력 : ");
				String name = sc.next();
				names.set(index, name); 
				System.out.print("전화번호 수정 입력 : ");
				tel = sc.next();
				mobiles.set(index, tel); 
				System.out.println("회원 정보 수정이 완료되었습니다.");
			}break;
			
			
			
		case "6" : System.out.println("프로그램을 종료합니다."); System.exit(0);
		default: System.out.println("메뉴를 확인 후 다시 입력하세요.");
		}
		System.out.println();
		}
	}
}