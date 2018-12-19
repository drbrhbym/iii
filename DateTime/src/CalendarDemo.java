import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.*;

public class CalendarDemo {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		System.out.println(today);
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH) + 1;
		int day = today.get(Calendar.DATE);
		int day_of_week = today.get(Calendar.DAY_OF_WEEK);
		int hour = today.get(Calendar.HOUR_OF_DAY);
		int minute = today.get(Calendar.MINUTE);
		int second = today.get(Calendar.SECOND);
		
		String[] days = {"��","�@","�G","�T","�|","��","��"};
		System.out.println("Today is �P��" + days[day_of_week - 1]);
		
		String wdays = "��@�G�T�餭��";
		System.out.println("Today is �P��" + wdays.charAt(day_of_week - 1));
		
		System.out.println("Today is " + year + "/" + month + "/" + day);
		System.out.println("Today is  " + (day_of_week - 1));
		
	   
		System.out.println("�ɶ��O" + hour + ":" + minute + ":" + second);
		System.out.printf("�ɶ��O%d:%02d:%02d%n",hour, minute ,second);
		System.out.println("�ɶ��O" + hour 
				+ ":" + ((minute < 10) ? "0" + minute : minute)  
				+ ":" + ((second < 10) ? "0" + second : second));
		
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
		System.out.println("�ɶ��O"+sdf.format(today.getTime()));
	}

}
