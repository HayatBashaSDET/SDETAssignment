import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.testng.annotations.Test;

public class ReadAndWriteDate {
	
	
@Test()
	public static void readExcel() {
		 ArrayList<Object> username = new ArrayList<>();
		try {
			FileInputStream excel = new FileInputStream("src/test/java/resources/Book1.xls");
			DataFormatter df = new DataFormatter();
			Workbook workbook = new HSSFWorkbook(excel);
			Sheet sheet = workbook.getSheetAt(0);
			int lrn = sheet.getLastRowNum();
			short lcn = sheet.getRow(0).getLastCellNum();
			for (int i = 0; i <= lrn; i++) {
				Row row = sheet.getRow(i);
				for (int j = 0; j <= lcn; j++) {
					Cell cell = row.getCell(j);
					String val = df.formatCellValue(cell);
					username.add(val);
				}
			}
			for (int k = 0; k < username.size(); k++) {
				if (username.get(k).equals("")) {
					System.out.println();
				} else {

					System.out.print(" " + username.get(k));
				}
			}
			workbook.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	

}
