/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chernobylapp;

import java.util.*;

/**
 *
 * @author CASOLARO.DIEGO
 */
public class ChernobylApp {

    public static void main(String[] args) {
        List<SensoreGrezzo> dati = new ArrayList<>();
        dati.add(new SensoreGrezzo("R4-01", "GEIGER", 1200.0, new ThresholdDangerPolicy(100.0, 500.0)));
        dati.add(new SensoreGrezzo("Bunker-A", "TERMICO", 1100.0, new ThresholdDangerPolicy(500.0, 1000.0)));
        dati.add(new SensoreGrezzo("Air-01", "CHIMICO", 10.5, new CriticalOnlyDangerPolicy(50.0)));

        MonitoringSystem monitor = new MonitoringSystem();
        monitor.analizzaDati(dati);
    }
}
