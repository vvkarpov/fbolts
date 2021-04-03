package ru.vkarpov.dev.fbolts.service.type1d1;
/*
 * Calculation of bolt blank parameters
 */
public interface WorkpieceCalculation {

    float sweepLengthBolt(int diameterBolt, int straightPartLengthBolt, int curvedPartLengthBolt);
    float weightBolt(int diameterBolt, float sweepLengthBolt);
}
