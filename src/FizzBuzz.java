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
