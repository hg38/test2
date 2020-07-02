package pk23;

import java.lang.reflect.Constructor;

public class StringClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Class strClass=Class.forName("java.lang.String");
		
		Constructor[] cons=strClass.getConstructors();
		for(Constructor C:cons) {
			System.out.println(C);
		}
		System.out.println();
		
		Method[] methods=strClass.getMethods();
		for(Method m : methods) {
			System.out.println(m); 
		}

	}

}
