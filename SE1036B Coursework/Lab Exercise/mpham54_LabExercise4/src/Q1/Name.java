package Q1;

public class Name {
    private String firstName;
    private String lastName;
    public Name(){
    }//Empty default constructor
    public Name (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }//Assign values to firstName and lastName (this.variableName was used because two variables have the same name)
    public String toString() {
        return ("Name:" + firstName + " "+ lastName);
    }//Overwrites toString method with new given information

}
