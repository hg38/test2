package test;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//박싱작업: 기본타입을 (초기화를 통해서) 객체화
		//
		Integer obj1=new Integer(100);
		Integer obj2=new Integer("200");
		//Integer onj3=new Integer.valueOf("300");
		
		//unBoxing 객체를 기본 타입으로
		int value1=obj1.intValue();
		int value2=obj2.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		

	}

}
