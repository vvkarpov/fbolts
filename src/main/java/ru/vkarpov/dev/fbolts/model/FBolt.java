package ru.vkarpov.dev.fbolts.model;

public class FBolt {

    private int diameterBolt;
    private int straightPartLengthBolt;
    private double priceMetal;
    private int countBolts;

    public FBolt(int diameterBolt, int straightPartLengthBolt, double priceMetal, int countBolts) {
        this.diameterBolt = diameterBolt;
        this.straightPartLengthBolt = straightPartLengthBolt;
        this.priceMetal = priceMetal;
        this.countBolts = countBolts;
    }

    public int getDiameterBolt() {
        return diameterBolt;
    }

    public void setDiameterBolt(int diameterBolt) {
        this.diameterBolt = diameterBolt;
    }

    public int getStraightPartLengthBolt() {
        return straightPartLengthBolt;
    }

    public void setStraightPartLengthBolt(int straightPartLengthBolt) {
        this.straightPartLengthBolt = straightPartLengthBolt;
    }

    public double getPriceMetal() {
        return priceMetal;
    }

    public void setPriceMetal(double priceMetal) {
        this.priceMetal = priceMetal;
    }

    public int getCountBolts() {
        return countBolts;
    }

    public void setCountBolts(int countBolts) {
        this.countBolts = countBolts;
    }
}
