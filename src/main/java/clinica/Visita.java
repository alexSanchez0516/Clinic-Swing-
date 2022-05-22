package clinica;

import java.time.LocalDate;

/**
 *
 * @author Alexander
 */
public class Visita {
    
    private LocalDate fecha;
    private String tratamiento;
    private String observaciones;

    public Visita(LocalDate fecha, String tratamiento, String observaciones) {
        this.fecha = fecha;
        this.tratamiento = tratamiento;
        this.observaciones = observaciones;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Visita{");
        sb.append("fecha=").append(fecha);
        sb.append(", tratamiento=").append(tratamiento);
        sb.append(", observaciones=").append(observaciones);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
