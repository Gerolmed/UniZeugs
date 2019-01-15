public class ArrayDivider {

    /**
     * Divides array section of elements by divisor
     * @param numbers
     * @param lowerLimit
     * @param upperLimit
     * @param divisor
     * @return
     */
    public static int[] divideArray(int[] numbers, int lowerLimit, int upperLimit, int divisor) {

        try {

            for(int i = lowerLimit; i <= upperLimit; i++)
                numbers[i] = numbers[i]/divisor;

            System.out.println("Division was successful.");
        } catch (NullPointerException e) {
            System.out.println("No array found.");
        } catch (ArithmeticException e) {
            System.out.println("Division by 0 is not defined.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Limit was out of bounds of array.");
        }

        return numbers;
    }

}
