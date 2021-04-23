package ru.vkarpov.dev.fbolts.service.type1d1;
/*
 * Calculation of bolt blank parameters
 */
public interface WorkpieceCalculation {

    double sweepLengthCalculation(int diameterBolt, int straightPartLengthBolt, int curvedPartLengthBolt);
    double weightStudCalculation(int diameterBolt, double sweepLengthBolt);
}
