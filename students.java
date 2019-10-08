import java.util.*;
import java.io.*;

public class students {
   public static void main(String[] args) throws FileNotFoundException {
      System.out.println("How many students do you want to enter?");
      Scanner console = new Scanner(System.in);
      int n = console.nextInt();
      Student[] array = new Student[n];
      for (int i = 0; i < n; i++) {      
         Student student = new Student();
         userSetAttributes(student);
         array[i] = student;
      }
      
      //create a new file with student info
      PrintStream output = new PrintStream(new File("students.txt"));
      for (int i = 0; i < n; i++) {
         output.println(array[i]); 
      }
      
      //read from the file and print the result 
      Scanner input = new Scanner(new File("students.txt"));
      System.out.println("The following students have an average grade over 7.0:");
      while (input.hasNextLine()) {
         String line = input.nextLine();
         processLine(line);
      }
   }  
   
   public static void userSetAttributes(Student student) {
         Scanner console = new Scanner(System.in);
         System.out.println("Enter info about the next student (\"quit\" to exit): ");
         System.out.println("Name: ");
         student.setName(console.next());
         System.out.println("Age: ");
         student.setAge(console.nextInt());
         System.out.println("Track: ");
         student.setTrack(console.next());
         System.out.println("Gender: ");
         student.setTrack(console.next());
         System.out.println("Grade in SW Construction: ");
         student.setGrade1(console.nextInt());
         System.out.println("Grade in SW Design: ");
         student.setGrade2(console.nextInt());
         System.out.println("Grade in ITO: ");
         student.setGrade3(console.nextInt());
       }

   public static void processLine(String line) {
         Scanner data = new Scanner(line);
         String name = data.next();
         int age = data.nextInt();
         String track = data.next();
         String gender = data.next();
         int grade1 = data.nextInt();
         int grade2 = data.nextInt();      
         int grade3 = data.nextInt();
         double average = (grade1 + grade2 + grade3) / 3;
         if (average > 7.0) {
            System.out.println(line);  
         }      
   }
}
