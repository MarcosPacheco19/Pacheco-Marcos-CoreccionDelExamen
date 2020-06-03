/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author xpacheco
 */
public class Television extends Electrodomestico {
    
    //Atributos
    private int resolucion;
    private boolean puertoHDMI;

    public Television() {
    }

    //getters y setters
    public Television(int codigo) {
        super(codigo);
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isPuertoHDMI() {
        return puertoHDMI;
    }

    public void setPuertoHDMI(boolean puertoHDMI) {
        this.puertoHDMI = puertoHDMI;
    }

 
    //metodo toString
    @Override
    public String toString() {
        super.toString();
        return "Television{" + "resolucion=" + resolucion + ", puertoHDMI=" + puertoHDMI + '}';
    }
    
    //metodo obtenerPrecioFinal
       @Override
    public double obtenerPrecioFinal() {
        
        super.obtenerPrecioFinal();
        if (this.resolucion > 40) {
            super.setPrecioBase(getPrecioBase() * 0.7);
        }
        if (puertoHDMI == true) {
            super.setPrecioBase(getPrecioBase() + 50);
        }
        return super.getPrecioBase();
    }
    
}
