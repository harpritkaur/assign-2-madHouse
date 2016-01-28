/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Prince
 */
public class CourseTest {
    
    public CourseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class Course.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Student student = null;
        Course instance = new Course();
        instance.add(student);
    }

    /**
     * Test of remove method, of class Course.
     */
    @Test
    public void testRemove_Student() {
        System.out.println("remove");
        Student student = null;
        Course instance = new Course();
        instance.remove(student);
        
    }

    /**
     * Test of remove method, of class Course.
     */
    @Test
    public void testRemove_int() {
        System.out.println("remove");
        int position = 0;
        Course instance = new Course();
        instance.remove(position);
        
    }

    /**
     * Test of remove method, of class Course.
     */
    @Test
    public void testRemove_String() {
        System.out.println("remove");
        String id = "";
        Course instance = new Course();
        instance.remove(id);
        
    }

    /**
     * Test of insert method, of class Course.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
         List<Student> prince =new ArrayList<>();
        prince.add(new Student("Gagan","C0663919","Male",83.00));
        Course instance = new Course(prince);
        Student prince2=new Student("Gagan","C0663919","Male",83.00);
        instance.insert(prince2,1);
        String expResult = "[" + instance.get(0).toString()+ ", " + instance.get(1).toString() + "]";
        String result = instance.getAll().toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of get method, of class Course.
     */
    @Test
    public void testGet_int() {
        System.out.println("get");
        int index = 0;
        List<Student> prince=new ArrayList<Student>();
        prince.add(new Student("gagan","C0663919","male",83.00));
        Course instance = new Course(prince);
        String expResult = "{\"name\":\"gagan\",\"id\":\"C0663919\",\"gender\":\"male\",\"grade\":83.00}";
        String result = instance.get(index).toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of get method, of class Course.
     */
    @Test
    public void testGet_String() {
        System.out.println("get");
        String id = "";
        Course instance = new Course();
        Student expResult = null;
        Student result = instance.get(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of getAll method, of class Course.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        Course instance = new Course();
        List<Student> expResult = null;
        List<Student> result = instance.getAll();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of equals method, of class Course.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Course instance = new Course();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Course.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        List<Student> prince=new ArrayList<>();
        prince.add(new Student("gagan","C0663919","male",83.00));
        Course instance = new Course(prince);
        Student sukh=new Student("sukhjeet","c0665523","male",85.00);
        instance.insert(sukh,1);
        String expResult = "[" + instance.get(0).toString()+ ", " + instance.get(1).toString() + "]";
        String result = instance.getAll().toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAllByGender method, of class Course.
     */
    @Test
    public void testGetAllByGender() {
        System.out.println("getAllByGender");
        String gender = "Male";
        List<Student> prince=new ArrayList<>();
        prince.add(new Student("gagan","C0663919","male",83.00));
        Course instance = new Course(prince);
        Student sukh=new Student("harpreet","C0665527","female",85.00);
        instance.insert(sukh,1);
        String expResult = "[{\"name\":\"gagan\",\"id\":\"c0665527\",\"gender\":\"Male\",\"grade\":83.00}]";
        String result = instance.getAllByGender(gender).toString();
        assertEquals(expResult, result);
    }
    
}
