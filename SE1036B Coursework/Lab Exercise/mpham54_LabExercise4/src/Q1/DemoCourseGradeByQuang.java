package Q1;

import Lab3Q.MyMethod;

public class DemoCourseGradeByQuang {
    public static void main(String[] args){
        MyMethod.myHeader(4,1,"Calculate individual grades and final course grade for students.");
        //Header message
        CourseAndInstructor cInfo = new CourseAndInstructor("Programming Fundamentals", "Quazi", "Rahman", "TEB263");
        StudentInfo sInfo = new StudentInfo("Quang","Pham",251271238,cInfo);
        System.out.print("Student " + sInfo);
        //Prints out the student, instructor, and course information.
        System.out.println("=============================================");
        System.out.println("    Score Card (Based on the rounded Score)");
        System.out.println("=============================================");
        double[] labG = {15.0, 14.5, 14.5, 14.5, 14, 14.5, 14.5};
        GradeActivity avgLabG = new GradeActivity(labG,15);
        System.out.println("Lab Grade: " + avgLabG);
        double[] quizG = {18.33,20,19};
        GradeActivity avgQuizG = new GradeActivity(quizG,20);
        System.out.println("Quiz Grade: " + avgQuizG);
        GradeActivity midtermG = new GradeActivity(15.54,25);
        System.out.println("Midterm Grade: " + midtermG);
        GradeActivity finalG = new GradeActivity(32,40);
        System.out.println("Final Grade: " + finalG);
        //Assigns grade values, calculates the letter corresponding to the score, and prints it out
        System.out.println("============================================================");
        double[] finalScore = {finalG.getScore(), avgLabG.getScore(), midtermG.getScore(), avgQuizG.getScore()};
        GradeActivity courseG = new GradeActivity(finalScore,100);
        System.out.println("Course Grade: " + courseG);
        //Prints out the final course grade after adding all previous grades
        System.out.println("============================================================");
        GradeActivity avgBonusG = new GradeActivity(4.33,5);
        System.out.println("Average Bonus Grade: " + avgBonusG);
        GradeActivity reportedFinalG = new GradeActivity(courseG.getScore()+ avgBonusG.getScore(),100);
        System.out.println("Average Bonus Grade: " + reportedFinalG);
        //Prints out the reported final grade after adding the bonus marks
        System.out.println("==========================================================================");
        MyMethod.myFooter(1);
        //sign-off message
    }
}
