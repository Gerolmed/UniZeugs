/**
 * Created by maxim on 25.10.2018.
 */
public class MathHelper {

    public static int ggc(int a, int b) {
        if (b == 0)
            return a;
        else
            return ggc(b, a % b);
    }

    public static int lcm(int a, int b) {
        int t = ggc(a, b);
        return (a * b) / t;
    }
}
