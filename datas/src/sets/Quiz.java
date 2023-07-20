package sets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Quiz {
	
	public static void main(String[] args) {
		
		/*
		 *  HashSet을 이용하여 로또 번호 6개 출력하기.(1-45)
		 */
		
		HashSet<Integer> hs = new HashSet<>();
		Random r = new Random();
		
		for(int i = 0; i < 7; i++) {
			int num = r.nextInt(45)+1;
			hs.add(num);
			
		} System.out.println(hs);
		
		//강사님 풀이법도 확인해볼것!
	
	}

}
