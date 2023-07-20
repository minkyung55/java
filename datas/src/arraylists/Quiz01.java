package arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		// 연락처 저장 프로그램 만들기
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> name = new ArrayList<>();  
		ArrayList<String> number = new ArrayList<>();
		ArrayList<String> datas = new ArrayList<>();
		
		int sel=0;
		while(true) {
			try {
				System.out.println("1.연락처 등록");
				System.out.println("2.연락처 검색");
				System.out.println("3.연락처 삭제");
				System.out.println("4.모두 보기");
				System.out.println("5.종료");
				System.out.print(">>");
				sel = sc.nextInt();
			} catch (Exception e) {
				sc.nextLine();
				continue;
			}
			
			if(0 < sel && sel <=5)
				break;
		
		
		switch(sel) {
			case 1 : 
				
					System.out.print("이름 : ");
					String nameInfo = sc.next()+" : ";
					
					sc.nextLine();
					
				while(true) {
					System.out.print("전화번호 : ");
					String numInfo = sc.nextLine();
				
					name.add(nameInfo);
					
//					System.out.println("name : "+ name);
//					System.out.println("number : "+ number);
			
					int index = number.indexOf(numInfo);
					if(index != -1) {
						System.out.println("존재한다..중복");
					}else {
						number.add(numInfo);
//						System.out.println("name2 : "+ name);
//						System.out.println("number2 : "+ number);
						
						String data = nameInfo + numInfo;
						datas.add(data);
						
						break;
					}
					
				}
				
			case 2 :
				
				System.out.print("검색 : ");
				String serch = sc.next();
				
				if(datas.contains(serch)) {
					System.out.println(datas);
				}else
					System.out.println(serch + "는 존재하지 않습니다.");
			}
		}
	}

}