package arraylists;

import java.util.ArrayList;

public class Exam03 {

	public static void main(String[] args) {
		
	ArrayList<Integer> list = new ArrayList<Integer>();   //Integer으로 자료형지정!
		
		/* 자료형안에는 기본자료형은 안됨 ex)int,char 등 
		 	Wrapper Class (객체자료형,클래스자료형)
		 	- Byte
		 	- Short
		 	- Character
		 	- Integer
		 	- Long
		 	- Float
		 	- Double
		 	- Boolean
		 */

		 Integer data1 = 10;
		 Integer data2 = 20;
		 int data5 = 100; // 이렇게 써도 상관없음
		 
		 Double data3 = 1.1;
		 Double data4 = 2.2;
		 
		
		 list.add(10);
		list.add(data2);
		list.add(data5);
		
		System.out.println("리스트의 저장된 데이터 수 : "+ list.size());
		
		for(int i = 0; i < list.size(); i++) 
			System.out.println("데이터 : " + list.get(i));
		
		for(int i : list) { //(Integer i : list) 도 가능 
			System.out.println("데이터 : " + i);
		}
		
		// double형은 출력이 안됨! 
		
		
	}

}