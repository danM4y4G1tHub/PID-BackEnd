package pid.formulario.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Inmunizacion")
public class Inmunizacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idImnunizacion;
    private String tipoImunizacion;
    private String fechaAplicacion;

    public Inmunizacion(String fechaAplicacion, String tipoImunizacion) {
        this.fechaAplicacion = fechaAplicacion;
        this.tipoImunizacion = tipoImunizacion;
    }

    public int getIdImnunizacion() {
        return idImnunizacion;
    }

    public void setIdImnunizacion(int idImnunizacion) {
        this.idImnunizacion = idImnunizacion;
    }

    public String getTipoImunizacion() {
        return tipoImunizacion;
    }

    public void setTipoImunizacion(String tipoImunizacion) {
        this.tipoImunizacion = tipoImunizacion;
    }

    public String getFechaAplicacion() {
        return fechaAplicacion;
    }

    public void setFechaAplicacion(String fechaAplicacion) {
        this.fechaAplicacion = fechaAplicacion;
    }
    
}
