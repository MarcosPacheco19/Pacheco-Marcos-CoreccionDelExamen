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
public class Lavadora extends Electrodomestico {
    
     private int carga;

    public Lavadora() {
    }

    
    public Lavadora(int codigo) {
        super(codigo);
    }

    //getters y setters
    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        super.toString();
        return "Lavadora{" + "carga=" + carga + '}';
    }

    //metodo obtenerPrecioFinal
    @Override
    public double obtenerPrecioFinal() {
        super.obtenerPrecioFinal();
        if (this.carga > 30) {
            super.setPrecioBase(getPrecioBase() + 50);
        }
        return super.getPrecioBase();
    }
}
