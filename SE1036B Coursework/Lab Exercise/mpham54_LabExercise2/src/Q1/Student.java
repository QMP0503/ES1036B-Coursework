package Q1;

public class Student {
    private String name;
    private int studentNumber;
    private int score;
    //declaring variable types in student class
    public Student() {
        name = "Quang Pham";
        studentNumber = 251271238;
        score = 100;
        //default value of student class
    }
    public Student(String nm, int sn, int sc){
        name = nm;
        studentNumber = sn;
        score = sc;
        //Assigning variable in student class arguments in constructor
    }
    public void printInfo(){
        System.out.printf("%-20s %-20d %-3d (Letter Grade: %-2s)\n",name,studentNumber,score,getLetterGrade());
        //Setting variable width for printed student information
    }
    public String getName(){
        return name;
    }//return student name
    public int getScore(){
        return score;
    }//return student score
    public void setName(String nm){
        name = nm;
    } //assign variable with argument
    public void setStudentNumber(int sn){
        studentNumber = sn;
    } //assign variable with argument
    public void setScore(int sc){
        score=sc;
    }//assign variable with argument
    public String getLetterGrade(){
        if(score >= 90)
            return "A+";
        else if(score>=80)
            return "A-";
        else if(score>=70)
            return "B+";
        else if(score>=60)
            return "B-";
        else if(score>=50)
            return "C+";
        else if(score>=40)
            return "C-";
        else if(score>=30)
            return "D";
        else
            return "F";
        //Letter grading system
    }

}

