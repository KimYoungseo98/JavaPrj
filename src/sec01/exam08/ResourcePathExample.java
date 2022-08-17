package sec01.exam08;

public class ResourcePathExample {

	public static void main(String[] args) {
		Class clazz=Car.class;
		//리소스 절대경로얻기
		String photo1Path=clazz.getResource("images.jpg").getPath();
		
		System.out.println(photo1Path);

	}

}
