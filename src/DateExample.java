import java.util.Calendar;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		//날짜를 다루는 클래스: Date(java.util.Date, java.sql.Date), Calendar(java.util.Calenar)
		Date today= new Date();
		System.out.println(today.toString());
		System.out.println(today.getDay()); //deprecated - 권장하지 않음
		System.out.println(today.getDate());
		
		Calendar cal=Calendar.getInstance();
		System.out.println(cal.get(Calendar.DATE)); 
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1); //0이 1월 6은 7월...
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)); //일요일이 맨처음(1)
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.MINUTE));
		
	}

}
