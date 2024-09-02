package com.actitimeautomation.sample;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class ExcelHandling {
    public static void main(String[] argh) throws Exception {
        Workbook workbook = null;

        //C:\Users\RUTUJA\Documents
        //String filePath = "/Users/RUTUJA/Documents/Credentials.xlsx";
        String filePath ="/Users/Admin/Documents/Credentials.xlsx";
        String extension = filePath.substring(filePath.indexOf(".") + 1);
        System.out.println(extension);
        //acess file
        FileInputStream inputStream = new FileInputStream(filePath);
        //based on the extension of file,access the work of excel file
        if (extension.equals("xlsx")) {
            workbook = new XSSFWorkbook(inputStream);
        } else if (extension.equals("xlx")) {
            workbook = new HSSFWorkbook(inputStream);

        }

        //get the control of the sheet
        Sheet sheet = workbook.getSheet("sheet1");

        //get the total number of rows
        int totalRows = sheet.getPhysicalNumberOfRows();

        //get the total columns from the 0th row
        int totalcolumns = sheet.getRow(0).getPhysicalNumberOfCells();

        for (int i = 1; i <= totalRows - 1; i++) {
            Row row = sheet.getRow(i);
            for (int j = 0; j <= totalcolumns - 1; j++) {
                Cell cell = row.getCell(j);

                //Check the type of cell
                CellType cellType = cell.getCellType();

                Object value = null;

                //get the value from the cell based on the type
                if (cellType.equals(cellType.NUMERIC)) {
                    value = cell.getNumericCellValue();

                }
                if (cellType.equals(cellType.STRING)) {
                    value = cell.getStringCellValue();
                } else if (cellType.equals(CellType.BOOLEAN)) {
                    value = cell.getBooleanCellValue();
                } else {
                    value = " ";
                }
                System.out.print(value + " ");

            }
            System.out.println();


        }
        workbook.close();
        inputStream.close();
    }

    }

