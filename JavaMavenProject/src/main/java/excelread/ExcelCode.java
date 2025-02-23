package excelread;

import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelCode 
{
	static FileInputStream f;
	static XSSFWorkbook w;
    static XSSFSheet  sh;
    
    public static String getStringData(int a,int b)throws IOException
    {
    	f=new FileInputStream("C:\\Users\\DELL\\Desktop\\excel java.xlsx");//to access location of predefined excel data.
    	w=new XSSFWorkbook(f);//to access or modify the data.
    	sh=w.getSheet("Sheet1");
    	XSSFRow r= sh.getRow(a);//get the row value from sheet
    	XSSFCell c=r.getCell(b);//get cell from sheet
    	return c.getStringCellValue();//to retrive a string value from a cell
    }
    public static String getIntegerData(int a,int b)throws IOException
    {
    	f=new FileInputStream("C:\\Users\\DELL\\Desktop\\excel java.xlsx");
    	w=new XSSFWorkbook(f);
		sh=w.getSheet("Sheet1");
		XSSFRow r=sh.getRow(a);
		XSSFCell c=r.getCell(b);
		int x= (int) c.getNumericCellValue();//type casting
		return String.valueOf(x);
    }
    
}

