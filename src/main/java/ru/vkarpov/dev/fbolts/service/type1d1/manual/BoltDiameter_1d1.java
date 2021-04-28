package ru.vkarpov.dev.fbolts.service.type1d1.manual;
/*
 * All possible foundation bolts diameters for type 1.1
 */
public enum BoltDiameter_1d1 {
    D12(12),
    D16(16),
    D20(20),
    D24(24),
    D30(30),
    D36(36),
    D42(42),
    D48(48);

    public final int count;

    BoltDiameter_1d1(int count) {
        this.count = count;
    }
}
