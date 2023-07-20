package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Exam5 {

	public static void main(String[] args) {
		HashMap< String, Integer> map = new HashMap<>();
		
		map.put("선풍기", 10); 
		map.put("에어컨", 100);
		map.put("건조기", 100);
		System.out.println(map);
		System.out.println(map.keySet()); //
		System.out.println(map.values());
		
		ArrayList<String> keys = new ArrayList<>(map.keySet());
		ArrayList<Integer> vals = new ArrayList<>(map.values());
		
		//자료형은 다르나 같은 계열이다 ArrayList로 표현할 수 있다.
		
		System.out.println(keys);
		System.out.println(vals);

	}

}
