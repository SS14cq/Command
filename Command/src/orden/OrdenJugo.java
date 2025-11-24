/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orden;

import electrodomestico.Exprimidor;

/**
 *
 * @author sarit
 */
public class OrdenJugo implements Command{
    private Exprimidor exprimidor;
    
    public OrdenJugo(Exprimidor exprimidor){
        this.exprimidor=exprimidor;
    }

    @Override
    public void ejecutar() {
        exprimidor.prepararJugo();
    }

    @Override
    public void cancelar() {
        exprimidor.cancelarjugo();
    }
    
    
}
