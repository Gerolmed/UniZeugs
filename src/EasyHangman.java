import java.util.ArrayList;
import java.util.Scanner;

public class EasyHangman {

    private Scanner overwatch;
    private String publicWord = "";
    private String secretWord = "";

    private ArrayList<Character> chars = new ArrayList<>();

    public EasyHangman() {
        overwatch = new Scanner(System.in);
    }

    public String readInSecretWord() {
        System.out.println("Insert your secret word (at least 5 characters):");

        String message = overwatch.nextLine();
        message = message.toUpperCase();

        for(char c : message.toCharArray()) {
            if(!checkIsLetter(c))
                message = message.replace(c+"", "");
        }

        return message;
    }

    public void init() {
        String msg = "";

        while(msg.length() < 5) {
            msg = readInSecretWord();
        }


        setSecretWord(msg);
        setPublicWord();

    }

    public void setPublicWord() {

        this.publicWord = "";

        for(char character : getSecretWord().toCharArray())
            if(chars.contains(character))
                publicWord += character;
            else
                publicWord += '_';
    }

    public void setSecretWord(String secretWord) {
        chars.clear();
        this.secretWord = secretWord;
    }

    public String getSecretWord() {
        return secretWord;
    }

    public String getPublicWord() {
        return publicWord;
    }

    public void updatePublicWord(char chr) {
        chars.add(chr);
        setPublicWord();
    }

    private boolean checkIsLetter(char c) {
        return c >= 'A' && c <= 'Z';
    }

    public void start() {
        init();



        int health = 9;

        while (true) {

            System.out.println(" ");
            System.out.println("What is my secret word?");
            System.out.println("Lives: "+ health);
            System.out.println(" ");
            System.out.println(getPublicWord());
            System.out.println("Input character:");

            char symb = overwatch.nextLine().toUpperCase().charAt(0);

            if(checkLetterExists(symb)) {
                updatePublicWord(symb);
                System.out.println("Correct! Keep it up.");
            } else {
                health--;
                System.out.println("Nope. I’m sorry.");
            }

            if(getPublicWord().equals(getSecretWord())) {
                System.out.println("The word was: " + getSecretWord());   
                System.out.println("You have won the game! :)");
                break;
            }
            if(health == 0) {
                System.out.println("The word was: " + getSecretWord());
                System.out.println("You have lost the game! :(");
                break;
            }
        }

        overwatch.close();

    }

    public boolean checkLetterExists(char symb) {
        return getSecretWord().contains((symb+"").toUpperCase());
    }

    public static void main(String[] args) {
        new EasyHangman().start();
    }
}
