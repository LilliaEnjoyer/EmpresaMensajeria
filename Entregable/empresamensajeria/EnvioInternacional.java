/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package github.com.lilliaenjoyer.programacioni.empresamensajeria;

/**
 *
 * @author samue
 */
public class EnvioInternacional extends Envios implements InterfazEnvios {
    private String paisDestino;

    public EnvioInternacional(String paisDestino, String codigoEnvio, String nombreDestinatario, double pesoPaquete) {
        super(codigoEnvio, nombreDestinatario, pesoPaquete);
        this.paisDestino = paisDestino;
    }
    
    @Override
    public double calcularCosto() {
        return (pesoPaquete*12000)+(pesoPaquete*12000)*0.15;
    }
}
