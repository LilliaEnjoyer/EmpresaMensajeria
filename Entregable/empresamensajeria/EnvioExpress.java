/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package github.com.lilliaenjoyer.programacioni.empresamensajeria;

/**
 *
 * @author samue
 */
public class EnvioExpress extends Envios implements InterfazEnvios{
    private String fechaLiminte;

    public EnvioExpress(String fechaLiminte, String codigoEnvio, String nombreDestinatario, double pesoPaquete) {
        super(codigoEnvio, nombreDestinatario, pesoPaquete);
        this.fechaLiminte = fechaLiminte;
    }
    
    @Override
    public double calcularCosto() {
        return (pesoPaquete*5000)+15000;
    }
}
