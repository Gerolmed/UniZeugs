public class DualNumberChecker {
    public static boolean isDualNumber(String str) {
        for(char chr : str.toCharArray())
            if(chr != '0' && chr != '1')
                return false;
        return true;
    }
}
