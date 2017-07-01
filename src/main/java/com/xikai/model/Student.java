package com.xikai.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by xikaixiong on 2/17/17.
 */

@Entity
@Table(name="student")
public class Student {
    @Id
    private int id;

    @Column(name = "studentName")
    private String studentName;

    @Size(min=2,max = 30)
    @Column(name="studentHobby")
    private String studentHobby;

    @Column(name="studentMobile")
    private Long studentMobile;

    @Column(name="studentDOB")
    private Date studentDOB;

    @Column(name="studentSkills")
    private ArrayList<String> studentSkills;

    @Column(name="studentAddress")
    private Address studentAddress;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student() {
    }

    public Student(int id,String studentName, String studentHobby, Long studentMobile) {
        this.id = id;
        this.studentName = studentName;
        this.studentHobby = studentHobby;
        this.studentMobile = studentMobile;
    }

    public Long getStudentMobile() {
        return studentMobile;
    }

    public void setStudentMobile(Long studentMobile) {
        this.studentMobile = studentMobile;
    }

    public Date getStudentDOB() {
        return studentDOB;
    }

    public void setStudentDOB(Date studentDOB) {
        this.studentDOB = studentDOB;
    }

    public ArrayList<String> getStudentSkills() {
        return studentSkills;
    }

    public void setStudentSkills(ArrayList<String> studentSkills) {
        this.studentSkills = studentSkills;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentHobby() {
        return studentHobby;
    }

    public void setStudentHobby(String studentHobby) {
        this.studentHobby = studentHobby;
    }

    public Address getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(Address studentAddress) {
        this.studentAddress = studentAddress;
    }
}
