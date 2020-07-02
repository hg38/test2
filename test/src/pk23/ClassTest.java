package pk23;

public class ClassTest {

	public static void main(String[] args) {
		
		Person person=new Person();
		/*person.setAge(20);
		person.setName("홍길동");
		System.out.println(person.getName());
		System.out.println(person.getAge());*/

		//Object로 getClass()메소드 사용
		Class pClass=person.getClass();
		System.out.println(pClass.getName());
		
		//클래스가 접근해서 클래스 이름을 획득
		Class pClass2=Person.class;
		System.out.println(pClass2.getName());
		
		//클래스 이름으로 가져오기
		Calss pClass=Person.
	}

}
