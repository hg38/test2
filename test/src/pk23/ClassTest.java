package pk23;

public class ClassTest {

	public static void main(String[] args) {
		
		Person person=new Person();
		/*person.setAge(20);
		person.setName("ȫ�浿");
		System.out.println(person.getName());
		System.out.println(person.getAge());*/

		//Object�� getClass()�޼ҵ� ���
		Class pClass=person.getClass();
		System.out.println(pClass.getName());
		
		//Ŭ������ �����ؼ� Ŭ���� �̸��� ȹ��
		Class pClass2=Person.class;
		System.out.println(pClass2.getName());
		
		//Ŭ���� �̸����� ��������
		Calss pClass=Person.
	}

}
