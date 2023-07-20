package arrays;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		
		/* 
		  2023년 1월 1일은 토요일입니다. 두 수 a,b를 입력 받아 2023년 a월 b일이 무슨요일인지
		  출력하세요. 요일의 이름은 일요일부터 토요일입니다.
		  예를 들어 a=2, b=22라면 2월 22일은 수요일이므로 문자열 "수요일"을 출력하세요
		  단, 13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다.
		 */
		
		// 요일구하는 방법 앞에 월날짜 + 내가구하고싶은 달 날짜까지  % 7 하면 나머지값으로 구할 수 있음
		
//		String[] week = {"토요일","일요일","월요일","화요일","수요일","목요일","금요일"};
//		int [] year = {31,28,31,30,31,30,31,31,30,31,30,31};
//		
//		int data=0,mon,day;
		Scanner sc = new Scanner(System.in);
//		
//		
//		while(true) {
//			try {
//				System.out.print("월 일 입력 : ");
//				mon = sc.nextInt();
//				day = sc.nextInt();
//			}catch(Exception e){
//				sc.nextLine();
//				continue;
//			} 
//		
//			for(int i = 0; i < mon - 1; i++) {
//				data += year[i];
//				
//			}
//			
//		} 
//		
//		
		// 강사님 풀이
		  	
		  	String[] week;
		  	week = new String[] {"토요일","일요일","월요일","화요일","수요일","목요일","금요일"}; 
		  	
		  	int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		  	int month, day;
		  	
		  	
		  	while(true) {
		  		System.out.print("월 일 입력 : ");
		  		try {
		  			month = sc.nextInt();
		  			day = sc.nextInt();
		  		}catch (Exception e) {
		  			sc.nextLine();
		  			continue;
		  		}
		  		
		  		if(month > 0 && month <= 12 && day >=1 && day <= days[month-1])
		  			break;
		  		
		  	}
		  	
		  	int total = 0; 
		  	for(int i = 0; i < month-1 ; i++){
		  		total += days[i];
		  	}
		  	total += day;
		  	
		  	System.out.printf("2023년 %02d월 %02d일은 %s입니다.", month,day,week[total % 7]);
		  
		 
	
	}
}


