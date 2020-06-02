/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.modelo.Electrodomestico;
import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author xpacheco
 */
public class ElectrodomesticoDAO {
    
    private SortedSet<Electrodomestico> lista;

    public ElectrodomesticoDAO() {
        
        lista = new TreeSet<>();
    }
    
    public void crearTelevision(Television television) {
        lista.add(television);
    }

    public void crearLavadora(Lavadora lavadora) {
        lista.add(lavadora);
    }

    public List<Lavadora> listarLavadora() {
        List lavadoras = new ArrayList<>();
        
        for (Electrodomestico electrodomestico : this.lista) {
           if (electrodomestico instanceof Lavadora) {
               lavadoras.add(electrodomestico);
           }
        }
        
        return lavadoras;
    }

    public List<Television> listarTelevision() {
        List televisiones = new ArrayList<>();
        
        for (Electrodomestico electrodomestico : this.lista) {
           if (electrodomestico instanceof Television) {
               televisiones.add(electrodomestico);
           }
        }
        
        return televisiones;
        
    }
}
