package maps;

import java.util.HashMap;

public class Exam1 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		
		hm.put(0, "test");  //.put 키와 값을 추가 (만약 저장이 되어있으면 값만 수정됨)
		hm.put(1, "hello");
		
		System.out.println(hm.get(0)); //.get 키의 값을 보여줌
		System.out.println(hm.get(1));

	}

}
