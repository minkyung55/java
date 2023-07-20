package strings;

public class Quiz1 {

	public static void main(String[] args) {
		
		/*
		  "Have a nice day Have a nice day Have a nice day"
		  위 문자열에서 a의 위치를 저장하여 출력하시오.
		  ** 결과 : 1,5,13,17,21,29,33,37,45
		 */
		
		
		String str = new String("Have a nice day Have a nice day Have a nice day");
		
		int count=0;
		
		System.out.print("결과 : ");
		for(int i = 0; i < str.length(); i++) {
			
			
			char data = str.charAt(i);
			
			if( data == 'a') {
				System.out.print(count + " ");
			}
			
			count++;
		}
		
		
		//강사님 방식은 다름.. 체크 할 것!
		
	}
}
