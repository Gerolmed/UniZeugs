public class Car {

    private String licensePlate;
    private int seats, mileage;
    private boolean antennaOut = true;

    public Car() {
        this(5);
    }

    public Car(int seats) {
        this("R-UR 18", seats);
    }

    public Car(String licensePlate, int seats) {
        this.licensePlate = licensePlate;
        this.seats = seats;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public int getSeats() {
        return seats;
    }


    public int getMileage() {
        return mileage;
    }

    public void drive(int mileage) {
        this.mileage += mileage;
    }

    public boolean isAntennaOut() {
        return antennaOut;
    }

    public void retractAntenna() {
        this.antennaOut = false;
    }
    public void raiseAntenna() {
        this.antennaOut = true;
    }

    public void beforeWashing() {
        retractAntenna();
    }

    public void wash() {
        beforeWashing();

        System.out.println("Working at the car wash! Car wash Yeah!");
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Car &&

                ((Car)obj).getLicensePlate()
                        .equals(this.getLicensePlate());
    }

    @Override
    public String toString() {
        return "Dat brumm brumm hat ne numma: " + getLicensePlate() +
                " Da koennen bis zu "+ getSeats() + " Leudes zusammen fahren." +
                " By the way, die Antenne iz " + isAntennaOut() +
                " Kaud die Karre nich, sie ist schon " + getMileage() + " Meilen gefahren.";
    }
}
