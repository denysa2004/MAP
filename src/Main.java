//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Universitat university = new Universitat();
        Array array = new Array();
        ArrayNumbers arrayNumber=new ArrayNumbers();
        ElectronicShop electronicShop=new ElectronicShop();

        int[] grades = {29, 37, 38, 41, 84, 67};
        int[] numbers = {4,8,3,10,17,3};



        //nicht ausreichende Noten
        int[] insufficientGrades = university.insufficient(grades);
        System.out.println("Aufgabe1");
        System.out.print('[');
        for (int index = 0; index < insufficientGrades.length; index++) {
            if (index != insufficientGrades.length - 1)
                System.out.print(insufficientGrades[index] + ", ");
            else
                System.out.print(insufficientGrades[index]);

        }
        System.out.println(']');
        //durchschnittsnote
        System.out.println(university.averageGrade(grades));

        //abgerundete Noten
        int[] roundedGrades = university.roundedGrades(grades);
        System.out.print("[");
        for (int index = 0; index < roundedGrades.length; index++) {
            if (index != roundedGrades.length - 1)
                System.out.print(roundedGrades[index] + ",");
            else
                System.out.print(roundedGrades[index]);
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

        int[] array1={8,3,0,7,0,0,0,0,0};
        int[] array2={8,2,0,8,0,0,0,0,0};

        int number=5;
        int[] newNumberafterAdd=arrayNumber.addArray(array1,array2);
        int[] newNumberafterSub=arrayNumber.subtractArray(array1,array2);
        int[] newNumberafterMul=arrayNumber.multiplyArray(array1,number);
        int[] newNumberafterDiv=arrayNumber.divideArray(array1,number);

        System.out.println("Aufgabe3");
        System.out.print("Die Summe des Arrays : [");
        for(int index=0;index<newNumberafterAdd.length;index++)
            System.out.print(" "+newNumberafterAdd[index]);
        System.out.println(" ]");


        System.out.print("Die Subtraktion des Arrays : [");
        int counter=0;
        while(newNumberafterSub[counter]==0){
            counter++;}
        for(int index=counter;index<newNumberafterSub.length;index++)
            System.out.print(" "+newNumberafterSub[index]);
        System.out.println(" ]");

        System.out.print("Die Multiplikation des Array : [");
        for(int index=0;index<newNumberafterMul.length;index++)
           System.out.print(" "+newNumberafterMul[index]);
        System.out.println(" ]");


        System.out.print("Die Division des Array : [");
        for(int index=0;index<newNumberafterDiv.length;index++)
            System.out.print(" "+newNumberafterDiv[index]);
        System.out.println(" ]");

        System.out.println("Aufgabe 4");
        int[] tastaturPrice={60,40};
        int[] usbPrice={8,12};
        int budget=60;

        System.out.println("Die billigste Tastatur mit dem Preis "+electronicShop.cheapestTastatur(tastaturPrice));
        System.out.println("Die teuerste Gegenstand mit dem Preis "+electronicShop.mostExpensiveItem(tastaturPrice,usbPrice));
        System.out.println("Die teuerste USB der Mark kaufen kann hat den Preis "+electronicShop.mostExpensivePurchase(usbPrice,budget));
        System.out.println("Die teuersten zwei Gegenstade die Mark kaufen kann " +electronicShop.mostExpensivePurchases(tastaturPrice,usbPrice,budget));
    }

}
