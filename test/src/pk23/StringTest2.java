package pk23;

public class StringTest2 {

	public static void main(String[] args) {
		String javastr=new String("java");
		String androidstr=new String(" and android");
		
		System.out.println(javastr);
		System.out.println("ó�� ���ڿ� �ּ� ��: " 
								+ System.identityHashCode(javastr));
		
		javastr=javastr.concat(androidstr);
	
		System.out.println(javastr);
		System.out.println("����� ���ڿ� �ּ� ��: " 
				+ System.identityHashCode(javastr));

	}

} /*String --> ����
	StringBuffer -> ����ȭ
	StringBuilder -> ����ȭ ���� �� ��
	����ȭ : ����(��Ƽ ������) 
 	*/