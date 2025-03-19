import java.util.Scanner;

public class WordCount {

    // Method to get a sentence input from the user
    public static String getSentenceInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        return scanner.nextLine(); // Return the input sentence
    }

    // Method to count the number of words in a sentence
    public static int countWords(String sentence) {
        // Split the sentence by whitespace and filter out empty strings
        String[] words = sentence.trim().split("\\s+");
        return words.length; // Return the number of words
    }

    public static void main(String[] args) {
        // Get the sentence from the user
        String sentence = getSentenceInput();
        
        // Count the words in the sentence
        int wordCount = countWords(sentence);
        
        // Display the word count to the user
        System.out.println("The sentence has " + wordCount + " words.");
    }
}