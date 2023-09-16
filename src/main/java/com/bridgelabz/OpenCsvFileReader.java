package com.bridgelabz;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class OpenCsvFileReader {
    public static final String OPEN_CSV_FILE_PATH = "C:\\Users\\vinit\\IdeaProjects\\FileIo\\src\\main\\java\\com\\bridgelabz\\State Census.csv";

    Reader reader;
    {
        try {
            reader = Files.newBufferedReader(Paths.get(OPEN_CSV_FILE_PATH));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    CSVReader csvReader = new CSVReader(reader);

    List<String[]> records;
    {
        records = csvReader.readAll();
    }

    public int countEntriesFromCsvFile(){
        int entriesCount = 0;
        for(String[] record: records){
            entriesCount++;
        }
        return entriesCount;
    }

    public boolean displayDataFromCsvFile(){
        //State,Population,Increase,Area(Km2),Density,Sex-Ratio,Literacy
        for(String[] record: records){
            System.out.println("State Name:" + record[0]);
            System.out.println("Population:" + record[1]);
            System.out.println("Increase:" + record[2]);
            System.out.println("Area(Km2):" + record[3]);
            System.out.println("Density:" + record[4]);
            System.out.println("Sex-Ratio:" + record[5]);
            System.out.println("Literacy:" + record[6]);
            System.out.println("-------------------------");
        }
        if(records != null)
            return true;
        else
            return false;
    }
}