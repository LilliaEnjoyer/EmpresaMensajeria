/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package github.com.lilliaenjoyer.programacioni.empresamensajeria;

/**
 *
 * @author samue
 */
public class EnvioEstandar extends Envios implements InterfazEnvios{
    private String direccionEntrega;

    public EnvioEstandar(String direccionEntrega, String codigoEnvio, String nombreDestinatario, double pesoPaquete) {
        super(codigoEnvio, nombreDestinatario, pesoPaquete);
        this.direccionEntrega = direccionEntrega;
    }
    
    @Override
    public double calcularCosto() {
        return pesoPaquete*5000;
    }
    
    
}
