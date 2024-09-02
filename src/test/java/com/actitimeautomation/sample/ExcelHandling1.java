package com.actitimeautomation.sample;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelHandling1 {
    //Exccel read and write code
    public static void main(String[] argh) throws Exception {
        ExcelHandling1 excelHandling1 = new ExcelHandling1();
        String filePath = "/Users/Admin/Credentials.xlsx";
        //excelHandling1.writeExcelData(filePath ,"sample3");

        Object[][]data=new Object[][]{
                {"Value1", "Value2","Value3"},
                {"Value4","Value5","Value6"},
                {"Value7","","Value8"}

        };
       excelHandling1.writeExcelData(filePath,"sheet2",data);
    }


    /*get acess of workbook based on the provided filepath
    *@param:filepath

     */
    public Workbook getWorkbook(String filePath) {
        Workbook workbook = null;

        try {
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

        } catch (Exception e) {
            e.printStackTrace();
        }

        return workbook;

    }
    //get acess of sheet with refrence of Workbook
    public Object[][] getExcelData(String filePath,String sheetName)throws IOException{
    Workbook workbook=getWorkbook(filePath);
        //get the control of the sheet sheetName
        Sheet sheet = workbook.getSheet(sheetName);

        //get the total number of rows
        int totalRows = sheet.getPhysicalNumberOfRows();

        //get the total columns from the 0th row
        int totalcolumns = sheet.getRow(0).getPhysicalNumberOfCells();
        //two Dimensional array
        Object[][] testData=new Object[totalRows-1][totalcolumns];

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
                else if (cellType.equals(cellType.STRING)) {
                    value = cell.getStringCellValue();
                }
                else if (cellType.equals(CellType.BOOLEAN)) {
                    value = cell.getBooleanCellValue();
                } else {
                    value = " ";
                }
                testData[i-1][j]=value;
                System.out.print(value + " ");

            }

            System.out.println();


        }
        System.out.println(testData);
        workbook.close();
        return testData;
    }
    public void writeExcelData(String filepath,String sheetName,Object[][]data) throws IOException{
        Workbook workbook=getWorkbook(filepath);
        //create sheet from reference
        Sheet sheet =workbook.createSheet(sheetName);
        //create row  from sheet reference
       // Row row=sheet.createRow(0);
        Row row;
        Cell cell;
        //create cell from row reference
        //Cell cell=row.createCell(0);
        //Check if sheet is already created->if its created then reuse it else create new with provided name.

        //Set value in the cell
        //cell.setCellValue(1);
        if(workbook.getSheet(sheetName)!=null)
        {
            sheet=workbook.getSheet(sheetName);
        }else{
            sheet=workbook.createSheet(sheetName);
        }

        //get the length of data object
        int totalRowsInData=data.length;

        //get the column length of data object
        int totalColumnInData=data[0].length;
        //iterate through each row and column of data object and get the value and write into excel
        for(int i=0;i<=totalRowsInData-1;i++){
            //get the access of each row
            //if the row is already present then reuse it else create new row
            if(sheet.getRow(i)!=null){
                row=sheet.getRow(i);
            }else{
                row=sheet.createRow(i);
            }
            for(int j=0;j<=totalColumnInData-1;j++){
                Object value=data[i][j];

                //if the cell is alredy created then resue it else create new cell
                if (row.getCell(j)!=null){
                    cell=row.getCell(j);
                }else {
                    cell= row.createCell(j);
                }
                //set value in cell
                cell.setCellValue(value.toString());
            }

        }


        //create object of FileOutputStream to write or save the file
        FileOutputStream outputStream=new FileOutputStream(filepath);
        //write or save the data workbook using Fileoutputstream reference
        workbook.write(outputStream);
        //close the workbook
        workbook.close();
        //close the file output stream
        outputStream.close();


    }

}

