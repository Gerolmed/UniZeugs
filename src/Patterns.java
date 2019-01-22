public class Patterns {
    public static void printPattern(int start, int end, int step, boolean towardsZero) {

        System.out.print(start+" ");

        if(towardsZero)
            start-=step;
        else
            start+=step;

        if(start < 0 && towardsZero)
            printPattern(start,end,step,false);
        else if(start >= end && !towardsZero)
            System.out.print(start+" ");
        else printPattern(start,end,step,towardsZero);
    }

    public static void main(String[] args) {
        printPattern(15,15,4,true);
    }
}
