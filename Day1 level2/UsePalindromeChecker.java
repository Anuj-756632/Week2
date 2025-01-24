import java.util.Scanner;
class PalindromeChecker {

    // Attribute to store the text
    private String text;

    // Constructor to initialize the PalindromeChecker with text
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        // Remove spaces and convert to lower case for case-insensitive comparison
        String cleanedText = text.replaceAll("\\s+", "").toLowerCase();
        
        // Compare the original cleaned text with its reversed version
        String reversedText = new StringBuilder(cleanedText).reverse().toString();
        
        return cleanedText.equals(reversedText);
    }

    // Method to display the result of palindrome check
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }

    
}

public class UsePalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        // Creating PalindromeChecker objects with different strings
        PalindromeChecker checker1 = new PalindromeChecker(text);
        PalindromeChecker checker2 = new PalindromeChecker(text);
        PalindromeChecker checker3 = new PalindromeChecker(text);

        // Displaying results
        checker1.displayResult();  // Expected: madam is a palindrome
        checker2.displayResult();  // Expected: hello is not a palindrome
        checker3.displayResult();  // Expected: A man a plan a canal Panama is a palindrome
    }
}
