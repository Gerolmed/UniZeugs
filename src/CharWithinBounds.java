public class CharWithinBounds {
    public static char minChar(String string) {
        char character = string.charAt(0);

        for (char chr : string.toCharArray()) {
            if(chr < character)
                character = chr;
        }

        return character;

    }

    public static char maxChar(String string) {
        char character = string.charAt(0);

        for (char chr : string.toCharArray()) {
            if(chr > character)
                character = chr;
        }

        return character;

    }

    public static boolean charWithinBounds(char chr, String str) {
        char minChar = minChar(str);
        char maxChar = maxChar(str);

        return (chr >= minChar) && (chr <= maxChar);
    }
}
