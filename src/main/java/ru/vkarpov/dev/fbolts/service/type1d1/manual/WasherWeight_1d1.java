package ru.vkarpov.dev.fbolts.service.type1d1.manual;
/*
 * Weight of washer
 */
public enum WasherWeight_1d1 {
    D12(0.006),
    D16(0.011),
    D20(0.017),
    D24(0.032),
    D30(0.054),
    D36(0.092),
    D42(0.183),
    D48(0.294);

    public final double weight;

    WasherWeight_1d1(double weight) {
        this.weight = weight;
    }
}
