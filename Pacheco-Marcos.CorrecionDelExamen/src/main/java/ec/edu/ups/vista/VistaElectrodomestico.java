/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author xpacheco
 */
public class VistaElectrodomestico {
    
    private Scanner entrada;

    public VistaElectrodomestico() {
        entrada = new Scanner(System.in);
    }
    
    
    //metdoo ingresarLavadora
    public Television ingresarTelevision(){
        Television tlv = new Television();
        
        System.out.print("HA ESCOGIDO INGRESAR UNA TELEVISION\n");
        System.out.print("INGRESE EL CODIGO:\t  ");
        int codigo = entrada.nextInt();
        entrada.nextLine();
        System.out.print("\nINGRESE LA DESCRIPCION:\t");
        String descripcion = entrada.nextLine();
        System.out.print("\nINGRESE EL PRECIO BASE:\t");
        double precio = entrada.nextDouble();
        entrada.nextLine();
        System.out.print("\nINGRESE EL COLOR:\t");
        String color = entrada.nextLine();
        System.out.print("\nINGRESE EL CONSUMO ENERGETICO:\t");
        String energia = entrada.next();
        char consumo = energia.charAt(0);
        System.out.print("\nINGRESE EL PESO:\t");
        int peso = entrada.nextInt();
        System.out.print("\nINGRESE LA RESOLUCION:\t");
        int resolucion = entrada.nextInt();
        System.out.print("\nINGRESE SI TIENE PUERTOS HDMI (TRUE/FALSE):\t");
        boolean hdmi = entrada.nextBoolean();
        
        tlv.setCodigo(codigo);
        tlv.setDescripcion(descripcion);
        tlv.setPrecioBase(precio);
        tlv.setColor(color);
        tlv.setConsumoEnergetico(consumo);
        tlv.setPeso(peso);
        tlv.setResolucion(resolucion);
        tlv.setPuertoHDMI(hdmi);
        
        return tlv;
    }
    
    
    //metodo  ingresarLavadora
    public Lavadora ingresarLavadora() {
        Lavadora lvd = new Lavadora();
        
        System.out.print("HA ESCOGIDO INGRESAR UNA  LAVADORA\n");
        System.out.print("INGRESE EL CODIGO:\t  ");
        int codigo = entrada.nextInt();
        entrada.nextLine();
        System.out.print("\nINGRESE LA DESCRIPCION:\t");
        String descripcion = entrada.nextLine();
        System.out.print("\nINGRESE EL PRECIO BASE:\t");
        double precio = entrada.nextDouble();
        entrada.nextLine(); 
        System.out.print("\nINGRESE EL COLOR:\t");
        String color = entrada.nextLine();
        System.out.print("\nINGRESE EL CONSUMO ENERGETICO:\t");
        String energia = entrada.next();
        char consumo = energia.charAt(0); 
        System.out.print("\nINGRESE EL PESO:\t");
        int peso = entrada.nextInt();
        System.out.print("\nINGRESE LA RESOLUCION:\t");
        int resolucion = entrada.nextInt();
        System.out.print("\nINGRESE LA CARGA:\t");
        int carga = entrada.nextInt();
        
        lvd.setCodigo(codigo);
        lvd.setDescripcion(descripcion);
        lvd.setPrecioBase(precio);
        lvd.setColor(color);
        lvd.setConsumoEnergetico(consumo);
        lvd.setPeso(peso);
        lvd.setCarga(carga);
        
        return lvd;
    }
    
    //metodo mostrarLavadoras
    public void mostrarLavadora(List<Lavadora> lavadoras) {
        System.out.println("\nLAVADORAS\n");
        System.out.println(lavadoras);
    }
    
    //metodo mostrarTelevisiones
    public void mostrarTelevisiones(List<Television> televisiones) {
        System.out.println("\nTELEVISIONES\n");
        System.out.println(televisiones);
    }
}
