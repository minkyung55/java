package sets;

import java.util.ArrayList;
import java.util.HashSet;

public class Exam4 {
	
	public static void main(String[] args) {
		// set도 자료형을 쓰지않으면 Object로 저장이 된다!
		
		HashSet<String> hs = new HashSet<>();
		
		System.out.println("isEmpty() : " + hs.isEmpty()); //데이터들어가기전이라 true나옴
		boolean bool;
		bool = hs.add("라면");  System.out.println(bool);
		bool = hs.add("고길동");  System.out.println(bool);
		bool = hs.add("현대인");  System.out.println(bool);
		bool = hs.add("고길동");  System.out.println(bool); 
		
		System.out.println("isEmpty() : " + hs.isEmpty()); //데이터가 들어가있어서 false나옴
		
		if(hs.contains("고길동")) { //"고길동" 문자열찾기
			System.out.println("데이터가 존재합니다.");
		}else {
			System.out.println("데이터가 존재합니다.");
		}
	}

}
