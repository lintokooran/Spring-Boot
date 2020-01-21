import java.time.LocalDate;
import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class
import java.util.Date;
import java.util.TimeZone;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class MyClass {

	public static void main(String[] args) {
		try {
			String inputDate = "08/20/1987";
			
			String pattern = "MM/dd/yyyy";
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

			//Date date = simpleDateFormat.parse(inputDate);
			
			Date date = new Date();			
			System.out.println(date);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
/*		
		LocalDateTime myDateObj = LocalDateTime.now();
		System.out.println("Before formatting: " + myDateObj);

		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yy");

		String formattedDate = myDateObj.format(myFormatObj);
		System.out.println("After formatting: " + formattedDate);

		LocalDate todaysDate = LocalDate.parse(formattedDate, myFormatObj);

		System.out.println("date type: " + todaysDate);
		try {
			Date today = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

			today = sdf.parse(sdf.format(today));

			System.out.println("date type in MM/dd/yyyy: " + today);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Date date1 = new java.util.Date();

		System.out.println("date 1 : " + date1);

		SimpleDateFormat sd = new SimpleDateFormat("E MMM dd hh:mm:ss z yyyy");
		sd.setTimeZone(TimeZone.getTimeZone("PST"));

		System.out.println("date 1 IST: " + sd.format(date1));

		Date date = new java.util.Date();
		String pattern = "MM-dd-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		try {
			date = simpleDateFormat.parse(simpleDateFormat.format(new java.util.Date()));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		System.out.println("date 0000 PST: " + date);*/

	}
}
