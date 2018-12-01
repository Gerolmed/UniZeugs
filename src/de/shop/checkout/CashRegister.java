package de.shop.checkout;

import de.shop.storage.Product;

import java.text.DecimalFormat;

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

    public void sell(Product product, int amount) {
        product.stock -= amount;
        cash += amount * product.getPriceSell();
        customers++;

    }

    public void orderNewProduct(Product product, int amount) {
        double price = amount * product.getPriceBuy();

        if(price > cash)
            return;

        product.stock += amount;
        cash = cash - amount * product.getPriceBuy();

        return;
    }

    @Override
    public String toString() {
        return "Amount of cash: $"+new DecimalFormat("#.00").format(getCash()) +". Today there were "+customers+" customers at the Cash-Register.";
    }
}
