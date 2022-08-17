package sec01.exam01;

public class EmbCellPhoneExample {

	public static void main(String[] args) {
		//DmbCellPhone 객체 생성(부모인 CellPhone 객체가 먼저 생성됨)
		DmbCellPhone dmbCellPhone= new DmbCellPhone("자바폰","검정",10);
		
		//CellPhone  클래스로부터 상속받은 필드
		System.out.println("모델: "+dmbCellPhone.model);
		System.out.println("색상: "+dmbCellPhone.color);
		
		//DmbCellPhone 클래스의 필드
		System.out.println("채널: "+dmbCellPhone.channel);
		
		//CellPhone 클래스로부터 상속받은 메소드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요");
		dmbCellPhone.sendVoice("반갑습니다");
		dmbCellPhone.hangUp();
		dmbCellPhone.powerOFf();
		
		//DmbCellPhone 클래스의 메소드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(17);
		dmbCellPhone.turnOffDmb();
		
	}

}
