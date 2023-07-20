package arrays;

public class Exam3 {

	public static void main(String[] args) {
//		int[] arr = new int[] {10,20,30,40,50}; 
		int[] arr = {10,20,30,40,50};
	
		for(int i = 0; i < arr.length; i++)
		System.out.println("arr["+i+"] : " + arr[i]);
		
		
		System.out.println();
		arr = new int[] {10,20,30,40};  //다시 배열 편성할경우에는 new를 써줘야함
		
		for(int i = 0; i < arr.length; i++)  //arr.length는 배열의 갯수만큼 범위지정
		System.out.println("arr["+i+"] : " + arr[i]);
		
		
		//문자열로 배열만들때 (int랑 다를바가 없다 - 다른자료형도 다 똑같다!)
		
		System.out.println();
		String[] strs ={"김변수","이상수","박참조"};  
		
		for(int i = 0; i < strs.length; i++)  
		System.out.println("arr["+i+"] : " + strs[i]);

	}

}
