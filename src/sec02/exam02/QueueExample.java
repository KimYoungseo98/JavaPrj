package sec02.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Message> messageQueue=new LinkedList<>();
		
		messageQueue.offer(new Message("sendMail","최승철"));
		messageQueue.offer(new Message("sendSMS","윤정한"));
		messageQueue.offer(new Message("sendKakaotalk","홍지수"));
		
		while(!messageQueue.isEmpty()) {
			Message message=messageQueue.poll(); //메시지큐에서 1개의 메시지를 꺼냄
			switch(message.command) {
			case "sendMail":
				System.out.println(message.to+"님에게 메일을 보냅니다.");
				break;
			case "sendSMS":
				System.out.println(message.to+"님에게 SMS를 보냅니다.");
				break;
			case "sendKakaotalk":
				System.out.println(message.to+"님에게 카카오톡을 보냅니다.");
				break;
			}
		}
		

	}

}
