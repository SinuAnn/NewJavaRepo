package excelread;
import java.io.IOException;
public class Exceltrailmain {


		public static void main(String[] args) throws IOException 
		{
 String y=Exceltrail.getStringData(1,0);
System.out.println(y);
	String z=Exceltrail.getIntegerData(1,1);
	System.out.println(z);

		}

	}