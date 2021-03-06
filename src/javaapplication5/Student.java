package javaapplication5;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author c0663712
 */
public class Student {

    private String name;
    private String id;
    private String gender;
    private double grade;

    public Student() {
        this.name = "";
        this.id = "";
        this.gender = "";
        this.grade = 0;
    }

    public Student(String name, String id, String gender, double grade) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public boolean eaquals(Student obj) {
        if (this.getClass() != obj.getClass()) {
            return false;
        }

        if (this.getName().equals(obj.getName()) && this.getId().equals(obj.getId())) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public String toString() {
        return "{\"name\":\"" + getName() + "\",\"id\":\"" + getId() + "\",\"gender\":\"" + getGender() + "\",\"grade\":" + getGrade() + "}";
    }

}
