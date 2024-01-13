package Q1;

public class InstructorInfo extends Name {
    private String officeLocation;
    public InstructorInfo (){
    }//Empty default constructor
    public InstructorInfo(String fN, String lN, String oL){
        super (fN,lN);
        officeLocation = oL;
    }//Writes value to parent using super and assign value to officeLocation
    public String toString(){
        return super.toString() + "Office Location: " + officeLocation;
    }
    //Overwrites toString with new given information
}
