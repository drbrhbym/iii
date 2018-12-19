import java.util.Calendar;
import java.util.*;
import java.text.*;

public class DateFormatDemo extends CalendarDemo {

	public static void main(String[] args) {
		long start = new java.util.Date().getTime();
		long start1 = System.currentTimeMillis();
		
		Calendar cal = new GregorianCalendar(1988, Calendar.SEPTEMBER, 27);
		Date myDate = cal.getTime();
		int c_year = cal.get(Calendar.YEAR) - 1911;
		DateFormat df1 = DateFormat.getDateInstance();
		SimpleDateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat df3 = new SimpleDateFormat("¦~M¤ëd¤é");
		System.out.println(df1.format(myDate));
		System.out.println(df2.format(myDate));
		System.out.println(c_year + df3.format(myDate));
		
		long end = new java.util.Date().getTime();
		long end1 = System.currentTimeMillis();
		System.out.println("time : " + (end - start));
		System.out.println("time : " + (end1 - start1));

	}

}
