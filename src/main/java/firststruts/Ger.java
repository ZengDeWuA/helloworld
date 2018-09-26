package firststruts;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ger {

	public static void main(String[] args) throws Exception {

		XSSFWorkbook workbook = new XSSFWorkbook();

		XSSFSheet sheet = workbook.createSheet("q");

		XSSFRow row = sheet.createRow(1);

		XSSFCell cell = row.createCell(1);

		cell.setCellValue("ads");

		FileOutputStream outputStream = new FileOutputStream("D:\\aq.xls");

		workbook.write(outputStream);

		outputStream.close();
		workbook.close();

	}
}
