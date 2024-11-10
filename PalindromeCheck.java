import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word: ");
        String word = scan.nextLine();

        if(checkPalindrome(word))
            System.out.println("The word '" + word + "' is a palindrome word");
        else
            System.out.println("The word is NOT a palindrome word.");

    }

    public static boolean checkPalindrome(String str){

        for(int i = 0, j = str.length()-1; i < j; i++, j--){
            if(str.charAt(i) != str.charAt(j))
                return false;
        }
        return true;

    }
}
