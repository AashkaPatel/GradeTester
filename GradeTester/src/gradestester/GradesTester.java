package gradestester;

import java.util.Scanner;

/**
 *
 * @author Aashka Patel
 */
public class GradesTester {

     public static void main(String[] args)
    {       
        Scanner blah = new Scanner (System.in); //scanner
    
        Grades s1 = new Grades();//object 
        System.out.print("What is the student's name? ");
        s1.studentName = blah.next(); 
        System.out.print("Enter in the student's quiz grade: ");
        s1.averageQuizGrades = blah.nextInt();
        System.out.print("Enter in the student's midterm grade: ");
        s1.midtermGrade = blah.nextInt();
        System.out.print("Enter in the student's final exam grade: ");
        s1.finalExamGrade = blah.nextInt();
        s1.Grades();
        
        Grades s2 = new Grades(); //object
        System.out.print("What is the student's name? ");
        s2.studentName = blah.next();
        System.out.print("Enter in the student's quiz grade: ");
        s2.averageQuizGrades = blah.nextInt();
        System.out.print("Enter in the student's midterm grade: ");
        s2.midtermGrade = blah.nextInt();
        System.out.print("Enter in the student's final exam grade: ");
        s2.finalExamGrade = blah.nextInt();
        s2.Grades();
        
        Grades s3 = new Grades(); //object
        System.out.print("What is the student's name? ");
        s3.studentName = blah.next();
        System.out.print("Enter in the student's quiz grade: ");
        s3.averageQuizGrades = blah.nextInt();
        System.out.print("Enter in the student's midterm grade: ");
        s3.midtermGrade = blah.nextInt();
        System.out.print("Enter in the student's final exam grade: ");
        s3.finalExamGrade = blah.nextInt();
        s3.Grades();
        
        Grades s4 = new Grades(); //object
        System.out.print("What is the student's name? ");
        s4.studentName = blah.next();
        System.out.print("Enter in the student's quiz grade: ");
        s4.averageQuizGrades = blah.nextInt();
        System.out.print("Enter in the student's midterm grade: ");
        s4.midtermGrade = blah.nextInt();
        System.out.print("Enter in the student's final exam grade: ");
        s4.finalExamGrade = blah.nextInt();
        s4.Grades();
        
        Grades s5 = new Grades(); //object
        System.out.print("What is the student's name? ");
        s5.studentName = blah.next();
        System.out.print("Enter in the student's quiz grade: ");
        s5.averageQuizGrades = blah.nextInt();
        System.out.print("Enter in the student's midterm grade: ");
        s5.midtermGrade = blah.nextInt();
        System.out.print("Enter in the student's final exam grade: ");
        s5.finalExamGrade = blah.nextInt();
        s5.Grades();
        
    }
}