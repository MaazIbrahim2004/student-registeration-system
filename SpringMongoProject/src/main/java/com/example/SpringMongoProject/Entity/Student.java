package com.example.SpringMongoProject.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "students")
public class Student {
    @Id
    private String id;
    private String studentname;
    private String studentaddress;
    private String mobile;

    public Student(String id, String studentname, String studentaddress, String mobile) {
        this.id = id;
        this.studentname = studentname;
        this.studentaddress = studentaddress;
        this.mobile = mobile;
    }


    public Student() {
    }

    public String get_id() {
        return this.id;
    }

    public void set_id(String _id) {
        this.id = id;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getStudentaddress() {
        return studentaddress;
    }

    public void setStudentaddress(String studentaddress) {
        this.studentaddress = studentaddress;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Student{" +
                "_id='" + id + '\'' +
                ", studentname='" + studentname + '\'' +
                ", studentaddress='" + studentaddress + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}

