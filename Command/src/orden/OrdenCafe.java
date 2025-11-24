/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orden;

import electrodomestico.Cafetera;

/**
 *
 * @author sarit
 */
public class OrdenCafe implements Command {
    
    private Cafetera cafetera;
    
    public OrdenCafe(Cafetera cafetera){
        this.cafetera= cafetera;
    }

    @Override
    public void ejecutar() {
        cafetera.prepararCafe();
    }

    @Override
    public void cancelar() {
        cafetera.cancelarCafe();
    }
    
}
