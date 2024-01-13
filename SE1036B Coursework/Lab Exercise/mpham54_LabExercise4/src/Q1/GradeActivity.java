package Q1;
//This is given to the students.
//They need to write comments to get 2 Marks
public class GradeActivity{
        private double[] grade;
        private double score;
        private int outOf;
        private double percentScore;
        public GradeActivity(){}//Empty default constructor
        public GradeActivity(double score, int outOf){
            this.outOf = outOf;
            this.score = score;
        }//Assigns values
        public GradeActivity(double[] grade, int outOf){
            this.outOf = outOf;
            this.grade = grade;
            double sum = 0;
            //Assigns values
            for(int i = 0; i< grade.length; i++){
                sum+= grade[i];
            }//Adds up all grades
            if(outOf == 100)
                score = sum;
            else
                score = sum/ grade.length;
            //Checks for conditions of score
        }
        public double getScore() {
            return score;
        }
        //Returns score
        public String getLetterGrade(){
            percentScore = score/outOf*100;
            if(Math.round(percentScore) >=90) return "A+";
            else if(Math.round(percentScore) >=80) return "A";
            else if(Math.round(percentScore) >=70) return "B";
            else if(Math.round(percentScore) >=60) return "C";
            else if(Math.round(percentScore) >=50) return "D";
            else return "F";
        }//Check for letter to assign to score
        @Override
        public String toString() {
            //The arguments of String.format() is written in the same way as the arguments of printf()
            return String.format("%.2f (out of %d), Letter Grade: %s [%d%%]", score,outOf, getLetterGrade(),Math.round(percentScore));
        }//Overwrite toString with new given information
}
