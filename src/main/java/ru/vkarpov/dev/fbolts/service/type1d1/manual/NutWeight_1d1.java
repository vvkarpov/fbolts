package ru.vkarpov.dev.fbolts.service.type1d1.manual;
/*
 * Weight of nuts
 */
public enum NutWeight_1d1 {
    D12(0.02),
    D16(0.04),
    D20(0.07),
    D24(0.12),
    D30(0.24),
    D36(0.42),
    D42(0.62),
    D48(0.96);

    public final double weight;

    NutWeight_1d1(double weight) {
        this.weight = weight;
    }

}
