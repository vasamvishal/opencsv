package com.dummytesting;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class OpenCsvReadWithHeader {
    private static final String SAMPLE_CSV_FILE_PATH = "./users-with-headers.csv";
    public static void main(String args[]) throws IOException {
        try (
                BufferedReader Reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
                CSVReader csvReader = new CSVReaderBuilder(Reader).withSkipLines(1).build();
        )
        {
        String[] nextRecord;
        while((nextRecord = csvReader.readNext()) != null)
        {
            System.out.println("Name : " + nextRecord[0]);
            System.out.println("Email : " + nextRecord[1]);
            System.out.println("Phone : " + nextRecord[2]);
            System.out.println("Country : " + nextRecord[3]);
            System.out.println("==========================");
        }}
    }
}