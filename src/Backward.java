public class Backward {
    public static String reverseString(String str) {
        StringBuilder retVal = new StringBuilder();

        char[] chars = str.toCharArray();

        for(char character : chars)
            retVal.insert(0, character);

        return retVal.toString();
    }
}
