package com.ivy;

import java.util.Date;

public abstract class Person {

    private String address;
    private Date dob;
    private String name;

    public Person(String address, Date dob, String name) {
        this.address = address;
        this.dob = dob;
        this.name = name;
    }

}
