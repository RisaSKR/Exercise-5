public class Task1FillingArray {
    public static void main(String[] args) {
        int[] Array;
        Array =new int[10];


        for (int i = 0; i < Array.length; i++) {
            Array[i] = Array.length-1-i; // number 9-0
        }

        System.out.println("The program will show Array: ");

        for (int i = 0; i < Array.length; i++){
            System.out.println("Array["+i+"]="+Array[i]);
        }


    }
}
