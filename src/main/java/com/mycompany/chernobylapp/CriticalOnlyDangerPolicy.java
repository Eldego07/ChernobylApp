package com.mycompany.chernobylapp;

public class CriticalOnlyDangerPolicy implements DangerPolicy {
    private final double criticalThreshold;

    public CriticalOnlyDangerPolicy(double criticalThreshold) {
        this.criticalThreshold = criticalThreshold;
    }

    @Override
    public DangerLevel valuta(double valore) {
        if (valore > criticalThreshold) {
            return DangerLevel.CRITICAL;
        }
        return DangerLevel.SAFE;
    }
}
