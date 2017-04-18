package bai_4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MyDateTime {

	private Date currentDate;

	public void setCurrentDate(Date currentDate) {
		this.currentDate = currentDate;
	}

	public Date getCurrentDate() {
		return currentDate;
	}

	public static void main(String[] args) {
		// Date a;
		System.out.println(System.currentTimeMillis());
		//
		Date now = new Date();
		Date yesterday = new Date(System.currentTimeMillis() - 24 * 60 * 60 * 1000);
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss z");
		System.out.println(dateFormat.format(now));
		System.out.println(dateFormat.format(yesterday));

		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, -1);
		int day = calendar.get(Calendar.DAY_OF_WEEK);
		switch (day) {
		case Calendar.SUNDAY:
			System.out.println("sunday");
			break;
		case Calendar.MONDAY:
			System.out.println("monday");
			break;
		case Calendar.TUESDAY:
			System.out.println("tuesday");
			break;
		}
		Date yesterday2 = calendar.getTime();

		System.out.println(dateFormat.format(yesterday2));
	}

}
