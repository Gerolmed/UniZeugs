package oversea;

import residental.Account;

public class OverseaAccount extends Account {

    private double dirtyMoneyFee;
    private final double TRANSACTION_TAX_RATE;

    public OverseaAccount(String name, int pin) {
        super(name, pin);
        TRANSACTION_TAX_RATE = 10;
    }
    public OverseaAccount(String name, int pin, double taxRate) {
        super(name, pin);


        if(taxRate < 0 || taxRate > 100)
            TRANSACTION_TAX_RATE = 10;
        else
            TRANSACTION_TAX_RATE = taxRate;
    }

    public double getFee() {
        return dirtyMoneyFee;
    }
    public double getTaxRate() {
        return TRANSACTION_TAX_RATE;
    }

    public double getChargeFee(double money) {
        return money * getTaxRate()/100;
    }

    @Override
    public void depositMoney(double money) {
        double fee =getChargeFee(money);
        super.depositMoney(money-fee);
        dirtyMoneyFee += fee;
    }
}
