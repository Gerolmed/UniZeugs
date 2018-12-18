package oversea;

import residential.Account;

public class OverseaAccount extends Account {

    private double dirtyMoneyFee;
    private final double TRANSACTION_TAX_RATE;

    public OverseaAccount(String name, int pin) {
        super(name, pin);
        TRANSACTION_TAX_RATE = 0.1;
    }
    public OverseaAccount(String name, int pin, double taxRate) {
        super(name, pin);


        if(taxRate < 0 || taxRate > 1)
            TRANSACTION_TAX_RATE = 0.1;
        else
            TRANSACTION_TAX_RATE = taxRate;
    }


}
