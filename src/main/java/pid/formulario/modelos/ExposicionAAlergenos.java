package pid.formulario.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ExposicionAAlergenos")
public class ExposicionAAlergenos {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int idExposicion;
    private String tipoAlergeno;
    private String ubicacion;
    private String observaciones;

    public ExposicionAAlergenos(String observaciones, String tipoAlergeno, String ubicacion) {
        this.observaciones = observaciones;
        this.tipoAlergeno = tipoAlergeno;
        this.ubicacion = ubicacion;
    }

    public int getIdExposicion() {
        return idExposicion;
    }

    public void setIdExposicion(int idExposicion) {
        this.idExposicion = idExposicion;
    }

    public String getTipoAlergeno() {
        return tipoAlergeno;
    }

    public void setTipoAlergeno(String tipoAlergeno) {
        this.tipoAlergeno = tipoAlergeno;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
