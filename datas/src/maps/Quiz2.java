package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		HashMap< String, String> pws = new HashMap<>();
		HashMap< String, String> names = new HashMap<>();
		
		/*
		 * HashMap을 사용하여 회원 정보 만들기. HashMap을 두 개 만들어서 구성하기. 
		 * 1.회원등록 : id, password, name 3개의 정보를 등록함. 
		 * 			  id는 Key로 password, name은 value로 사용. 
		 * 2.회원검색 : id를 Key로 사용 중이기에 id를 이용하여 회원 정보를 검색하여 출력함. 
		 * 3.회원삭제 : id를 Key로 사용 중이기에 id를 이용하여 회원 정보를 삭제함. 
		 * 4.회원 모두 보기 : 모든 정보 출력함. 
		 * 5.비밀번호 수정 : id를 Key로 사용 중이기에 id를 이용하여 비밀번호를 수정함. 
		 * 6.프로그램 종료 : 프로그램을 종료함.
		 */
		
		while(true) {
			System.out.println("1.회원등록");
			System.out.println("2.회원검색");
			System.out.println("3.회원삭제");
			System.out.println("4.회원모두보기");
			System.out.println("5.비밀번호수정");
			System.out.println("6.프로그램종료");
			System.out.print(">> ");
			String sel = input.next();
			
			switch(sel) {
				case "1" :
					System.out.print("아이디 입력 : ");
					String id = input.next();
					
					System.out.print("비밀번호 입력 : ");
					String pw = input.next();
					
					System.out.print("이름 입력 : ");
					String name = input.next();
				
					pws.put(id, pw);
					names.put(id, name);
					
					System.out.println();
					
					break;
					
				case "2" :
		
					System.out.print("아이디 : ");
					id = input.next();
					
					if(pws.containsKey(id) == true && names.containsKey(id)== true) 
							System.out.println("아이디 : "+ id + " 비밀번호 : " + pws.get(id) + " 이름: "+ names.get(id));
						 System.out.println();
						 break;
						
						
				case "3" : 
					System.out.print("삭제 할 아이디 : ");
					id = input.next();
					
					if(pws.containsKey(id) == true && names.containsKey(id)== true) {
						pws.remove(id);
						names.remove(id);
						break;

					}
				case "4" : 	
					for(String n: names.keySet()) {
						System.out.println("아이디 : "+ n + " 비밀번호 : " + pws.get(n) +" 이름 : " + names.get(n) );
					}System.out.println();
					break;
					
				case "5" :
					System.out.print("아이디검색 : ");
					id = input.next();
					
					if(pws.containsKey(id) == true && names.containsKey(id)== true) {
						System.out.print("비밀번호 수정 : ");
						pw = input.next();
						pws.put(id, pw);
					}System.out.println(names.get(id) + "님 비밀번호 변경되었습니다.");
					System.out.println();
					break;
					
				case "6" : 
					System.out.println("프로그램을 종료합니다."); System.exit(0);
					break;
					
				default: System.out.println("메뉴를 확인 후 다시 입력하세요.");
				System.out.println();
			}
		}

		
		
	
	}

}
