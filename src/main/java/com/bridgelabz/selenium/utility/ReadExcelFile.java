package com.bridgelabz.selenium.utility;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;

public class ReadExcelFile {

    public static final String excelFilePath = "resources/Data drivenFile.xlsx";
    private final XSSFWorkbook workbook;

    public ReadExcelFile()
    {
        File file = new File(excelFilePath);
        try {
            this.workbook = new XSSFWorkbook(file);
        }
        catch(IOException e)
        {
            throw new RuntimeException(e);
        }
        catch(InvalidFormatException e){
            throw new RuntimeException(e);
        }
    }

    public int getRowCount() {
        return 0;
    }

    public Object getData(int i, int i1) {
        return null;
    }
}
