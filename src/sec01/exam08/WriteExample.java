package sec01.exam08;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args)throws Exception {
		Writer writer=new FileWriter("C:/dev/test8.txt");
		 char[] array= {'A','B','C', 'D', 'E','F'};
		 
		 //writer.write(array); //배열의 모든 문자를 출력
		 writer.write(array,1,3); //배열의 1번 인텍스부터 3개를 출력 //BCD
		 writer.flush();
		 writer.close();
		

	}

}
