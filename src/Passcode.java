import java.util.Scanner;

public class Passcode {
    private static class Lock {
        private int triesRemaining, password;
        private boolean locked = true;

        public Lock(int triesRemaining, int password) {
            this.triesRemaining = triesRemaining;
            this.password = password;
        }

        public boolean tryAccess(int password) {
            if(this.password == password)
                locked = false;
            else
                looseTry();
            return this.password == password;
        }
        public void looseTry() {
            triesRemaining--;
        }

        public boolean isLockedOut() {
            return triesRemaining <= 0;
        }

        public boolean isLocked() {
            return locked;
        }

        public int getTriesRemaining() {
            return triesRemaining;
        }
    }

    public static void main(String[] args) {
        Lock lock = new Lock(3, 1337);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert Passcode:");

        while (!lock.isLockedOut() && !lock.tryAccess(scanner.nextInt()) && !lock.isLockedOut()) {

            System.out.printf("Access denied! You have %s tries left.\n", lock.getTriesRemaining()+"");
            System.out.println("Please insert Passcode:");
        }

        if(lock.isLocked())
            System.out.println("Access denied!");
        else
            System.out.println("Access granted! The meaning of life is 42.");
    }
}
