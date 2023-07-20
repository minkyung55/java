package arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();   // 앞에 자료형지정하면 뒤에 자료형은 생략가능 
		
	
		list.add("김상수");
		list.add("이변수");
		list.add("박참조");
		list.add("조클래스");
		list.add("지컬렉션");
		
		//.set은 인덱스 위치에 있는 데이터를 지우고 내가 입력한 값으로 바꿔준다 
		//.add는 인덱스 위치에 내가 입력한 값을 추가한다 인덱스 크기가 늘어남 (5개값이 있으면 6으로 늘어남) 
		
		System.out.print("변경할 위치 : ");
		Scanner input = new Scanner(System.in);
		int index = input.nextInt();
		
		System.out.print("변경 데이터 : ");
		String element = input.next();
		list.set(index, element); // Update
//		list.add(index, element); // Insert
		
		
		
		System.out.println(list);
		System.out.println("===== 결과 =====");
		for(int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
	}

}