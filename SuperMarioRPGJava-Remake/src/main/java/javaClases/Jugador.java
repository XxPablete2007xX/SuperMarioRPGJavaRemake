/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaClases;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Jugador implements Serializable{
    
    private String nombre;
    private int monedas;
    private int monedasRana;
    private LocalDate fecha;
    private long tiempo;
    private ArrayList<ObjetoEsp> objetosEspeciales = new ArrayList<>();
    private ArrayList<Item> items = new ArrayList<>();
    private ArrayList<Equipo> equipo = new ArrayList<>();

    public Jugador(String nombre, int monedas, int monedasRana, LocalDate fecha, long tiempo, ArrayList<ObjetoEsp> objetosEspeciales, ArrayList<Item> items, ArrayList<Equipo> equipo) {
        this.nombre = nombre;
        this.monedas = monedas;
        this.monedasRana = monedasRana;
        this.fecha = fecha;
        this.tiempo = tiempo;
        this.objetosEspeciales = objetosEspeciales;
        this.items = items;
        this.equipo = equipo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the monedas
     */
    public int getMonedas() {
        return monedas;
    }

    /**
     * @param monedas the monedas to set
     */
    public void setMonedas(int monedas) {
        this.monedas = monedas;
    }

    /**
     * @return the monedasRana
     */
    public int getMonedasRana() {
        return monedasRana;
    }

    /**
     * @param monedasRana the monedasRana to set
     */
    public void setMonedasRana(int monedasRana) {
        this.monedasRana = monedasRana;
    }

    /**
     * @return the fecha
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the tiempo
     */
    public long getTiempo() {
        return tiempo;
    }

    /**
     * @param tiempo the tiempo to set
     */
    public void setTiempo(long tiempo) {
        this.tiempo = tiempo;
    }

    /**
     * @return the objetosEspeciales
     */
    public ArrayList<ObjetoEsp> getObjetosEspeciales() {
        return objetosEspeciales;
    }

    /**
     * @param objetosEspeciales the objetosEspeciales to set
     */
    public void setObjetosEspeciales(ArrayList<ObjetoEsp> objetosEspeciales) {
        this.objetosEspeciales = objetosEspeciales;
    }

    /**
     * @return the items
     */
    public ArrayList<Item> getItems() {
        return items;
    }

    /**
     * @param items the items to set
     */
    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    /**
     * @return the equipo
     */
    public ArrayList<Equipo> getEquipo() {
        return equipo;
    }

    /**
     * @param equipo the equipo to set
     */
    public void setEquipo(ArrayList<Equipo> equipo) {
        this.equipo = equipo;
    }
    
    
}
