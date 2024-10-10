//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Universitat universitat = new Universitat();
        Array array = new Array();
        int[] noten = {29, 37, 38, 41, 84, 67};
        int[] zahlen = {4,8,3,10,17,3};

        //ausreicehende Noten
        int[] nichtAusreichendeNoten = universitat.ausreichend(noten);
        System.out.print('[');
        for (int i = 0; i < nichtAusreichendeNoten.length; i++) {
            if (i != nichtAusreichendeNoten.length - 1)
                System.out.print(nichtAusreichendeNoten[i] + ", ");
            else
                System.out.print(nichtAusreichendeNoten[i]);

        }
        System.out.println(']');
        //durchschnittsnote
        System.out.println(universitat.durchschnittsNote(noten));

        //abgerundete Noten
        int[] abgerundeteNoten = universitat.abgerundeteNoten(noten);
        System.out.print("[");
        for (int i = 0; i < abgerundeteNoten.length; i++) {
            if (i != abgerundeteNoten.length - 1)
                System.out.print(abgerundeteNoten[i] + ",");
            else
                System.out.print(abgerundeteNoten[i]);
        }
        System.out.println(']');

        //maximale abgerundete Note
        System.out.println(universitat.maximaleAbgerundeteNoten());


        //maximale Zahl
        System.out.println("Aufgabe 2 ");
        System.out.println("1) Maximale Zahl : "+array.maximaleZahl(zahlen));

        //minimale Zahl
        System.out.println("b) Minimale Zahl : "+array.minimaleZahl(zahlen));

        //maximale Summe
        System.out.println("c)Maximale Summe: "+array.maximaleSumme(zahlen));

        //minimale Summe
        System.out.println("d)Minimale Summe: "+array.minimaleSumme(zahlen));
    }

    }
