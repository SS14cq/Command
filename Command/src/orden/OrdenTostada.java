/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orden;

import electrodomestico.Tostadora;

/**
 *
 * @author sarit
 */
public class OrdenTostada implements Command{
    
    private Tostadora tostadora;
    
    public OrdenTostada(Tostadora tostadora){
        this.tostadora=tostadora;
    }

    @Override
    public void ejecutar() {
        tostadora.prepararTostada();
    }

    @Override
    public void cancelar() {
        tostadora.cancelarTostada();
    }
}
