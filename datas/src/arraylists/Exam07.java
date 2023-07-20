package arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();   // 앞에 자료형지정하면 뒤에 자료형은 생략가능 
		
		String data1 = "김변수";		
		String data2 = "이변수";		
		String data3 = "박변수";
		
		list.add(data1);
		list.add(data2);
		list.add(data3);
		list.add("최변수");
		
		
		//remove 사용자가 원하는 데이터 삭제
		
		System.out.println("담겨 있는 모든 데이터 : " + list);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제 데이터 입력(데이터 삭제) : ");
		String tmp = sc.next();
		
		System.out.println("list.remove(tmp) : " + list.remove(tmp));
		System.out.println("담겨 있는 모든 데이터 : " + list);
		
		
		
		// 예외를 발생하지않게 하려면 인덱스번호를 찾고 난 후에 지우면 가능 (아래코드)
		
		System.out.println("삭제 데이터 입력(인덱스 삭제) : ");
		tmp = sc.next();
		int index = list.indexOf(tmp);
		if(index != -1)
			System.out.println("list.remove(tmp) : " + list.remove(index));
		System.out.println("담겨 있는 모든 데이터 : " + list);
	}

}