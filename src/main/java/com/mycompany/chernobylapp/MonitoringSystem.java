/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chernobylapp;

import java.util.*;

/**
 *
 * @author CASOLARO.DIEGO
 */
class MonitoringSystem {
    public void analizzaDati(List<SensoreGrezzo> sensori) {
        System.out.println("=== RAPPORTO TELEMETRIA CHERNOBYL ===");
        
        for (SensoreGrezzo s : sensori) {
            DangerLevel livelloPericolo = s.valutaPericolo();

            System.out.println("Sensore: " + s.getId() + " [" + s.getTipo() + "]");
            System.out.println("Lettura: " + s.getValore());
            System.out.println("Stato: " + livelloPericolo);
            System.out.println("------------------------------------");
        }
    }
}
