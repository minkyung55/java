package strings;

public class Exam4 {

	public static void main(String[] args) {
		String str = new String(" Have a nice day ");
		
		String result = str.trim(); // trim 메서드 왼쪽 오른쪽 끝에 공백제거
		System.out.println("--"+ str +"--");
		System.out.println("--"+ result +"--");
		
		
		String[] datas = result.split(" ");  //split 메서드 문자열이 나뉜다 (앞코드는 공백을 기준으로) split(,); 면 쉼표기준으로
		
		for(int i = 0; i < datas.length; i++)
			System.out.println(datas[i]);
		
		/*향상 for문 - for문을 더 쉽게 쓸 수 있게 
		for(변수 : 데이터들) {
		
		}
		
		
		*/
		//입력할때는 기본 for문을 쓰는게 편하다, 향상for문은 보통 출력할때
		System.out.println("향상 for 문 결과");
		for(String data : datas) {
			System.out.println(data);
		}
		
		
		//문자를 치환한다, 자주쓰이는 메서드 replace(" ", "^"); < --- 공백안에 "^"값을 넣어준다
		String replace = result.replace(" ", "^");
		System.out.println("result : "+ result);
		System.out.println("replace : "+ replace);
		
		
	}

}
