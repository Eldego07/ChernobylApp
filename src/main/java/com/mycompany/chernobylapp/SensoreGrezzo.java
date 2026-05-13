/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chernobylapp;

/**
 *
 * @author CASOLARO.DIEGO
 */
public class SensoreGrezzo {

    public String id;
    public String tipo; // "GEIGER", "TERMICO", "CHIMICO"
    public double valore;

    public SensoreGrezzo(String id, String tipo, double valore) {
        this.id = id;
        this.tipo = tipo;
        this.valore = valore;
    }
    
}
