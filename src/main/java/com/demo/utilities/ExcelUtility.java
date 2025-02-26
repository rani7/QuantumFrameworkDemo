package com.demo.utilities;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ExcelUtility {

    public static Map<String, String> getColumnData(String filePath, String sheetName, String columnName) throws IOException {
        Map<String, String> columnData = new HashMap<>();
        FileInputStream file = new FileInputStream(filePath);
        Workbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheet(sheetName);
        Row headerRow = sheet.getRow(0);
        int columnIndex = -1;

        for (Cell cell : headerRow) {
            if (cell.getStringCellValue().equalsIgnoreCase(columnName)) {
                columnIndex = cell.getColumnIndex();
                break;
            }
        }

        if (columnIndex == -1) {
            workbook.close();
            throw new IllegalArgumentException("Column " + columnName + " not found in sheet " + sheetName);
        }

        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            Cell keyCell = row.getCell(0); // Assuming the first column contains the keys
            Cell valueCell = row.getCell(columnIndex);
            columnData.put(keyCell.getStringCellValue(), valueCell.getStringCellValue());
        }

        workbook.close();
        return columnData;
    }
}