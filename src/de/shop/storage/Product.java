package de.shop.storage;

import java.text.DecimalFormat;

public class Product {

    public final String NAME;
    private final int PRODUCT_NUMBER;

    private double priceBuy, priceSell;
    public int stock;

    public Product(String NAME, int PRODUCT_NUMBER, double priceBuy, double priceSell, int stock) {
        this.NAME = NAME;
        this.PRODUCT_NUMBER = PRODUCT_NUMBER;
        this.priceBuy = priceBuy;
        this.priceSell = priceSell;
        this.stock = stock;
    }

    public Product(String NAME, int PRODUCT_NUMBER, double priceBuy, double priceSell) {
        this.NAME = NAME;
        this.PRODUCT_NUMBER = PRODUCT_NUMBER;
        this.priceBuy = priceBuy;
        this.priceSell = priceSell;
    }


    public int getPRODUCT_NUMBER() {
        return PRODUCT_NUMBER;
    }

    public double getPriceBuy() {
        return priceBuy;
    }

    public double getPriceSell() {
        return priceSell;
    }

    public void priceChange(double change) {
        this.priceSell += change;
    }

    @Override
    public boolean equals(Object obj) {

        if(!(obj instanceof Product))
            return false;

        Product pr = (Product) obj;

        return pr.PRODUCT_NUMBER == this.PRODUCT_NUMBER;
    }

    @Override
    public String toString() {
        return NAME+" costs $"+new DecimalFormat("#.00").format(getPriceSell())+". There are "+stock+" left in stock.";
    }
}
