package sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Exam5 {
	
	public static void main(String[] args) {
		// set도 자료형을 쓰지않으면 Object로 저장이 된다!
		
		HashSet<String> hs = new HashSet<>();
		
		hs.add("1.대부");
		hs.add("2.반지의 제왕");
		hs.add("3.겨울왕국");
		hs.add("4.다크나이트");
		hs.add("5.해리포터");
		hs.add("6.공공의 적");
		
		for(String data : hs) {
			System.out.println(data);
		}
		
//위와 아래가 결과나오는게 같다 - 향상for문과 Iterator 사용용도는 비슷하나 향상for문을 많이사용한다 -> 편하고 코드가적음
		
		System.out.println();
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) { //데이터저장공간에 데이터존재유무확인
			String data2 = it.next(); //저장공간에 데이터를 반환해준다 
			System.out.println(data2);
		}
		
		
	}

}
