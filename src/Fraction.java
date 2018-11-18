public class Fraction {
    public int numerator, denominator;//Should be kept private

    public float toDecimal() {
        return numerator/(float)denominator;
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

        int smallestNewDenominator = MathHelper.lcm(this.denominator, fr.denominator);

        fraction.numerator = this.numerator * (smallestNewDenominator/this.denominator)
                + fr.numerator * (smallestNewDenominator/fr.denominator);
        fraction.denominator = smallestNewDenominator;

        return fraction;
    }

    public Fraction subtract(Fraction fr) {
        Fraction fraction = new Fraction();

        int smallestNewDenominator = MathHelper.lcm(this.denominator, fr.denominator);

        fraction.numerator = this.numerator * (smallestNewDenominator/this.denominator)
                + fr.numerator * (smallestNewDenominator/fr.denominator);
        fraction.denominator = smallestNewDenominator;

        return fraction;
    }

    public Fraction divide(Fraction fr) {
        return multiply(fr.inverse());
    }
}
