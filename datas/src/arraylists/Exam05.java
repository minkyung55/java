package arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();   // 앞에 자료형지정하면 뒤에 자료형은 생략가능 
		
		String data1 = "김변수";		
		String data2 = "이변수";		
		String data3 = "박변수";
		
		list.add(data1);
		list.add(data2);
		list.add(data3);
		list.add("최변수");
		
		// indexOf는 찾는 데이터(문자열/정수 등)가 없으면 -1을 반환한다.
		//lastindexOf는 뒤에서부터 인덱스번호 찾음  * 중간에서 찾는건 만들어가야함
		
		System.out.println("list.indexOf(\"최변수\")): " + list.indexOf("최변수"));
		System.out.println("list.indexOf(\"최상수\")): " + list.indexOf("최상수"));
		System.out.print("데이터 확인 : ");
		String tmp = sc.next();
		
		int index = list.indexOf(tmp);  //문자열의 위치 찾기
		if(index != -1) {
			System.out.println(list.get(index) + "는 존재합니다.");
		}else
			System.out.println(tmp + "는 존재하지 않습니다.");
	}

}