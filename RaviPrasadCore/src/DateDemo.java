import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		//mm/dd/yyyy HH:MM:SS
		SimpleDateFormat sdf=new SimpleDateFormat("M/d/yyyy");
		SimpleDateFormat sf=new SimpleDateFormat("M/d/yyyy hh:mm:ss");

		System.out.println(sdf.format(d));
		System.out.println(sf.format(d));

		System.out.println(d.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
