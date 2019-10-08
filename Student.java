import java.util.*;
import java.io.*;

public class Student { //declare a class

    private int age;
    private String track;
    private String gender;
    private String name;
    private int grade1;
    private int grade2;
    private int grade3;

    public Student() {} //constructor 1

    public Student(int age, String track, String gender, String name) { // constructor 2
        this.age = age;
        this.track = track;
        this.gender = gender;
        this.name = name;
    }
    
    public Student(int age, String track, String gender, String name, int grade1, int grade2, int grade3) {
      this.age = age;
      this.track = track;
      this.gender = gender; 
      this.name = name;
      this.grade1 = grade1;
      this.grade2 = grade2;
      this.grade3 = grade3;
    }

    /*public double calculateAverage(Student student) {
        double average = 0;
        double sum = 0;

        for (int i = 0; i < student.grades.length; i++) {
            sum = sum + student.grades[i];
        }

        average = sum / grades.length;

        return average;
    }*/

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade1() {
        return grade1;
    }

    public void setGrade1(int grade1) {
        this.grade1 = grade1;
    }
 
    public int getGrade2() {
        return grade2;
    }

    public void setGrade2(int grade2) {
        this.grade2 = grade2;
    }
   
   public int getGrade3() {
        return grade3;
    }

    public void setGrade3(int grade3) {
        this.grade3 = grade3;
    }      
    
    //to string method
    public String toString() {
        return name + "\t" +
               age + "\t" +
               track + "\t" +
               gender + "\t" +
               grade1 + "\t" +
               grade2 + "\t" +
               grade3;   
    }
}
