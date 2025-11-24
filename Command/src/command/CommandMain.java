/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package command;

import electrodomestico.Cafetera;
import electrodomestico.Exprimidor;
import electrodomestico.Tostadora;
import orden.Command;
import orden.Mesero;
import orden.OrdenCafe;
import orden.OrdenJugo;
import orden.OrdenTostada;

/**
 *
 * @author sarit
 */
public class CommandMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cafetera cafetera= new Cafetera();
        Tostadora tostadora = new Tostadora();
        Exprimidor exprimidor = new Exprimidor();
        
        
        
        Command cafe= new OrdenCafe(cafetera);
        Command tostada= new OrdenTostada(tostadora);
        Command jugo= new OrdenJugo(exprimidor);
        
        Mesero mesero= new Mesero();
        
        mesero.tomarOrden(cafe);
        mesero.enviarACocina();
        
        mesero.CancelarOrden();
        
        System.out.println("----------------------");
        
        mesero.tomarOrden(tostada);
        mesero.enviarACocina();
        
        System.out.println("----------------------");
        
        mesero.tomarOrden(jugo);
        mesero.enviarACocina();
        
    }
}
    

