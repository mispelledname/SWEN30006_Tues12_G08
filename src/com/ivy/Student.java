package com.ivy;

import java.util.Date;

public class Student extends Person {


    private String email;
    private String studentID;

    public Student(String address, Date dob, String name, String email, String studentID) {

        super(address, dob, name);
        this.email = email;
        this.studentID = studentID;

    }


    public void SendEmailMsg(String msg) {
        System.out.format("Email sent:\n%s\n", msg);
    }

    public float totalGrade() {
        return 0;
    }

}
