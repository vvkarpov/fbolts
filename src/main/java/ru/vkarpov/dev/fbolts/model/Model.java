package ru.vkarpov.dev.fbolts.model;

public class Model {
    private int diameterBolt;
    private int lengthBolt;
    private double sweepLengthBolt;
    private double weightStud;

    private int countNuts;
    private int countWashers;
    private int countBolts;

    private double weightNuts;
    private double weightWashers;
    private double weightBolts;

    private double priceMetal;
    private double priceNut;
    private double priceWasher;

    private double costStud;
    private double costNut;
    private double costWasher;

    private double priceStud;
    private double priceBolt;

    public Model(int diameterBolt, int lengthBolt, double sweepLengthBolt, double weightStud,
                 int countNuts, int countWashers, int countBolts, double weightNuts,
                 double weightWashers, double weightBolts, double priceMetal, double priceNut,
                 double priceWasher, double costStud, double costNut, double costWasher,
                 double priceStud, double priceBolt) {
        this.diameterBolt = diameterBolt;
        this.lengthBolt = lengthBolt;
        this.sweepLengthBolt = sweepLengthBolt;
        this.weightStud = weightStud;
        this.countNuts = countNuts;
        this.countWashers = countWashers;
        this.countBolts = countBolts;
        this.weightNuts = weightNuts;
        this.weightWashers = weightWashers;
        this.weightBolts = weightBolts;
        this.priceMetal = priceMetal;
        this.priceNut = priceNut;
        this.priceWasher = priceWasher;
        this.costStud = costStud;
        this.costNut = costNut;
        this.costWasher = costWasher;
        this.priceStud = priceStud;
        this.priceBolt = priceBolt;
    }

    public int getDiameterBolt() {
        return diameterBolt;
    }

    public void setDiameterBolt(int diameterBolt) {
        this.diameterBolt = diameterBolt;
    }

    public int getLengthBolt() {
        return lengthBolt;
    }

    public void setLengthBolt(int lengthBolt) {
        this.lengthBolt = lengthBolt;
    }

    public double getSweepLengthBolt() {
        return sweepLengthBolt;
    }

    public void setSweepLengthBolt(double sweepLengthBolt) {
        this.sweepLengthBolt = sweepLengthBolt;
    }

    public double getWeightStud() {
        return weightStud;
    }

    public void setWeightStud(double weightStud) {
        this.weightStud = weightStud;
    }

    public int getCountNuts() {
        return countNuts;
    }

    public void setCountNuts(int countNuts) {
        this.countNuts = countNuts;
    }

    public int getCountWashers() {
        return countWashers;
    }

    public void setCountWashers(int countWashers) {
        this.countWashers = countWashers;
    }

    public int getCountBolts() {
        return countBolts;
    }

    public void setCountBolts(int countBolts) {
        this.countBolts = countBolts;
    }

    public double getWeightNuts() {
        return weightNuts;
    }

    public void setWeightNuts(double weightNuts) {
        this.weightNuts = weightNuts;
    }

    public double getWeightWashers() {
        return weightWashers;
    }

    public void setWeightWashers(double weightWashers) {
        this.weightWashers = weightWashers;
    }

    public double getWeightBolts() {
        return weightBolts;
    }

    public void setWeightBolts(double weightBolts) {
        this.weightBolts = weightBolts;
    }

    public double getPriceMetal() {
        return priceMetal;
    }

    public void setPriceMetal(double priceMetal) {
        this.priceMetal = priceMetal;
    }

    public double getPriceNut() {
        return priceNut;
    }

    public void setPriceNut(double priceNut) {
        this.priceNut = priceNut;
    }

    public double getPriceWasher() {
        return priceWasher;
    }

    public void setPriceWasher(double priceWasher) {
        this.priceWasher = priceWasher;
    }

    public double getCostStud() {
        return costStud;
    }

    public void setCostStud(double costStud) {
        this.costStud = costStud;
    }

    public double getCostNut() {
        return costNut;
    }

    public void setCostNut(double costNut) {
        this.costNut = costNut;
    }

    public double getCostWasher() {
        return costWasher;
    }

    public void setCostWasher(double costWasher) {
        this.costWasher = costWasher;
    }

    public double getPriceStud() {
        return priceStud;
    }

    public void setPriceStud(double priceStud) {
        this.priceStud = priceStud;
    }

    public double getPriceBolt() {
        return priceBolt;
    }

    public void setPriceBolt(double priceBolt) {
        this.priceBolt = priceBolt;
    }
}
