package Model;

import java.time.LocalDate;

public class Paquete {
    private String numeroSeguimiento; 
    private String categorias; 
    private LocalDate fechaDeIngreso; 
    private String ubicacionActual; 
    private String destino; 
    private String cedulaRepartidor; 
    
    public Paquete() {}
    
    public Paquete(String numeroSeguimiento, String categorias, LocalDate fechaDeIngreso, 
                   String ubicacionActual, String destino, String cedulaRepartidor) {
        this.numeroSeguimiento = numeroSeguimiento;
        this.categorias = categorias;
        this.fechaDeIngreso = fechaDeIngreso;
        this.ubicacionActual = ubicacionActual;
        this.destino = destino;
        this.cedulaRepartidor = cedulaRepartidor;
    }
    
    public String getNumeroSeguimiento() {
        return numeroSeguimiento;
    }
    
    public void setNumeroSeguimiento(String numeroSeguimiento) {
        this.numeroSeguimiento = numeroSeguimiento;
    }
    
    public String getCategorias() {
        return categorias;
    }
    
    public void setCategorias(String categorias) {
        this.categorias = categorias;
    }
    
    public LocalDate getFechaDeIngreso() {
        return fechaDeIngreso;
    }
    
    public void setFechaDeIngreso(LocalDate fechaDeIngreso) {
        this.fechaDeIngreso = fechaDeIngreso;
    }
    
    public String getUbicacionActual() {
        return ubicacionActual;
    }
    
    public void setUbicacionActual(String ubicacionActual) {
        this.ubicacionActual = ubicacionActual;
    }
    
    public String getDestino() {
        return destino;
    }
    
    public void setDestino(String destino) {
        this.destino = destino;
    }
    
    public String getCedulaRepartidor() {
        return cedulaRepartidor;
    }
    
    public void setCedulaRepartidor(String cedulaRepartidor) {
        this.cedulaRepartidor = cedulaRepartidor;
    }
}