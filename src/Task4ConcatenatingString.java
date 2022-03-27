import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4ConcatenatingString
{
    public static void main(String[] args) throws IOException {
        String con1,con2;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the first string: ");
        con1 = br.readLine();
        System.out.println("Enter the second string: ");
        con2 = br.readLine();

        String word1,word2;
        word1 = con1.concat(con2);
        System.out.println("Adding 1st to the 2nd word = " +word1);
        word2 = con2.concat(con1);
        System.out.println("Adding 2nd to the 1st word = " +word2);

        System.out.println("The composition of " +word2+ " alternating : " +word1.equals(word1));
        System.out.println("The composition of " +word1+ " alternating : " +word2.equals(word2));


    }
}
