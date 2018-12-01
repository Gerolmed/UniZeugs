package de.shop.storage;

public class DVDPlayer extends Product{

    private String currentDVD;
    private boolean blueRay;

    public DVDPlayer(String NAME, int PRODUCT_NUMBER, double priceBuy, double priceSell, int stock, String currentDVD, boolean blueRay) {
        super(NAME, PRODUCT_NUMBER, priceBuy, priceSell, stock);
        this.currentDVD = currentDVD;
        this.blueRay = blueRay;
    }

    public DVDPlayer(String NAME, int PRODUCT_NUMBER, double priceBuy, double priceSell, boolean blueRay) {
        super(NAME, PRODUCT_NUMBER, priceBuy, priceSell);
        this.currentDVD = "";
        this.blueRay = blueRay;
    }


    public void changeDVD(String newDVD) {
        this.currentDVD = newDVD;
    }

    public boolean getBlueRay() {
        return blueRay;
    }

    public String getCurrentDVD() {
        return currentDVD;
    }

    @Override
    public boolean equals(Object obj) {

        if(!(obj instanceof DVDPlayer))
            return false;

        DVDPlayer pr = (DVDPlayer) obj;

        return pr.currentDVD.equals(this.getCurrentDVD()) &&
                pr.getBlueRay() == this.getBlueRay();
    }
}
