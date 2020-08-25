package com.ivy;
import java.util.ArrayList;

public class Submission {

    private int attemptNumber;
    private File2[] files;
    private int numFiles;

    public Submission(){
        this.files = new File2[0];
        this.numFiles = 0;
        this.attemptNumber = 1;
    }

    public int getAttemptNumber() {
        return attemptNumber;
    }

    public void setAttemptNumber(int attemptNumber) {
        this.attemptNumber = attemptNumber;
    }

    public File2[] getFiles() {
        return files;
    }

    public void setFiles(File2[] files) {
        this.files = files;
    }

    public int getNumFiles() {
        return numFiles;
    }

    public void setNumFiles(int numFiles) {
        this.numFiles = numFiles;
    }

    public File2[] includedFiles() {
        return this.files;
    }

    /*
     Attach a file to the submission
     */
    public void attachFile(String fileName, String fileDir) {
        File2 file = new File2(fileName, fileDir);
        File2[] newArr = new File2[this.numFiles + 1];
        for (int i=0; i<this.numFiles; i++) {
            newArr[i] = this.files[i];
        }
        newArr[this.numFiles] = file;
        this.files = newArr;
        this.numFiles++;
    }

    /*
     Remove all files currently attached to the submission
     */
    public void removeAllFiles() {
        this.numFiles = 0;
        this.files = new File2[0];
    }

    /*
     Remove the specified file from the submission
     */

}
