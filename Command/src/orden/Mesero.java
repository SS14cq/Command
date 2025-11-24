/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orden;

import orden.Command;

/**
 *
 * @author sarit
 */
public class Mesero {
    
    private Command orden;
    
    public void tomarOrden (Command orden){
        this.orden= orden;
        System.out.println("Mesero: orden tomada");
    }
    
    public void enviarACocina(){
        System.out.println("Mesero: enviando orden a coccina...");
        orden.ejecutar();
    }
    
    public void CancelarOrden(){
        System.out.println("Mesero: cancelar orden...");
        orden.cancelar();
    }
}
