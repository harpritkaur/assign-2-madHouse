package javaapplication5;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author c0665912
 */
public class Course {

    private List<Student> students;

    public Course() {

    }

    public Course(List<Student> student) {
        this.students = student;
    }

    public void add(Student student) {
        this.students.add(student);
    }

    public void remove(Student student) {
        this.students.remove(student);
    }

    public void remove(String id) {
        for (int i = 0; i < students.size(); i++) {
            if (id.equals(students.get(i).getId())) {
                students.remove(i);
            }
        }
    }

    public void remove(int position) {
        this.students.remove(position);
    }

    public void insert(Student student, int position) {
        this.students.add(position, student);
    }

    public Student get(int position) {

        if (position > -1 && position < students.size()) {
            return this.students.get(position);
        } else {
            return null;
        }
    }

    public Student get(String id) {
        Student result = new Student();

        for (int i = 0; i < students.size(); i++) {
            if (id.equals(students.get(i).getId())) {
                result = students.get(i);
            } else {
                result = null;
            }

        }
        return result;
    }

    public List<Student> getAll() {
        return students;
    }

    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Course) {
            Course temp = new Course();
            temp = (Course) obj;
            return this.students.equals(temp.students);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String temp = "[";

        for (int i = 0; i < students.size(); i++) {
            temp += students.get(i).toString() + "," + "/n";
        }

        temp = temp.substring(0, temp.length() - 2) + "]";

        return temp;
    }

    public Set<Student> getAllByGender(String gender) {
        Set<Student> result = new HashSet();

        for (int i = 0; i < students.size(); i++) {
            if (gender.equals(students.get(i).getGender())) {
                result.add(students.get(i));
            }
        }

        return result;
    }//     public Map<String,Set<Student>> getGradeMap()
//     { 
        
//     }
}
