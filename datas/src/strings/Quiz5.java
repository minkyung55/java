package strings;

public class Quiz5 {

	public static void main(String[] args) {
		
		/* 
		 	String str = "김개똥-2017년\n홍길동구리-2015년\n선우선녀-2018년";
		 */
		
		
		String data = "김개똥-2017년\n홍길동구리-2015년\n선우선녀-2018년";
		
		String total ="";
		String[] datas = data.split("\n");
		
		System.out.println("==== 변경 전 str ====");
		
		System.out.println(data);
		
//		for(int i = 0; i < datas.length; i++)
//			System.out.println(datas[i]);
		
	
	
		data = data.replace("-", ":");
		data= data.replaceAll("[0-9][0-9][0-9][0-9]", "2023");
		
		System.out.println("==== 변경 후 str ====");
		System.out.println(data);
		

		
	}
}
