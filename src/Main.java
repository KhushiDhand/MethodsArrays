import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        //Problem1
        int[] array = {1, 2, 3, 4};
        System.out.println("Adding Values " + Arrays.toString(array1(array)));
        //Problem 2
        int [] array4 = {1,2,3,4};
        System.out.println("Deleting Values " + Arrays.toString(array6(array4)));
        //Problem 3
        int [] sequence = {5,7,9};
        System.out.println("Inserting values " +Arrays.toString(array5(sequence)));

    }
    //Problem 1
    static int[] array1(int[] temp) {
        int[] addarray = {4, 5, 6, 7};
        int totalLength = addarray.length + temp.length;

        int[] result = new int[totalLength];
        int i = 0;
        for (i = 0; i < temp.length; i++) {
            result[i] = temp[i];
        }
        for (int y = 0; y < addarray.length; y++) {
            result[i] = addarray[y];
            i++;
        }
        return result;
    }
    //Problem 2
    static int [] array6(int[] digits){

        int[] deleteArray ={5,6,7};
        int sumLength = deleteArray.length + digits.length-1;
        int[] result3 = new int[sumLength];
        int j =0;
        for(j = 0; j< digits.length; j++){
            result3[j] = digits[j];
        }
        j=4;
        for(int y = 0; y < deleteArray.length-1; y++){
            result3[j] = deleteArray[y];
            j++;
        }
        return result3;
    }
    //Problem 3
    static int [] array5(int [] values){
        int value1 = 6;
        int value2 = 8;
        int value1Index = 1;
        int value2Index = 3;

        int[] result1 = new int[values.length+2];
        int j = 0;
        for (j = 0; j < result1.length; j++) {
            if (j == value1Index) {
                result1[j] = value1;
                result1[j + 1] = values[j];
            } else if (j == value2Index) {
                result1[j] = value2;
                result1[j + 1] = values[j-1];
            }
        }
        result1[0]=values[0];

        return result1;
    }
}

