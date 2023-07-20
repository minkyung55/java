package sets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Exam7 {
	
	public static void main(String[] args) {
		// set도 자료형을 쓰지않으면 Object로 저장이 된다!
		
		HashSet<String> hs = new HashSet<>();
		
		hs.add("1.대부");
		hs.add("2.반지의 제왕");
		hs.add("3.겨울왕국");
		hs.add("4.다크나이트");
		hs.add("5.해리포터");
		hs.add("6.공공의 적");
		
		//순서정렬하고 싶으면 ArrayList에 넣어서 순서를 만들어야함 (아래코드)
		
		ArrayList<String> list = new ArrayList<>(hs);
		System.out.println(list);
//		list.sort(null); //오름차순
//		System.out.println(list);
		
		Collections.sort(list); // 오름차순
		System.out.println(list);
		
		Collections.reverse(list); // 오름차순 되어있는 데이터를 내림차순으로 변경
		System.out.println(list);
	
	}

}
