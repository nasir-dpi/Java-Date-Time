package javadatetime;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Startpoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		LocalDate a =  LocalDate.now();
//		LocalTime b = LocalTime.now();
//		LocalDateTime c = LocalDateTime.now();
//		DateTimeFormatter d = DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm:ss");
//		String formatedate = c.format(d);
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(formatedate);
		Date e = new Date();
		System.out.println(e);
		SimpleDateFormat ef = new  SimpleDateFormat("dd/MM/yyyy");
		System.out.println(ef.format(e));
		e.toString();
		System.out.println(e);
		
		
	}

}
