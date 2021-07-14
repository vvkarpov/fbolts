package ru.vkarpov.dev.fbolts.service.type1d1.utils;
import ru.vkarpov.dev.fbolts.service.type1d1.manual.BoltCurvedLength_1d1;

public class GetValuesFromManual {

    public static int getBoltCurvedLength(int diameterBolt){
        return BoltCurvedLength_1d1.valueOf("D" + diameterBolt).count;
    }

}
