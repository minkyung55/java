package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Exam6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashMap< String, String> map = new HashMap<>();
		
		map.put("선풍기", "10"); 
		map.put("에어컨", "100");
		map.put("건조기", "100");
		map.put("선풍기", "1000"); // 키값이 중복이라서 아래꺼만 출력됨 
		
		
		Iterator<String> itk = map.keySet().iterator();
		while(itk.hasNext()) {
			String key = itk.next();
			System.out.println(key + " : " + map.get(key));
		}
		
		System.out.println();
		for(String k : map.keySet()) {
			System.out.println(k + " : " + map.get(k));
		}
		
		//Iterator와 향상for문 내용은 똑같고 향상for문을 더 많이 쓴다// 그래도 Iterator도 알아야한다 쓰는 사람이 있음! 
		
		
		System.out.println();
		Iterator<String> itv = map.values().iterator();
		while(itv.hasNext()) {
			String value = itv.next();
			System.out.println(value);
		}
		
		
		System.out.println();
		for(String v : map.values()) {
			System.out.println(v);
		}
		
		
	
	}

}
