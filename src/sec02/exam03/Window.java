package sec02.exam03;

public class Window {
	Button button1=new Button(); //필드로 선언한 익명 구현 객체가 담당
	Button button2=new Button(); //setOnClickListener()호출 시 매개값으로 준 익명 구현 객체가 담당

	Button.OnClickListener listener=new Button.OnClickListener() { //필드값으로 익명 객체 대입
		public void onClick() {
			System.out.println("전화를 겁니다");
		}
	};
	
	Window(){
		button1.setOnClickListener(listener); //매개값으로 필드 대입
		button2.setOnClickListener(new Button.OnClickListener() { //매개값으로 익명 객체 대입
			@Override
			public void onClick() {
				System.out.println("메시지를 보냅니다");
				
			}
		});
	}

}
