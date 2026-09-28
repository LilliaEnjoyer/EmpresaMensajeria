/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package github.com.lilliaenjoyer.programacioni.empresamensajeria;

/**
 *
 * @author samue
 */
public class Envios {
    protected String codigoEnvio;
    protected String nombreDestinatario;
    protected double pesoPaquete;

    public Envios(String codigoEnvio, String nombreDestinatario, double pesoPaquete) {
        this.codigoEnvio = codigoEnvio;
        this.nombreDestinatario = nombreDestinatario;
        this.pesoPaquete = pesoPaquete;
    }
    
}
