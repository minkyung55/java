package sets;

import java.util.ArrayList;
import java.util.HashSet;

public class Exam3 {
	
	public static void main(String[] args) {
		// set도 자료형을 쓰지않으면 Object로 저장이 된다!
		
		HashSet<String> hs = new HashSet<>();
		
		boolean bool;
		bool = hs.add("라면");  System.out.println(bool);
		bool = hs.add("고길동");  System.out.println(bool);
		bool = hs.add("현대인");  System.out.println(bool);
		bool = hs.add("고길동");  System.out.println(bool); //중복값이라서 false로 나옴
		
		System.out.println("HashSet : " + hs);
		System.out.println(hs.remove("라면")); //있는문자열이라서 삭제됨 true로 나옴 
		System.out.println(hs.remove("김밥")); //없는 문자열이라서 false로 나옴
		System.out.println("HashSet : " + hs);
		
		
	}

}
