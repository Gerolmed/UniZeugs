public class DualNumberChecker {
    public static boolean isDualNumber(String str) {

        if(str == null || str.length() == 0)
            return false;

        for(char chr : str.toCharArray())
            if(chr != '0' && chr != '1')
                return false;
        return true;
    }
}
