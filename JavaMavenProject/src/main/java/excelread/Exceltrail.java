package excelread;


	import java.io.FileInputStream;
	import java.io.IOException;

	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class Exceltrail 
	{
		static FileInputStream f;
		static XSSFWorkbook w;
		static XSSFSheet sh;
		public static String getStringData(int a,int b) throws IOException
		{
			f=new FileInputStream("D:\\java\\java class\\excel java.xlsx");
			w=new XSSFWorkbook(f);
			sh=w.getSheet("Sheet1");
			XSSFRow r=sh.getRow(a);
			XSSFCell c=r.getCell(b);
			return c.getStringCellValue();
			
		}
		public static String getIntegerData(int a,int b) throws IOException
		{
			f=new FileInputStream("D:\\java\\java class\\excel java.xlsx");
			w=new XSSFWorkbook(f);
			sh=w.getSheet("Sheet1");
			XSSFRow r=sh.getRow(a);
			XSSFCell c=r.getCell(b);
			int x= (int) c.getNumericCellValue();
			return String.valueOf(x);
			
		}
	}

