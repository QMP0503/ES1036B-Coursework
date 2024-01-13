package Q1;

public class CourseAndInstructor extends InstructorInfo{
    private String courseName;
    public CourseAndInstructor(){
    }//Empty default constructor
    public CourseAndInstructor(String cN, String fN, String lN, String oL){
        super (fN,lN,oL);
        courseName = cN;
    }//Writes values to parent using super and assigns value to courseName
    public String toString(){
        return courseName + "\n" + "Instructor's Info:\n" + super.toString() + " ";
    }
    //overwrite toString method with new given in class information

}
