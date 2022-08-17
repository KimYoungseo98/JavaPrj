package sec01.exam07;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) throws Exception {
		Writer writer=new FileWriter("C:/dev/test7.txt"); //<-도착지로하는 문자 기바 파일 출력 스트림 생성
		
		char a='A'; //한 문자씩 출력
		char b='B';
		char c='C';
		
		writer.write(a);
		writer.write(b);
		writer.write(c);
		
		writer.flush();
		writer.close();

	}

}
