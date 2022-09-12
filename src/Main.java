public class Main {

    public static void main(String[] args) {


        int myArray[]={1,7,6,6,6};
        evenNumbers(myArray);



    }

    public  static int[] evenNumbers(int[] arr) {
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








