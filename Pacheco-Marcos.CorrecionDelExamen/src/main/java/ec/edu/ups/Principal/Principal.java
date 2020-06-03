/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Principal;

import ec.edu.ups.controlador.ControladorElectrodomestico;
import ec.edu.ups.dao.ElectrodomesticoDAO;
import ec.edu.ups.vista.VistaElectrodomestico;
import java.util.Scanner;

/**
 *
 * @author xpacheco
 */
public class Principal {
    
        public static void main(String[] args) {
            
        ElectrodomesticoDAO electrodomesticoDAO = new ElectrodomesticoDAO();
        VistaElectrodomestico vistaElectrodomestico = new VistaElectrodomestico();
        ControladorElectrodomestico controladorElectrodomestico = new ControladorElectrodomestico(vistaElectrodomestico, electrodomesticoDAO);
        
        int opc;
        boolean inicio = true;
        Scanner ad = new Scanner(System.in);
        
        while (inicio) {
            System.out.println("\n  MENU  ");
            System.out.println("[1]INGRESAR TELEVISION  ");
            System.out.println("[2]INGRESAR LAVADORA ");
            System.out.println("[3]LISTAR TELEVISION     ");
            System.out.println("[4]LISTAR LAVADORA  ");
            System.out.println("[5]SALIR                ");
            System.out.print("INGRESE LA OPCION\t");
            opc =ad.nextInt();

            switch (opc) {

                case 1: for (int i = 1; i < 4; i++) {
                        System.out.println("TELEVISOR NUMERO" + i + ":  ");
                        controladorElectrodomestico.registrarTelevision();
                        }

                case 2: for (int i = 1; i < 4; i++) {
                        System.out.println("LAVADORA NUMERO" + i + ":  ");
                        controladorElectrodomestico.RegistrarLavadora();
                        }
  
                case 3: controladorElectrodomestico.verTelevisiones();

                case 4: controladorElectrodomestico.verLavadoras();

                default:
                    
                    System.out.println("HA FINALIZADO");
                    inicio = false;
                    break;

            }

        }
    }
}
