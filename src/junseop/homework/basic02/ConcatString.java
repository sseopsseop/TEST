package junseop.homework.basic02;

public class ConcatString {
//	2. ConcatString 클래스를 하나 만들고 String 타입의 값 2개를 매개변수로 받아서 문자열 결합을 진행하고 
//	결합된 문자열을 리턴하는 메소드를 구현하세요. 
	
//	3. 2번에서 만든 메소드를 오버로딩해서 String 타입의 값 2개와 int 타입의 값 1개를 매개변수로 받아서 
//	문자열 결합을 진행하고 결합된 문자열을 리턴하는 메소드를 구현하세요.
	public String concatString(String first, String last) {
		return first+last;
	}
	
	public String concatString(String first, String mid, int last) {
		return first + mid + String.valueOf(last);
	}
}
