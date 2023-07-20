package arrays;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("생성할 배열의 길이를 입력 : ");
		int length = sc.nextInt();
		
		String result = "", total ="";
		
		int[] data = new int[length];
		System.out.println(length + "개의 배열이 생성되었습니다.");
		System.out.println("데이터를 입력하세요.");
		result = sc.nextLine(); 
		
		for(int i=0; i < length; i++) {
			
			System.out.print(i + 1 +"번째 데이터 : ");
			result = sc.nextLine();
			total = total + result+" ";
		} System.out.print("배열데이터 : " + total + "입니다.");

		//강사님은 for문 한번 더 해서 int로 나타냈음, 강사님 풀이(인터넷) 참고할것 (퀴즈5번 강사님 풀이 토대로 추가들어간것!)
		
	}
}



