package strings;

public class Quiz3 {

	public static void main(String[] args) {
		
		/*
		  "FF590-2DX83-M81LZ-XDM7E-MKUT4" 문자열에 있는 정수의 합계를 구하세요.
		   ex) 590 + 283 + 81 + 7 + 4 =965
		 */
		

		
//		String data = new String("FF590-2DX83-M81LZ-XDM7E-MKUT4");
//		String[] result = data.split("-");
//		String save = "";
//		
//		
//		for(int i =0; i < data.length(); i++) {
//			char num = data.charAt(i);
//			
//			if( 48 <= num && num <= 57) {
//				save += num;
//
//			} 
//		}System.out.println(save+" ");
		
		
		String data = "FF590-2DX83-M81LZ-XDM7E-MKUT4";
		
		String[] datas = data.split("-");
		int total = 0;
		
		for(int i = 0; i <datas.length; i++) {
			String tmp ="";
			for(int j = 0; j < datas[i].length(); j++) {
				if(datas[i].charAt(j) >= '0' && datas[i].charAt(j) <='9') {
					tmp += datas[i].charAt(j);
				}
			}
			total = total + Integer.parseInt(tmp);
			
		}
		System.out.println("합계 : " + total);
		
	}
}
