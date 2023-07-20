package sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Exam6 {
	
	public static void main(String[] args) {
		// set도 자료형을 쓰지않으면 Object로 저장이 된다!
		
		HashSet<String> hs = new HashSet<>();
		
		hs.add("1.대부");
		hs.add("2.반지의 제왕");
		hs.add("3.겨울왕국");
		hs.add("4.다크나이트");
		hs.add("5.해리포터");
		hs.add("6.공공의 적");
		System.out.println(hs);
		
		Scanner input = new Scanner(System.in);
		System.out.print("삭제 할 책 : ");
		String name = input.nextLine();
		
		//Iterator로 문자열 삭제가능 하지만 그냥 HashSet에 remove를 사용하는게 더 편하다. 그냥 가능하다정도만 알아두기
		
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			if(name.equals(it.next())) {
				System.out.println("삭제완료");
				it.remove();
			}
		}
		System.out.println(hs);
	}

}
