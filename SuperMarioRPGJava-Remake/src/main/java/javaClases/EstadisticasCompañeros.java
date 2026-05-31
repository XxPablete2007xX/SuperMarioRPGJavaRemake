/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaClases;

/**
 *
 * @author Usuario
 */
public class EstadisticasCompañeros {
    
    private Personaje nombre;
    private int nivel;
    private int hp;
    private int maxHp;
    private int atkBase;
    private int atkTotal;
    private int mgAtkBase;
    private int mgAtkTotal;
    private int defBase;
    private int defTotal;
    private int mgDefBase;
    private int mgDefTotal;
    private int exp;
    private EstadoAlterado estadoAlterado;
    private Equipo arma;
    private Equipo armadura;
    private Equipo accesorio;

    public EstadisticasCompañeros(Personaje nombre, int nivel, int hp, int maxHp, int atkBase, int atkTotal, int mgAtkBase, int mgAtkTotal, int defBase, int defTotal, int mgDefBase, int mgDefTotal, int exp, EstadoAlterado estadoAlterado, Equipo arma, Equipo armadura, Equipo accesorio) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.hp = hp;
        this.maxHp = maxHp;
        this.atkBase = atkBase;
        this.atkTotal = atkTotal;
        this.mgAtkBase = mgAtkBase;
        this.mgAtkTotal = mgAtkTotal;
        this.defBase = defBase;
        this.defTotal = defTotal;
        this.mgDefBase = mgDefBase;
        this.mgDefTotal = mgDefTotal;
        this.exp = exp;
        this.estadoAlterado = estadoAlterado;
        this.arma = arma;
        this.armadura = armadura;
        this.accesorio = accesorio;
    }

    

    /**
     * @return the nombre
     */
    public Personaje getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(Personaje nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the nivel
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    /**
     * @return the hp
     */
    public int getHp() {
        return hp;
    }

    /**
     * @param hp the hp to set
     */
    public void setHp(int hp) {
        this.hp = hp;
    }

    /**
     * @return the maxHp
     */
    public int getMaxHp() {
        return maxHp;
    }

    /**
     * @param maxHp the maxHp to set
     */
    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    /**
     * @return the atkBase
     */
    public int getAtkBase() {
        return atkBase;
    }

    /**
     * @param atkBase the atkBase to set
     */
    public void setAtkBase(int atkBase) {
        this.atkBase = atkBase;
    }

    /**
     * @return the atkTotal
     */
    public int getAtkTotal() {
        return atkTotal;
    }

    /**
     * @param atkTotal the atkTotal to set
     */
    public void setAtkTotal(int atkTotal) {
        this.atkTotal = atkTotal;
    }

    /**
     * @return the mgAtkBase
     */
    public int getMgAtkBase() {
        return mgAtkBase;
    }

    /**
     * @param mgAtkBase the mgAtkBase to set
     */
    public void setMgAtkBase(int mgAtkBase) {
        this.mgAtkBase = mgAtkBase;
    }

    /**
     * @return the mgAtkTotal
     */
    public int getMgAtkTotal() {
        return mgAtkTotal;
    }

    /**
     * @param mgAtkTotal the mgAtkTotal to set
     */
    public void setMgAtkTotal(int mgAtkTotal) {
        this.mgAtkTotal = mgAtkTotal;
    }

    /**
     * @return the defBase
     */
    public int getDefBase() {
        return defBase;
    }

    /**
     * @param defBase the defBase to set
     */
    public void setDefBase(int defBase) {
        this.defBase = defBase;
    }

    /**
     * @return the defTotal
     */
    public int getDefTotal() {
        return defTotal;
    }

    /**
     * @param defTotal the defTotal to set
     */
    public void setDefTotal(int defTotal) {
        this.defTotal = defTotal;
    }

    /**
     * @return the mgDefBase
     */
    public int getMgDefBase() {
        return mgDefBase;
    }

    /**
     * @param mgDefBase the mgDefBase to set
     */
    public void setMgDefBase(int mgDefBase) {
        this.mgDefBase = mgDefBase;
    }

    /**
     * @return the mgDefTotal
     */
    public int getMgDefTotal() {
        return mgDefTotal;
    }

    /**
     * @param mgDefTotal the mgDefTotal to set
     */
    public void setMgDefTotal(int mgDefTotal) {
        this.mgDefTotal = mgDefTotal;
    }

    /**
     * @return the exp
     */
    public int getExp() {
        return exp;
    }

    /**
     * @param exp the exp to set
     */
    public void setExp(int exp) {
        this.exp = exp;
    }

    /**
     * @return the estadoAlterado
     */
    public EstadoAlterado getEstadoAlterado() {
        return estadoAlterado;
    }

    /**
     * @param estadoAlterado the estadoAlterado to set
     */
    public void setEstadoAlterado(EstadoAlterado estadoAlterado) {
        this.estadoAlterado = estadoAlterado;
    }

    /**
     * @return the arma
     */
    public Equipo getArma() {
        return arma;
    }

    /**
     * @param arma the arma to set
     */
    public void setArma(Equipo arma) {
        this.arma = arma;
    }

    /**
     * @return the armadura
     */
    public Equipo getArmadura() {
        return armadura;
    }

    /**
     * @param armadura the armadura to set
     */
    public void setArmadura(Equipo armadura) {
        this.armadura = armadura;
    }

    /**
     * @return the accesorio
     */
    public Equipo getAccesorio() {
        return accesorio;
    }

    /**
     * @param accesorio the accesorio to set
     */
    public void setAccesorio(Equipo accesorio) {
        this.accesorio = accesorio;
    }
    
    
    
    
}
