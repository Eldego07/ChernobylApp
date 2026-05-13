/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chernobylapp;

import java.util.Objects;

/**
 *
 * @author CASOLARO.DIEGO
 */
public class SensoreGrezzo {

    private final String id;
    private final String tipo;
    private final double valore;
    private final DangerPolicy dangerPolicy;

    public SensoreGrezzo(String id, String tipo, double valore, DangerPolicy dangerPolicy) {
        this.id = Objects.requireNonNull(id, "id non puo' essere null");
        this.tipo = Objects.requireNonNull(tipo, "tipo non puo' essere null");
        this.valore = valore;
        this.dangerPolicy = Objects.requireNonNull(dangerPolicy, "dangerPolicy non puo' essere null");
    }

    public String getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValore() {
        return valore;
    }

    public DangerLevel valutaPericolo() {
        return dangerPolicy.valuta(valore);
    }
}
