import java.util.Random;
import java.util.Scanner;

/**
 * Other than its name might suggest, not the computer, but the human has to guess the number.
 * Through various scientifically approved tests we discovered that you can find any number with at least 7 tries :)
 */
public class GuessNumber {

    /**
     * Generates a random number between the two values (inclusive) with the given seed.
     * @param seed - generation seed
     * @param from - start value (inclusive)
     * @param to - end value (inclusive)
     * @return - the random number
     */
    private int generateNumber(int seed, int from, int to) {
        return new Random(seed).nextInt(to) + from;
    }

    public static void main(String[] args){

        //Generate a random integer between 1 (inclusive) and 100 (inclusive).
        int magicNumber = new GuessNumber().generateNumber(1, 1, 100);
        System.out.println("I am thinking about a Number. Can you guess which one it is?");

        //Let us get ready to await the input
        Scanner input = new Scanner(System.in);

        //Lets go and make da user input things
        int userInput = -333333333; //Illuminati confirmed!!
        boolean started = false;

        do {
            if(started)
                if(userInput < magicNumber)
                    System.out.println("This is not the Number I was thinking about. It is bigger. Try again!");
                else
                    System.out.println("This is not the Number I was thinking about. It is smaller. Try again!");
            else
                started = true;

            userInput = input.nextInt();

        } while (userInput != magicNumber);

        System.out.println("You got it! The Number I was thinking about is: "+magicNumber+".");

    }

}
