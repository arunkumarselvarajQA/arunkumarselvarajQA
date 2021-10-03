package Utlis;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelClass {
	public static Object[][] getExcelData(String filename,String sheetname) throws Exception{
		Object[][]  StoreData=null;
		
		//FileInputStream fis=new FileInputStream(filename);
		 XSSFWorkbook wb=new  XSSFWorkbook("./data/"+filename+".xlsx");
		 XSSFSheet sheet =wb.getSheet(sheetname);
		 int rowcount= sheet.getLastRowNum();// sometime null pointer exception when you change physicl rows
			System.out.println(rowcount);
			 int columncount=sheet.getRow(0).getLastCellNum();
			 System.out.println(columncount);
			  StoreData=new String[rowcount][columncount];
			 for(int i=1;i<=rowcount;i++) {
				 for(int j=0;j<columncount;j++) {
					String text= sheet.getRow(i).getCell(j).getStringCellValue();
					//System.out.println(text);
					StoreData[i-1][j]=text;
				 }
			 }
			return StoreData;
		}
}
