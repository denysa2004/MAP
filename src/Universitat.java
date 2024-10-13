public class Universitat {

    public int[] insufficientGrades;
    public int[] roundedGrades;

    public int[] insufficient(int[] grades) {
        int insufficientGradesNumber= 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < 40) {
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
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        double average = sum / grades.length;
        return (Math.round(average * 100) / 100.00);
    }

    public int[] roundedGrades(int[] grades) {
         int gradesNumber=grades.length;
         roundedGrades = new int[gradesNumber];

        for (int i = 0; i <grades.length; i++) {
            int rest = grades[i] % 5;
            if (grades[i] >= 38 && (grades[i] + 5 - rest) - grades[i] < 3)
                    roundedGrades[i]=grades[i] + 5 - rest;
                else
                    roundedGrades[i]=grades[i] ;

        }
        return roundedGrades;
    }


    public int maximumRoundedGrade(){
        int maxim=0;
        for(int i=0;i<roundedGrades.length;i++){
            if(roundedGrades[i]>maxim)
                maxim=roundedGrades[i];
        }
        return maxim;
    }


}


