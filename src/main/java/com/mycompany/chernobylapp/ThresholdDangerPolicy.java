package com.mycompany.chernobylapp;

public class ThresholdDangerPolicy implements DangerPolicy {
    private final double warningThreshold;
    private final double criticalThreshold;

    public ThresholdDangerPolicy(double warningThreshold, double criticalThreshold) {
        if (criticalThreshold <= warningThreshold) {
            throw new IllegalArgumentException("criticalThreshold deve essere maggiore di warningThreshold");
        }
        this.warningThreshold = warningThreshold;
        this.criticalThreshold = criticalThreshold;
    }

    @Override
    public DangerLevel valuta(double valore) {
        if (valore > criticalThreshold) {
            return DangerLevel.CRITICAL;
        }
        if (valore > warningThreshold) {
            return DangerLevel.WARNING;
        }
        return DangerLevel.SAFE;
    }
}
