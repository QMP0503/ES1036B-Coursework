package Q2;

public class Student {
    private int studentNumber;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private int yearOfBirth;
    //assign variable types and access level to difference values
    public Student(){
        studentNumber= 251271238;
        firstName="Quang";
        lastName="Pham";
        emailAddress="mpham@uwo.ca";
        yearOfBirth= 2004;
    } //information of student QUANG PHAM
    public Student(int sn, String fName, String lName){
        studentNumber=sn;
        firstName=fName;
        lastName=lName;
        emailAddress="";
        yearOfBirth=0;
    } //student information assigned in diver class
    public int getStudentNumber(){
        return studentNumber;
    }
    public String getName(){
        return  firstName + " "+ lastName;
    }
    public String getEmailAddress(){
        return emailAddress;
    }
    public int getAge(){
        return 2023-yearOfBirth;
    }

    //Output for assigned values.
}
