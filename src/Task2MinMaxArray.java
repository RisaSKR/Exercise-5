import java.util.Random;

public class Task2MinMaxArray {
    public static void main(String[] args) {
        Random r = new Random();
        int min = 100, max = 0;

        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
            System.out.println(a[i] + " ");

        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min)
                min = a[i];
            if (a[i] > max)
                max = a[i];
        }
        System.out.println("Minimum value is = " + min);
        System.out.println("Maximum value is = " + max);


    }
}
