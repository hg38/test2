package test;

import javax.swing.JOptionPane;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="";
		String Str2="";
		Double num1,num2;
		char ch='A';

		num1=Double.parseDouble(JOptionPane.showInputDialog("21"));
		num2=Double.parseDouble(JOptionPane.showInputDialog("22"));
		
		if(num2!=0) {
			System.out.println(num1/num2);
		}
		if(Character.isDigit(ch)) { //����Ʈ�� ����ȯ
			System.out.println(ch + "�� ���ڰ� �ƴմϴ�");
		}
		else
			System.out.println(ch+"�� �����Դϴ�.");
	}

}
