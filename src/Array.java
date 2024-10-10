public class Array {

    public int maximNumber(int[] numbers){
        int maximum = 0;
        for(int index=0; index<numbers.length; index++){
            if(numbers[index] > maximum){
                maximum = numbers[index];
            }
        }
        return maximum;
    }

    public int minimNumber(int[] numbers){
        int minimum=numbers[0];
        for(int index=1; index<numbers.length; index++){
            if(numbers[index]<minimum)
            {
                minimum = numbers[index];
            }
        }
        return minimum;
    }
    public int maximSum(int[] numbers){
        int minimum=minimNumber(numbers);
        int sum=0;
        int minimNumberAppearance=0;
        for(int index=0; index<numbers.length; index++){
            if(numbers[index]!=minimum ){
                sum+=numbers[index];
            }
            else{
                minimNumberAppearance++;
            }

        }
        if(minimNumberAppearance!=1)
            sum=sum+(minimNumberAppearance-1)*minimum;
        return sum;
    }
    public int minimSum(int[] numbers){
        int maximum=maximNumber(numbers);
        int sum=0;
        int maximNumberAppearance=0;
        for(int index=0; index<numbers.length; index++){
            if(numbers[index]!=maximum ){
                sum+=numbers[index];
            }
            else{
                maximNumberAppearance++;
            }

        }
        if(maximNumberAppearance!=1)
            sum=sum+(maximNumberAppearance-1)*maximum;
        return sum;
    }
}
