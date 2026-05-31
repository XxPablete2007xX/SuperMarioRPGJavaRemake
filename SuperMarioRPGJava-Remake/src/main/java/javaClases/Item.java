/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaClases;

/**
 *
 * @author Usuario
 */
public class Item {
    
    private String nombre;
    private String descripcion;
    private int curaHP;
    private int curaFP;
    private boolean curaEstado;
    private int cantidad;
    private int precioCompra;
    private int precioVenta;

    public Item(String nombre, String descripcion, int curaHP, int curaFP, boolean curaEstado, int cantidad, int precioCompra, int precioVenta) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.curaHP = curaHP;
        this.curaFP = curaFP;
        this.curaEstado = curaEstado;
        this.cantidad = cantidad;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
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
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the curaHP
     */
    public int getCuraHP() {
        return curaHP;
    }

    /**
     * @param curaHP the curaHP to set
     */
    public void setCuraHP(int curaHP) {
        this.curaHP = curaHP;
    }

    /**
     * @return the curaFP
     */
    public int getCuraFP() {
        return curaFP;
    }

    /**
     * @param curaFP the curaFP to set
     */
    public void setCuraFP(int curaFP) {
        this.curaFP = curaFP;
    }

    /**
     * @return the curaEstado
     */
    public boolean isCuraEstado() {
        return curaEstado;
    }

    /**
     * @param curaEstado the curaEstado to set
     */
    public void setCuraEstado(boolean curaEstado) {
        this.curaEstado = curaEstado;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the precioVenta
     */
    public int getPrecioVenta() {
        return precioVenta;
    }

    /**
     * @param precioVenta the precioVenta to set
     */
    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    /**
     * @return the precioCompra
     */
    public int getPrecioCompra() {
        return precioCompra;
    }

    /**
     * @param precioCompra the precioCompra to set
     */
    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }
    
    
    
    
}
