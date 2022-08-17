package sec01.exam04;

import java.util.Random;

public class IfDiceExample {

	public static void main(String[] args) {
		/*System.out.println(Math.random()); //0부터 1까지 실수타입 난수를 발생, from~to일 경우 to는 포함 안됨
		System.out.println(Math.random()*6); //0부터 6미만의 난수
		System.out.println((int)(Math.random()*6)+1);//1,2,3,4,5,6
		
		Random rand=new Random();
		System.out.println(rand.nextInt(6)+1); */
		//int num=(int)(Math.random()*45)+1; ->로또 번호 하나 뽑기
		//
		
		int num=(int)(Math.random()*6)+1; //주사위 번호 하나 뽑기
		if(num==1) {
			System.out.println("1번이 나왔습니다.");
		}else if(num==2) {
			System.out.println("2번이 나왔습니다.");
		}else if(num==3) {
			System.out.println("3번이 나왔습니다.");
		}else if(num==4) {
			System.out.println("4번이 나왔습니다.");
		}else if(num==5) {
			System.out.println("5번이 나왔습니다.");
		}else {
			System.out.println("6번이 나왔습니다.");
		}
		

	}

}
