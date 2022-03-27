import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5Palindrome
{
    public static void main(String[] args) throws IOException {
        String word,reverse ="";
        boolean palindrome = true;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("This program will check Palindrome");
        System.out.println("Enter a word only in lowercase: ");
        word = br.readLine().toLowerCase();

        for(int i = word.length() - 1; i >= 0; i--){
            reverse += word.charAt(i);
        }
        for (int i = 0; i < word.length(); i++){
            if(word.charAt(i) != reverse.charAt(i)){
                palindrome = false;
            }
        }
        if (palindrome) {
            System.out.println("It is palindrome!");
        }else{
            System.out.println("It is not palindrome!!");
        }

    }
}
