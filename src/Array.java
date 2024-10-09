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
}
