package test;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�ڽ��۾�: �⺻Ÿ���� (�ʱ�ȭ�� ���ؼ�) ��üȭ
		//
		Integer obj1=new Integer(100);
		Integer obj2=new Integer("200");
		//Integer onj3=new Integer.valueOf("300");
		
		//unBoxing ��ü�� �⺻ Ÿ������
		int value1=obj1.intValue();
		int value2=obj2.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		

	}

}
