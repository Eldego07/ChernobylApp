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
            String statoPuraFollia = "OK";
            
            // LOGICA DI CALCOLO CENTRALIZZATA (Pessima pratica)
            if (s.tipo.equals("GEIGER")) {
                if (s.valore > 500.0) statoPuraFollia = "PERICOLO NUCLEARE";
                else if (s.valore > 100.0) statoPuraFollia = "ATTENZIONE";
            } 
            else if (s.tipo.equals("TERMICO")) {
                if (s.valore > 1000.0) statoPuraFollia = "FUSIONE CORE";
                else if (s.valore > 500.0) statoPuraFollia = "SURRISCALDAMENTO";
            } 
            else if (s.tipo.equals("CHIMICO")) {
                if (s.valore > 50.0) statoPuraFollia = "TOSSICO";
            }

            // Output mischiato alla logica di business
            System.out.println("Sensore: " + s.id + " [" + s.tipo + "]");
            System.out.println("Lettura: " + s.valore);
            System.out.println("Stato: " + statoPuraFollia);
            System.out.println("------------------------------------");
        }
    }
}
