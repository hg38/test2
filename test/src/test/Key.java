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
	//내부의 내용은 객체의 h.c.값이 object의 h.c값과 같으면 인지
	@Override
		public boolean equals(Object obj) {
		//부모객체와자식객체가 형성되어 형변환 가능한지 판단
			if(ob) instanceof Key{
				Key comparaKey=(Key) obj;
				if(this.number == comparaKey.number){
					//this의 number와 comparaKey의 number 값이 같으면 true
					return true;
				}
			}
			return false;
				
				
			//
				
				
		}
			
	}




