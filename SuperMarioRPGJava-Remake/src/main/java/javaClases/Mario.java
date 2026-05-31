/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaClases;

/**
 *
 * @author Usuario
 */
public class Mario extends EstadisticasCompañeros{
    
    private int fp;
    private int maxFp;

    public Mario(int fp, int maxFp, Personaje nombre, int nivel, int hp, int maxHp, int atkBase, int atkTotal, int mgAtkBase, int mgAtkTotal, int defBase, int defTotal, int mgDefBase, int mgDefTotal, int exp, EstadoAlterado estadoAlterado, Equipo arma, Equipo armadura, Equipo accesorio) {
        super(nombre, nivel, hp, maxHp, atkBase, atkTotal, mgAtkBase, mgAtkTotal, defBase, defTotal, mgDefBase, mgDefTotal, exp, estadoAlterado, arma, armadura, accesorio);
        this.fp = fp;
        this.maxFp = maxFp;
    }

    /**
     * @return the fp
     */
    public int getFp() {
        return fp;
    }

    /**
     * @param fp the fp to set
     */
    public void setFp(int fp) {
        this.fp = fp;
    }

    /**
     * @return the maxFp
     */
    public int getMaxFp() {
        return maxFp;
    }

    /**
     * @param maxFp the maxFp to set
     */
    public void setMaxFp(int maxFp) {
        this.maxFp = maxFp;
    }
    
    
}
