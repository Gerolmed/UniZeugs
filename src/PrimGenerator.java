import java.util.ArrayList;

public class PrimGenerator {

    public Integer[] getMyPrims(int first, int last) {
        ArrayList<Integer> prims = new ArrayList<>();

        for(int i = first; i < last; i++) {
            if(i == 0 || i == 1)
                continue;

            if(isPrim(i))
                prims.add(i);
        }

        return prims.toArray(new Integer[prims.size()]);
    }

    public static boolean isPrim(int base) {
        for(int dwn = base-1; dwn > 1; dwn--) {
            if(base % dwn == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        printPrims(0, 10);
    }

    public static void printPrims(int a, int b) {
        Integer[] prims = new PrimGenerator().getMyPrims(a, b);
        for(Integer integer : prims)
            System.out.println(integer);
        System.out.println("Found "+prims.length+" primes in the range of "+a+" to "+b+".");
    }
}
