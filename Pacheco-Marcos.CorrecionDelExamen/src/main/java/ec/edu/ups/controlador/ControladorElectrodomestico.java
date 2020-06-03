/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.dao.ElectrodomesticoDAO;
import ec.edu.ups.modelo.Electrodomestico;
import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import ec.edu.ups.vista.VistaElectrodomestico;
import java.util.List;

/**
 *
 * @author xpacheco
 */
public class ControladorElectrodomestico {
    
     
    private VistaElectrodomestico vistaElectrodomestico;
    private Electrodomestico electrodomestico;
    private ElectrodomesticoDAO electrodomesticoDAO;

    
    // constructor
    public ControladorElectrodomestico(VistaElectrodomestico vistaElectrodomestico, ElectrodomesticoDAO electrodomesticoDAO) {
        this.vistaElectrodomestico = vistaElectrodomestico;
        this.electrodomesticoDAO = electrodomesticoDAO;
    }

    // metodo registrarTelevision
    public void registrarTelevision(){
        Television television = vistaElectrodomestico.ingresarTelevision();
        electrodomesticoDAO.crearTelevision(television);
    }
    
    //metodo registrarLavadora
    public void registrarLavadora(){
        Lavadora lavadora = vistaElectrodomestico.ingresarLavadora();
        electrodomesticoDAO.crearLavadora(lavadora);
    }
    
    //metodo verLavadoras
    public void verLavadoras(){
        List lavadoras = electrodomesticoDAO.listarLavadora();
        vistaElectrodomestico.mostrarLavadora(lavadoras);
     
    }
    
    //metodo verTelevisiones
    public void verTelevisiones(){
        List televisiones = electrodomesticoDAO.listarTelevision();
        vistaElectrodomestico.mostrarTelevisiones(televisiones);
    }
    
}
