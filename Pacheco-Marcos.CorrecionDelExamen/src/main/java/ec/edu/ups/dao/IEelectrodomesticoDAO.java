/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import java.util.List;

/**
 *
 * @author xpacheco
 */
public interface IEelectrodomesticoDAO {
    
    public void crearTelevision(Television television);
    public void crearLavadora(Lavadora lavadora);
    public List<Lavadora> listarLavadora();
    public List<Television> listarTelevision();
    
}
