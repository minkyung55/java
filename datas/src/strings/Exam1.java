package strings;

public class Exam1 {

	public static void main(String[] args) {
		String data1 = "문자열";
		String data2 = new String("문자열");
		
		char[] datas = {'문', '자', '열'}; //원래는 이렇게 써야하는데 편리하게 만드려고 String을 만들었다.
		String data3 = new String(datas);
		
		System.out.println("data1 : "+ data1);
		System.out.println("data2 : "+ data2);
		System.out.println("data3 : "+ data3);

	}

}
