package TASK2;
import java.util.*;

public class GradeCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of subjects");
        int numsub = sc.nextInt();
        double totalMarks = 0;
        for (int i = 0;i<numsub ;i++){
            System.out.println("enter your marks for subject"+(i+1)+"(out of 100)");
            totalMarks += sc.nextDouble();
        }
        double avgper = totalMarks/numsub;
        String grade;
        if (avgper >= 90)
        grade = "A+";
        else if (avgper >= 80)
            grade ="A";
        else if (avgper >= 70)
            grade ="B+";
        else if (avgper >= 60)
            grade = "B";
        else if (avgper >= 50)
            grade = "C+";
        else if (avgper >= 40)
            grade = "C";
        else
            grade = "F";
        System.out.println("\n total marks: " + totalMarks);
        System.out.println("Average percentage : %.2f%%\n"+avgper);
        System.out.println("grade"+ grade);
    }
}
