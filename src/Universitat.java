public class Universitat {

    public int[] insufficientGrades;
    public int[] roundedGrades;

    public int[] insufficient(int[] grades) {
        int insufficientGradesNumber= 0;
        for (int index = 0; index < grades.length; index++) {
            if (grades[index] < 40) {
                insufficientGradesNumber++;
            }
        }
        insufficientGrades = new int[insufficientGradesNumber];

        int index = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < 40) {
                insufficientGrades[index] = grades[i];
                index++;
            }
        }
        return insufficientGrades;
    }

    public double averageGrade(int[] grades) {
        float sum = 0;
        for (int index = 0; index < grades.length; index++) {
            sum += grades[index];
        }
        double average = sum / grades.length;
        return (Math.round(average * 100) / 100.00);
    }

    public int[] roundedGrades(int[] grades) {
         int gradesNumber=grades.length;
         roundedGrades = new int[gradesNumber];

        for (int index = 0; index <grades.length; index++) {
            int rest = grades[index] % 5;
            if (grades[index] >= 38 && (grades[index] + 5 - rest) - grades[index] < 3)
                    roundedGrades[index]=grades[index] + 5 - rest;
                else
                    roundedGrades[index]=grades[index] ;

        }
        return roundedGrades;
    }


    public int maximumRoundedGrade(){
        int maximRoundedGrade=0;
        for(int index=0;index<roundedGrades.length;index++){
            if(roundedGrades[index]>maximRoundedGrade)
                maximRoundedGrade=roundedGrades[index];
        }
        return maximRoundedGrade;
    }


}


