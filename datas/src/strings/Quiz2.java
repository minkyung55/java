package strings;

public class Quiz2 {

	public static void main(String[] args) {
		
		/*
		  "It is a fun java programming" 문자열에서
		  'a'의 개수와 'g'개수와 문자(공백을 제외한)의 총 개수를 출력하시오.
		 */
		
		
		String str = new String("It is a fun java programming");
		
		int acount=0, gcount=0, count=0;
		
		System.out.print("결과 : ");
		for(int i = 0; i < str.length(); i++) {
			
			
			char data = str.charAt(i);
			
			if( data == 'a') {
				acount++;
			}
			if( data == 'g') {
				gcount++;
			}
			if(data != ' ') {
				count++;
			}
		}
//		System.out.println("a의 개수 : "+ acount +"\t g의 개수 : "+ gcount+ "\t 총 개수 : "+ count);
		System.out.printf("a의 개수 : %d \t g의 개수 : %d \t 총 개수 : %d ", acount, gcount, count);
		
		// 강사님은 다중if로 작성함 확인할것! 
	}
}
