package arrays;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		
		/*  문제 못풀었음 ㅠㅠ 아래는 강사님 풀이
		int[] st = new int[4] 배열을 만들어 
		국어,영어,수학,총점,평균을 구하는 프로그램을 작성하세요.
		** 0~100사이의 점수만 입력되도록 구현
		** 필요한 것이 있다면 자유롭게 추가(평균 값을 위한 실수형 변수 등)
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
//		int[] st = new int[4]; 
		String[] sub = new String[] {"국어", "영어", "수학"};
		int[] st = new int[sub.length + 1];
		
		for(int i = 0; i < sub.length; i++) {
			
			while(true) {
				System.out.print(sub[i] + "점수 : ");
				
				try {
					st[i] = sc.nextInt();
				}catch(Exception e) {
					sc.nextLine();
					continue;
				}
				
				if(st[i] >= 0 && st[i] <= 100)
					break;
			}
			
			st[sub.length] += st[i];
		}
				
		System.out.println("총점 : " + st[sub.length]);
		System.out.println("평균 : " + st[sub.length]/(double)sub.length);
		
		
	}

}
