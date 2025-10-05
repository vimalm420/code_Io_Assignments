package weeklyAssignments.week5.question2.student;

public class Student {
    String name;
    int rollNo;
    int []marks=new int[5];
    Address a1;
    public Student(String name,int rollNo,int[] marks,Address a1){
        this.name=name;
        this.rollNo=rollNo;
        this.marks=marks;
        this.a1=a1;
    }
    public void DisplayStudentDetails(){
        System.out.println(name+" "+rollNo+" "+a1.city+" "+a1.state);

        for(int i=0;i< marks.length;i++)
            System.out.print(marks[i]+" ");
        System.out.println();
        System.out.println();
    }
}
