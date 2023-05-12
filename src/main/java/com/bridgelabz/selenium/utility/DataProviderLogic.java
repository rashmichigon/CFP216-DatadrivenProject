package com.bridgelabz.selenium.utility;

import org.testng.annotations.DataProvider;

public class DataProviderLogic {

    @DataProvider(name = "testdata")
    public Object[][] getData()
    {
        ReadExcelFile readExcelFile = new ReadExcelFile();
        int totalRows = readExcelFile.getRowCount();
        Object[][] credentials = new Object[totalRows][2];

        for(int i=0;i < totalRows;++i){
            for(int j=0;j<2;j++){
                credentials[i][0] = readExcelFile.getData(i,0);
                credentials[i][1] = readExcelFile.getData(i,1);

            }
        }
        return credentials;
    }
}
