package pk23;

public class StBufferTest {

	public static void main(String[] args) {
		String str="";
		StringBuffer buf=new StringBuffer("Nice Day! ");
		System.out.println(buf.toString());
		System.out.println(buf.length());
		System.out.println(buf.capacity());
		buf.ensureCapacity(100);
		System.out.println(buf.capacity());
		buf.insert(0, "hi");
		buf.insert(14, "everyone^^");
		System.out.println(buf);


	}

}
