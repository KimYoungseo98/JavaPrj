package sec04.exam06;
//메소드 오버로딩
//매개변수의 타입, 개수, 순서가 달라야 함
public class Calculator {
	double areaRectangle(double width) { //정사각형의 넓이
		return width*width;
	}
	
	double areaRectangle(double width, double height) { //직사각형의 넓이
		return width*height;
	}

}
