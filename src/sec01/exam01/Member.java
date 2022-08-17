package sec01.exam01;

public class Member {
	public String id;
	public Member(String id) {
		this.id=id;
	}
	public boolean equals(Object obj) {
		if(obj instanceof Member) { //타입이 같은지 확인하고
			Member member=(Member)obj; //타입을 강제 변환해서 id필드값이 동일한지 검사
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
	

}
