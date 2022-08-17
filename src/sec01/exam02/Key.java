package sec01.exam02;

public class Key {
	public int number;
	
	public Key(int number) {
		this.number=number;
	}
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key compareKey=(Key) obj;
			if(this.number==compareKey.number) {
				return true;
			}
		}
		return false;
	}
	
	public int hashCode() { //hashCode() 메소드를 재정의
		return number;      //리턴값을 number로 했기 때문에 저장할때와 읽어올 때의 해시코드가 같음
	}

}
