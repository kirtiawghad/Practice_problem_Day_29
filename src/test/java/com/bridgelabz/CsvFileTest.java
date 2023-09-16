package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CsvFileTest {
    @Test
    public void givenCsvFileWhenCountEntriesShouldReturnCount(){
        OpenCsvFileReader openCsvFileReader = new OpenCsvFileReader();
        int count = openCsvFileReader.countEntriesFromCsvFile();
        Assertions.assertEquals(4,count);
    }

    @Test
    public void givenCsvFileWhenReadDataShouldReturnData(){
        OpenCsvFileReader openCsvFileReader = new OpenCsvFileReader();
        boolean value = openCsvFileReader.displayDataFromCsvFile();
        Assertions.assertEquals(true,value);
    }
}
