public class ArrayNumbers {

    public int[] addArray(int[] array1, int[] array2) {
        int[] newArray = new int[array1.length + 1];
        int carry=0;

        for (int index = array1.length - 1; index >= 0; index--) {
            int sum = array1[index] + array2[index]+ carry;
            newArray[index+1] = sum % 10;
            carry=sum/10;


        }

            newArray[0]=carry;

        return newArray;
    }
}