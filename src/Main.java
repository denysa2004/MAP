//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Universitat university = new Universitat();
        Array array = new Array();
        ArrayNumbers arrayNumber=new ArrayNumbers();

        int[] grades = {29, 37, 38, 41, 84, 67};
        int[] numbers = {4,8,3,10,17,3};

        int[] array1={1,3,0,0,0,0,0,0,0};
        int[] array2={9,6,0,0,0,0,0,0,0};
        int[] newNumber=arrayNumber.addArray(array1,array2);

        //ausreicehende Noten
        int[] insufficientGrades = university.ausreichend(grades);
        System.out.println("Aufgabe1");
        System.out.print('[');
        for (int i = 0; i < insufficientGrades.length; i++) {
            if (i != insufficientGrades.length - 1)
                System.out.print(insufficientGrades[i] + ", ");
            else
                System.out.print(insufficientGrades[i]);

        }
        System.out.println(']');
        //durchschnittsnote
        System.out.println(university.averageGrade(grades));

        //abgerundete Noten
        int[] roundedGrades = university.roundedGrades(grades);
        System.out.print("[");
        for (int i = 0; i < roundedGrades.length; i++) {
            if (i != roundedGrades.length - 1)
                System.out.print(roundedGrades[i] + ",");
            else
                System.out.print(roundedGrades[i]);
        }
        System.out.println(']');

        //maximale abgerundete Note
        System.out.println(university.maximumRoundedGrade());


        //maximale Zahl
        System.out.println("Aufgabe 2 ");
        System.out.println("1) Maximale Zahl : "+array.maximNumber(numbers));

        //minimale Zahl
        System.out.println("b) Minimale Zahl : "+array.minimNumber(numbers));

        //maximale Summe
        System.out.println("c)Maximale Summe: "+array.maximSum(numbers));

        //minimale Summe
        System.out.println("d)Minimale Summe: "+array.minimSum(numbers));

        //Aufgabe3
        //a)
        System.out.println("Aufgabe3");
        System.out.print("Die Summe des Arrays : [");
        for(int index=0;index<newNumber.length;index++)
            System.out.print(" "+newNumber[index]);
        System.out.print(" ]");
    }

    }
