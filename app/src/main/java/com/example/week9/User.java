/*
* Lasse Tuominen
* 470627
* 25.03.2023
*
* */




package com.example.week9;

public class User {
    private String firstName;
    private String lastName;
    private String fullName;
    private String email;
    private String degreeProgram;

    private int image;




    public User(String firstName, String lastName, String email, String degreeProgram, int image) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.degreeProgram = degreeProgram;
        this.image = image;
    }

    public String getFullName(){
        fullName = firstName + " " + lastName;
        return fullName;
    }
    public String getEmail () {
        return email;
    }
    public String getDegreeProgram () {
        return degreeProgram;
    }
    public int getImage(){
        return image;}
}


