package test;

public class Key {
	public int number;
	public Key(int number) {
		this.number=number;
	}
	
	@Override
	public int hashCode() {
		return number;
	}
	//������ ������ ��ü�� h.c.���� object�� h.c���� ������ ����
	@Override
		public boolean equals(Object obj) {
		//�θ�ü���ڽİ�ü�� �����Ǿ� ����ȯ �������� �Ǵ�
			if(ob) instanceof Key{
				Key comparaKey=(Key) obj;
				if(this.number == comparaKey.number){
					//this�� number�� comparaKey�� number ���� ������ true
					return true;
				}
			}
			return false;
				
				
			//
				
				
		}
			
	}




