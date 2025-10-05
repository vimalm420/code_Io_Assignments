package weeklyAssignments.week5.question2.report;
import weeklyAssignments.week5.question2.student.Address;
import weeklyAssignments.week5.question2.student.Student;

import java.util.Scanner;
public class ReportGenerator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter city,state :");
        Address a1=new Address(scanner.next(),scanner.next());
        System.out.println();

        int[] marks=new int[5];
        System.out.println("enter marks :");
        for(int i=0;i<5;i++)

            marks[i]=scanner.nextInt();

        System.out.println("Enter name,rollno :");
        Student s1=new Student(scanner.next(),scanner.nextInt(),marks,a1);
        System.out.println();
        System.out.println();


        s1.DisplayStudentDetails();
    }

}
