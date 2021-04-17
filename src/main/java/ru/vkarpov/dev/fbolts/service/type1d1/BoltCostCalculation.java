package ru.vkarpov.dev.fbolts.service.type1d1;

public class BoltCostCalculation implements CostCalculation {
    @Override
    public float costStudCalculation(float weightStud, float priceMetal) {
        return weightStud * priceMetal;
    }
}
