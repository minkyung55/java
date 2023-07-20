package arraylists;

import java.util.ArrayList;

public class Exam01 {

	public static void main(String[] args) {
		
		//자료형을 꼭 넣어야 하는건 아니지만 자료형을 넣고 쓰는걸 권고함! 주로 자료형 하나 지정해서 사용함 
		
		ArrayList list = new ArrayList();
		// ArrayList<String> list = new ArrayList<String>();  // String으로 자료형지정!
		
		/*
		 	<자료형> : Generic   지정하면 그 자료형 제외한 나머지는 오류가 난다.
		 */
		
		
		// ArrayList가 자료형을 다 받을 수 있는건 Object자료형이기 때문
		list.add(1);
		list.add(1.1);
		list.add("문자열");
		list.add('문');
		
		
		System.out.println("데이터 : " + list.get(0));
		System.out.println("데이터 : " + list.get(1));
		System.out.println("데이터 : " + list.get(2));
		System.out.println("데이터 : " + list.get(3));

		//Object는 최상위 이것보다 높은건 없다.  Object는 부모자료형 이라서 자식자료형을 다 담을 수 있다는 개념! 
		//Object는 자료형상관없이 다 넣을 수 있다.  단점은 다른변수에 저장할때 형변환 해야함!
		
		
		Object data1 = 1;
		Object data2 = 1.1; 
		
		int data3 = (int)data1;  // 다른 변수에 넣을 때 같은 정수의 값이지만 Object에 썼을 경우에는 형변환을 꼭 해줘야한다.
		double data4 = (double)data2;
		
		
		
	}

}
