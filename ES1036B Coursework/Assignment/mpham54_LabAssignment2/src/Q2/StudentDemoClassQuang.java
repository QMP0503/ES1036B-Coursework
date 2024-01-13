package Q2;
/*
Quang Pham
Student Number: 251271238
Thu, Feb 19, 2023
This program display student information.
 */
public class StudentDemoClassQuang {
    public static void main(String[] args){
        Q1.CircleInfoQuang.myHeader(2,2,"Display student information.");
        Student student = new Student();
        System.out.printf("Here is my information:\n" +
                "=======================\n" +
                "I am %s\n" +
                "Student Number: %d\n" +
                "Email address: %s\n" +
                "Age: %d\n",
                student.getName(),student.getStudentNumber(),student.getEmailAddress(),student.getAge());
        //Print student information
        Student student1 = new Student(250221375,"Addie","Slowgrave");
        Student student2 = new Student(250309716,"Talia","Hanscom");
        //student information of 2 students
        System.out.printf("\nHere is the info on other students:\n" +
                "Number\tName\n" +
                "========= ================\n" +
                "%d %s\n" +
                "%d %s\n" +
                "==========================",
                student1.getStudentNumber(), student1.getName(),
                student2.getStudentNumber(),student2.getName());
        Q1.CircleInfoQuang.myFooter(2);
        //print student information for two students
    }
}
