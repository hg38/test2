package pk23;

public class StringTest2 {

	public static void main(String[] args) {
		String javastr=new String("java");
		String androidstr=new String(" and android");
		
		System.out.println(javastr);
		System.out.println("처음 문자열 주소 값: " 
								+ System.identityHashCode(javastr));
		
		javastr=javastr.concat(androidstr);
	
		System.out.println(javastr);
		System.out.println("연결된 문자열 주소 값: " 
				+ System.identityHashCode(javastr));

	}

} /*String --> 고정
	StringBuffer -> 동기화
	StringBuilder -> 동기화 제공 안 함
	동기화 : 순서(멀티 스레드) 
 	*/