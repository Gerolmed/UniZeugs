/**
 * The amazingly fun coop game is now available to your local klappkroutsch TM.
 * Enjoy milliseconds of fun. (Probably because of a slow computer and raging teammates)
 * The competitive mode is extraordinary and tends to end with a tie. (Using the Trueskill-Algorithm (not!!))
 * Family Game Award 2020.
 * "So much fun" - nobody
 * "10/10" - GameStar
 * "No my live seems boring compared to this game" - still nobody
 */
public class FizzBuzz {

    public void play(int goal) {
        for(int i = 1; i <= goal; i++) {
            if(i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz");
            else if(i % 3 == 0)
                System.out.println("Fizz");
            else if(i % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }

    public static void main(String[] args) {
        new FizzBuzz().play(100);
    }

}
