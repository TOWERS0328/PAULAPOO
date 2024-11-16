
package Model;

import java.time.LocalDate;

/**
 *
 * @author juand
 */
public class Paquete {
    private String numeroSeguimirnto;
    private String categorias;
    private LocalDate FechaDeIngreso;
    private String UbicacionActual;
    private String Destino;
    private String cedulaRepartidor;

    public String getNumeroSeguimirnto() {
        return numeroSeguimirnto;
    }

    public void setNumeroSeguimirnto(String numeroSeguimirnto) {
        this.numeroSeguimirnto = numeroSeguimirnto;
    }

    public String getCategorias() {
        return categorias;
    }

    public void setCategorias(String categorias) {
        this.categorias = categorias;
    }

    public LocalDate getFechaDeIngreso() {
        return FechaDeIngreso;
    }

    public void setFechaDeIngreso(LocalDate FechaDeIngreso) {
        this.FechaDeIngreso = FechaDeIngreso;
    }

    public String getUbicacionActual() {
        return UbicacionActual;
    }

    public void setUbicacionActual(String UbicacionActual) {
        this.UbicacionActual = UbicacionActual;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public String getCedulaRepartidor() {
        return cedulaRepartidor;
    }

    public void setCedulaRepartidor(String cedulaRepartidor) {
        this.cedulaRepartidor = cedulaRepartidor;
    }
}
