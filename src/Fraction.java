public class Fraction {
    int numerator, denominator;

    public float toDecimal() {
        return numerator/denominator;
    }

    public Fraction inverse() {
        Fraction fraction = new Fraction();

        fraction.numerator = this.denominator;
        fraction.denominator = this.numerator;

        return fraction;
    }

    public Fraction multiply(Fraction fr) {
        Fraction fraction = new Fraction();

        fraction.numerator = this.numerator * fr.numerator;
        fraction.denominator = this.denominator * fr.denominator;

        return fraction;
    }

    public Fraction add(Fraction fr) {
        Fraction fraction = new Fraction();

        fraction.numerator = this.numerator + fr.numerator;
        fraction.denominator = this.denominator + fr.denominator;

        return fraction;
    }

    public Fraction subtract(Fraction fr) {
        Fraction fraction = new Fraction();

        fraction.numerator = this.numerator - fr.numerator;
        fraction.denominator = this.denominator - fr.denominator;

        return fraction;
    }


    public Fraction divide(Fraction fr) {
        return multiply(fr.inverse());
    }
}
