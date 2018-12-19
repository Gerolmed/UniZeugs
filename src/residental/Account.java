package residental;

public class Account {
    private String name;
    private int pin;
    private double balance;

    public Account(String name, int pin) {
        this.name = name;
        this.pin = Integer.parseInt((pin + "").substring((pin + "").length()-4));

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCurrentBalance() {
        return balance;
    }

    public boolean checkPin(int pin) {
        return this.pin == pin;
    }

    public void depositMoney(double money) {
        this.balance += money;
    }

    public boolean withdrawMoney(double money, int pin) {
        if(!checkPin(pin) || this.balance < money)
            return false;

        this.balance -= money;

        return true;
    }
}
