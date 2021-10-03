package utlis;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataLibrary {
	public static Object[][] getExcelData(String filename, String sheetname) {
		Object[][] StoreData = null;

		// FileInputStream fis=new FileInputStream(filename);
		XSSFWorkbook wb;
		try {
			wb = new XSSFWorkbook("./data/" + filename + ".xlsx");
			XSSFSheet sheet = wb.getSheet(sheetname);
			int rowcount = sheet.getLastRowNum();// sometime null pointer exception when you change physicl rows
			System.out.println(rowcount);
			int columncount = sheet.getRow(0).getLastCellNum();
			System.out.println(columncount);
			StoreData = new String[rowcount][columncount];
			for (int i = 1; i <= rowcount; i++) {
				for (int j = 0; j < columncount; j++) {
					String text = sheet.getRow(i).getCell(j).getStringCellValue();
					// System.out.println(text);
					StoreData[i - 1][j] = text;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return StoreData;
	}
}
