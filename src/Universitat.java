public class Universitat {

    public int[] nichtAusreichendeNoten;
    public int[] abgerundeteNoten;

    public int[] ausreichend(int[] noten) {
        int nichtAusreichendeNotenZahl = 0;
        for (int i = 0; i < noten.length; i++) {
            if (noten[i] < 40) {
                nichtAusreichendeNotenZahl++;
            }
        }
        nichtAusreichendeNoten = new int[nichtAusreichendeNotenZahl];

        int index = 0;
        for (int i = 0; i < noten.length; i++) {
            if (noten[i] < 40) {
                nichtAusreichendeNoten[index] = noten[i];
                index++;
            }
        }
        return nichtAusreichendeNoten;
    }

    public double durchschnittsNote(int[] noten) {
        float sum = 0;
        for (int i = 0; i < noten.length; i++) {
            sum += noten[i];
        }
        double average = sum / noten.length;
        return (Math.round(average * 100) / 100.00);
    }

    public int[] abgerundeteNoten(int[] noten) {
        int notenZahl=noten.length;
        abgerundeteNoten = new int[notenZahl];

        for (int i = 0; i < noten.length; i++) {
            int rest = noten[i] % 5;
            if (noten[i] >= 38 && (noten[i] + 5 - rest) - noten[i] < 3)
                    abgerundeteNoten[i]=noten[i] + 5 - rest;
                else
                    abgerundeteNoten[i]=noten[i] ;

        }
        return abgerundeteNoten;
    }


    public int maximaleAbgerundeteNoten(){
        int maxim=0;
        for(int i=0;i<abgerundeteNoten.length;i++){
            if(abgerundeteNoten[i]>maxim)
                maxim=abgerundeteNoten[i];
        }
        return maxim;
    }


}


