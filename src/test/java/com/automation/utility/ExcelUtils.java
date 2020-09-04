package com.automation.utility;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	XSSFWorkbook workbook;
	XSSFSheet sheet;

	public ExcelUtils(String filePath, String sheetName) {
		try {
			workbook = new XSSFWorkbook(filePath);
			sheet = workbook.getSheet(sheetName);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getData(int row, int col) {
		return sheet.getRow(row).getCell(col).getStringCellValue();
	}

	public int getNumberOfRow() {
		return sheet.getPhysicalNumberOfRows();
	}

	public int getNumberOfCell(int row) {
		return sheet.getRow(row).getPhysicalNumberOfCells();
	}

	public static void main(String[] args) {
		ExcelUtils excelUtil = new ExcelUtils("src\\test\\resources\\data\\UserData.xlsx", "UserInfo");

		for (int i = 1; i < excelUtil.getNumberOfRow(); i++) {
			System.out.print(excelUtil.getData(i, 0) + "  ");
			System.out.print(excelUtil.getData(i, 1));
			System.out.println();
		}

	}

}
