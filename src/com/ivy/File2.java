package com.ivy;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class File2 {
    private Date createdDate;
    private String fileName;
    private String fileData;

    public File2(String fileName, String fileDir) {
        this.createdDate = new Date();
        this.fileName = fileName;
        // read file in specified directory and store it
        // as a string in File object
        try {
            File myObj = new File(fileDir);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                this.fileData += data;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred. File could not be read.");
            e.printStackTrace();
        }
    }
}
