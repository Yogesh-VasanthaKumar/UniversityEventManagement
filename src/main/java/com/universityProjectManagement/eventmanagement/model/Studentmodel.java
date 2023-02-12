package com.universityProjectManagement.eventmanagement.model;

public class Studentmodel {
    private int studentid;
    private String firstname;

    private String lastname;
    private int age;
    private String department;

    public Studentmodel() {
    }

    public Studentmodel(int studentid, String firstname, String lastname, int age, String department) {
        this.studentid = studentid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.department = department;
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
