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

    public int[] subtractArray(int[] array1, int[] array2) {
        int[] newArray = new int[array1.length];
        int carry=0;

        for (int index = array1.length - 1; index >= 0; index--) {
            int firstNumber = array1[index] - carry;
            int secondNumber = array2[index];

            if (firstNumber < secondNumber) {
                firstNumber += 10;
                carry = 1;
            } else {
                carry = 0;
            }

            newArray[index] = firstNumber - secondNumber;
        }

        return newArray;
        }


    public int[] multiplyArray(int[] array1, int number) {

        int[] newArray = new int[array1.length+1];
        int carry = 0;
        for (int index = array1.length - 1; index >= 0; index--) {
            int sum = array1[index] * number + carry;
            newArray[index + 1] = sum % 10;
            carry = sum / 10;

        }

        newArray[0] = carry;
        return newArray;
    }

    public int[] divideArray(int[] array1, int number) {

        int[] newArray = new int[array1.length+1];
        int carry = 0;
        for (int index =0; index <= array1.length-1; index++) {
            if(array1[index]%number==0){
                int div = carry*10+array1[index] / number ;
                newArray[index]=div;
                carry=0;
            }
            else {
                int div = array1[index] / number ;
                newArray[index]=div;
                carry=array1[index]%number;
            }


        }
        return newArray;
    }
}