package ru.vkarpov.dev.fbolts.service.type1d1;

public interface WorkpieceCalculation {

    float sweepLengthBolt(int diameterBolt, int straightPartLengthBolt, int curvedPartLengthBolt);
    float weightBolt(int diameterBolt, float sweepLengthBolt);
}
