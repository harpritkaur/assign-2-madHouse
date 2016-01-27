/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author c0663712
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Student a = new Student("aaa","43424","male",53.6);
        Student b = new Student("bba","4fdas424","female",100);
        Student c = new Student("cc","434fdas24","male",63.6);
        Student d = new Student("ee","43tw424","female",73.6);
        
        List<Student> st = new ArrayList<>();
        
        
        st.add(a);
        st.add(b);
        st.add(c);
        st.add(d);
        
        Course temp = new Course(st);
        
        System.out.println(temp.getAllByGender("male"));
        System.out.println("");
        System.out.println(temp.getAllByGender("female"));
        
        
//
//public Set<Student> getAllByGender(String gender)
        
        
    }
    
}
