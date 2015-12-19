package gradestester;

/**
 *
 * @author Aashka Patel 
 */
   public class Grades
{    
        //variables
        String studentName;
        double midtermGrade;
        double finalExamGrade;
        double averageQuizGrades;
        
        //calculate the grades
    public void Grades()   
    {
        double finalMark = ((finalExamGrade * .50) + (midtermGrade * .25) + (averageQuizGrades * .25));    
      
            if (finalMark >= 90)
                {
                System.out.println (studentName+ "'s final grade in the class is "+ finalMark);
                System.out.println (studentName+ "'s final letter grade is a(n) A");
                System.out.println ("\n");
                }
            else if (finalMark >= 80 && finalMark <90)
                {
                System.out.println (studentName+ "'s final grade in the class is "+ finalMark);
                System.out.println (studentName+ "'s final letter grade is a(n) B");
                System.out.println ("\n");
                }
            else if (finalMark >= 70 && finalMark <80)
                {
                System.out.println (studentName+ "'s final grade in the class is "+ finalMark);
                System.out.println (studentName+ "'s final letter grade is a(n) C");
                System.out.println ("\n");
                System.out.println ("\n");
                }
            else if (finalMark >= 60 && finalMark <70)
                {
                System.out.println (studentName+ "'s final grade in the class is "+ finalMark);
                System.out.println (studentName+ "'s final letter grade is a(n) D");
                System.out.println ("\n");
                }
            else if (finalMark < 60)
                {
                System.out.println (studentName+ "'s final grade in the class is "+ finalMark);
                System.out.println (studentName+ "'s final letter grade is a(n) F");
                System.out.println ("\n");
                }
 
        }
 
}