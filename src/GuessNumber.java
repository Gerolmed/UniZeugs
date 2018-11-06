import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    /**
     * Generates a random number between the two values (inclusive) with the given seed.
     * @param seed - generation seed
     * @param from - start value (inclusive)
     * @param to - end value (inclusive)
     * @return - the random number
     */
    public int generateNumber(int seed, int from, int to) {
        return new Random(seed).nextInt(to) + from;
    }

    public static void main(String[] args){

        //Generate a random integer between 1 (inclusive) and 100 (inclusive).
        int magicNumber = 10; new GuessNumber().generateNumber(1, 1, 100);
        System.out.println("I am thinking about a Number. Can you guess which one it is?");

        //Let us get ready to await the input
        Scanner input = new Scanner(System.in);

        //Lets go and make da user input things
        int userInput = -333333333;
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

    }

}
