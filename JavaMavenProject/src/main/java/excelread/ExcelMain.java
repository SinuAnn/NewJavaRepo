package excelread;

import java.io.IOException;

public class ExcelMain {
	public static void main(String[] args) throws IOException {
		
		String y =ExcelCode.getStringData(2,0);
		System.out.println(y);
		String z =ExcelCode.getIntegerData(2,1);
		System.out.println(z);
	}

}
