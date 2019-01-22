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

        if(str.length() == 0)
            return false;

        char minChar = minChar(str.toUpperCase());
        char maxChar = maxChar(str.toUpperCase());

        chr = (chr + "").toUpperCase().charAt(0);

        return (chr >= minChar) && (chr <= maxChar);
    }
}
