package test;

import java.util.HashMap;

public class ToStringEX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Key,String>hashMap=new HashMap<Key,String>();
		
		hashMap.put(new Key(1),"ȫ�浿");
		/*hashMap.put(new Key(1),"����Ʈ����");
		hashMap.put(new Key(1),"100");
		hashMap.put(new Key(1),"3.9");*/
		
		
		String value=hashMap.get(new Key(1));
		System.out.println(value);
		
		//ȫ�浿,����Ʈ,100,3.9

	}

}
