package ru.vkarpov.dev.fbolts.service.type1d1;

public class BoltCostCalculation implements CostCalculation, WorkpieceCalculation {

    private static final double BENDING_RATIO = 0.644;
    private static final double WEIGHT_RATIO = 24.65;

    @Override
    public double costStudCalculation(double weightStud, double priceMetal) {
        return weightStud * priceMetal;
    }

    @Override
    public double sweepLengthCalculation(int diameterBolt, int straightPartLengthBolt, int curvedPartLengthBolt) {
        return (straightPartLengthBolt + curvedPartLengthBolt) - BENDING_RATIO * diameterBolt;
    }

    @Override
    public double weightStudCalculation(int diameterBolt, double sweepLengthBolt) {
        return WEIGHT_RATIO * Math.pow((diameterBolt / 20.0), 2) * (sweepLengthBolt / 10000);
    }
}
