package arraylists;

import java.util.ArrayList;

public class Exam02 {

	public static void main(String[] args) {
		
		//자료형을 꼭 넣어야 하는건 아니지만 자료형을 넣고 쓰는걸 권고함! 주로 자료형 하나 지정해서 사용함 
		
		ArrayList<String> list = new ArrayList<String>();   //String으로 자료형지정!
		
		
		list.add("1");
		list.add("1.1");
		list.add("문자열");
		list.add("문");
		
		
		for(int i = 0; i < list.size(); i++) 
			System.out.println("데이터 : " + list.get(i));
		
		for(String s : list) {
			System.out.println("데이터 : " + s);
		}
		
		
		
		
	}

}
