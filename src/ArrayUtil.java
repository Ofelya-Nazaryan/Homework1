import java.util.Arrays;

public class ArrayUtil {

    //return minimum element in array
    public int minElement(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < temp) {
                temp = arr[i];
            }
        }
        return temp;
    }

    //return maximum element in array
    public int maxElementIndex(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > temp) {
                temp = arr[i];
            }
        }
        return temp;
    }

    //return minimum element first index in array
    public int minElementIndex(int[] arr) {
        int index = 0;
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < temp) {
                temp = arr[i];
                index = i;
            }
        }
        return index;


    }

    //return maximum element first index in array
    public int maxElement(int[] arr) {
        int temp = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > temp) {
                temp = arr[i];
                index = i;
            }
        }
        return index;
    }

    //sum of elements in array
    public int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    //average of elements in array
    public int average(int[] arr) {
        int average = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            average = sum / arr.length;
        }
        return average;
    }

    //return array element multiplication
    public int product(int[] arr) {
        int sum = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum = sum * arr[i];
            }
        }
        return sum;
    }

    // return multiplication of elements with odd index;
    public int productOfOddIndex(int[] arr) {
        int sum = 1;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                sum = sum * arr[i];
            }
        }
        return sum;
    }

   // return even element into new array
    public  int[] evenNumbers(int[] arr) {
        int length = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                length++;
            }
        }
        int[] newArray = new int[length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                newArray[j++] = arr[i];
        }
        }

        for (j = 0; j <length ; j++) {
            System.out.print(newArray[j]);
        }

        return newArray;
    }

}

