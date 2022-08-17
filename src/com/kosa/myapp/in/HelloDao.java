package com.kosa.myapp.in;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
/*인터페이스를 구현한 클래스에서 예외처리를 어떻게 해야 하는가
예외의 원인이 호출자에 있을 경우 예외를 throws해야 한다
발생할 수 있는 예외가 checked exception일 경우 throws하지 못한다
왜나햐면 인터페이스의 메서드는 throws구문이 없으므로 넣으면 안된다
구현이 어떻게 될지 모르므로 예외도 어떤 예외가 발생할지 모르기 때문에 사용하면 안된다
인터페이스를 구현하는 클래스에서 예외처리를 할 경우
예외의 원인이 호출자에게 있더라도 try-catch 블록을 이용한다
try{
      예외가 발생할 가능성이 있는 코드
   }cathch(Exception e){
       예외를 unchecked exception으로 바꿔 발생시킨다
       throw new RuntimeException(e);
   } catch블록에서 새로운 에외(unchecked exception)을 throw함
   try-catch 블록으로 예외를 처리하는것은 호출자가 한다*/

public class HelloDao implements IHelloDao {

	@Override
	public void insert(int data) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(int data) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub

	}

	@Override
	public String select(String fileName) {
		FileInputStream fos=null;
		try{
			fos=new FileInputStream(fileName);
		}catch(FileNotFoundException e) {
			System.out.println(fileName+"이 없습니다.");
			throw new RuntimeException(e);
		}
		return null;
	}

}
