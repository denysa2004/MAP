public class Array {

    public int maximaleZahl(int[] zahlen){
        int maximum = 0;
        for(int index=0; index<zahlen.length; index++){
            if(zahlen[index] > maximum){
                maximum = zahlen[index];
            }
        }
        return maximum;
    }

    public int minimaleZahl(int[] zahlen){
        int minimum=zahlen[0];
        for(int index=1; index<zahlen.length; index++){
            if(zahlen[index]<minimum)
            {
                minimum = zahlen[index];
            }
        }
        return minimum;
    }
    public int maximaleSumme(int[] zahlen){
        int minimum=minimaleZahl(zahlen);
        int sum=0;
        int minimaleZahlAuftriit=0;
        for(int index=0; index<zahlen.length; index++){
            if(zahlen[index]!=minimum ){
                sum+=zahlen[index];
            }
            else{
                minimaleZahlAuftriit++;
            }

        }
        if(minimaleZahlAuftriit!=1)
            sum=sum+(minimaleZahlAuftriit-1)*minimum;
        return sum;
    }
}
