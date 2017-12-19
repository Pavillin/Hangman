package hangman;

import java.security.SecureRandom;

/**
 *
 * @author Dylan
 */
public class test {
    private static String randomWord;
    public static void main(String[] args) {
        getWord();
        displayGame();
        
    }
    /**
     * This method will have an array of words and randomly select one and store it in randomWord variable
     */
    public static void getWord() {
        String[] words = {"rain","trade","internet","java","television","education"};
        int numOfWords = words.length;
        
        SecureRandom random = new SecureRandom();
        int randomNum = random.nextInt(numOfWords);
        
        randomWord = words[randomNum];
    }
    /**
     * This method will display the game to the user
     */
    public static void displayGame() {
        System.out.println(randomWord);
        for(int i = 0; i<randomWord.length(); i++) {
            System.out.print("-");
        }
    }
}
