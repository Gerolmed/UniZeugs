package de.shop.checkout;

import de.shop.storage.Product;

public class CashRegister {
    private double cash;
    private static int customers;

    public CashRegister() {
        this(100);
    }
    public CashRegister(double cash) {
        this.cash = cash;
    }

    public double getCash() {
        return cash;
    }

    public int getCustomers() {
        return customers;
    }

    public void sell(int amount, Product product) {
        customers++;
        product.stock -= amount;
        cash += amount * product.getPriceSell();

    }

    public double orderNewProduct(int amount, Product product) {
        double price = amount * product.getPriceSell();

        if(price > cash)
            return cash;

        product.stock += amount;
        cash -= amount * product.getPriceSell();

        return cash;
    }

    @Override
    public String toString() {
        return "Amount of cash: $"+cash+". Today there were "+customers+" customers at the Cash-Register.";
    }
}
