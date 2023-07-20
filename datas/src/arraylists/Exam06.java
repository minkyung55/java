package arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam06 {

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
		
		
		// .isEmpty는 데이터가 여부 확인해줌  데이터가 있으면 false 없으면 true를 반환해줌
		// .clear는 데이터 전부 삭제
		
		System.out.println("담겨 있는 모든 데이터 : " + list);
		System.out.println("데이터 존재 유무 : " + list.isEmpty());
		list.clear();
		System.out.println("담겨 있는 모든 데이터 : " + list);
		System.out.println("데이터 존재 유무 : " + list.isEmpty());
	}

}