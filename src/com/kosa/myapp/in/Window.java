package com.kosa.myapp.in;
//익명클래스 433,434
public class Window {

	public static void main(String[] args) {
		class MyListener implements Button.OnClickListener {

			public void onClick() {
				System.out.println("버튼클릭됨");
			}
		}
		MyListener listener = new MyListener();
//지역클래스의 메서드에서 지역클래스를 포함하는 메서드의 지역변수를 참조할 경우
		//그 지역변수는 final 변수가 됨
		// 위 코드와 아래 코드는 같은실행
//		Button.OnClickListener listener = new Button.OnClickListener() {
//
//			@Override
//			public void onClick() {
//				System.out.println("버튼클릭됨2");
//				
//			}
//		};

		Button b1 = new Button();
		b1.setOnClickListener(listener);
		b1.touch();

	}

}
