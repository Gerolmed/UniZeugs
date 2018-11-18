public class Fraction {
    public int numerator, denominator;//Should be kept private

    /**
     * @return - Fraction as a decimal
     */
    public float toDecimal() {
        return numerator/(float)denominator;
    }

    /**
     * Returns a inverted version of this fraction
     *
     * @return
     */
    public Fraction inverse() {
        Fraction fraction = new Fraction();

        fraction.numerator = this.denominator;
        fraction.denominator = this.numerator;

        return fraction;
    }

    /**
     * returns a multiplied version of the fraction with the given
     * @param fr
     * @return
     */
    public Fraction multiply(Fraction fr) {
        Fraction fraction = new Fraction();

        fraction.numerator = this.numerator * fr.numerator;
        fraction.denominator = this.denominator * fr.denominator;

        return fraction;
    }

    /**
     * returns the fraction result of the fraction instance added to the parameter one
     * @param fr
     * @return
     */
    public Fraction add(Fraction fr) {
        Fraction fraction = new Fraction();

        int smallestNewDenominator = MathHelper.lcm(this.denominator, fr.denominator);

        fraction.numerator = this.numerator * (smallestNewDenominator/this.denominator)
                + fr.numerator * (smallestNewDenominator/fr.denominator);
        fraction.denominator = smallestNewDenominator;

        return fraction;
    }

    /**
     * return the fraction result of the fraction instance minus the parameter one
     * @param fr
     * @return
     */
    public Fraction subtract(Fraction fr) {
        Fraction fraction = new Fraction();

        int smallestNewDenominator = MathHelper.lcm(this.denominator, fr.denominator);

        fraction.numerator = this.numerator * (smallestNewDenominator/this.denominator)
                - fr.numerator * (smallestNewDenominator/fr.denominator);
        fraction.denominator = smallestNewDenominator;

        return fraction;
    }

    /**
     * return the fraction result of the fraction instance divided by the parameter one
     * @param fr
     * @return
     */
    public Fraction divide(Fraction fr) {
        return multiply(fr.inverse());
    }
}
