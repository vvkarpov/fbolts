package ru.vkarpov.dev.fbolts.service.type1d1.manual;
/*
 * Possible curved length for type 1.1
 */
public enum CurvedLength_1d1 {
    D12(40),
    D16(50),
    D20(60),
    D24(75),
    D30(90),
    D36(110),
    D42(125),
    D48(150);

    public final int count;

    CurvedLength_1d1(int count) {
        this.count = count;
    }
}
