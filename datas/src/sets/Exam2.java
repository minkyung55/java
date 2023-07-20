package sets;

import java.util.ArrayList;
import java.util.HashSet;

public class Exam2 {
	
	public static void main(String[] args) {
		// set도 자료형을 쓰지않으면 Object로 저장이 된다!
		
		HashSet hs = new HashSet<>();
		hs.add(123);
		hs.add(1.23);
		hs.add("순대");
		hs.add(1.23);
		System.out.println("HashSet : " + hs);
		
		
	}

}
