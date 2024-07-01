package pid.formulario.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "FactoresDesencadenantes")
public class FactoresDesencadenantes {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int idFactor;
    private String tipoFactor;
    private String descripcion;

    public FactoresDesencadenantes(String descripcion, String tipoFactor) {
        this.descripcion = descripcion;
        this.tipoFactor = tipoFactor;
    }

    public int getIdFactor() {
        return idFactor;
    }

    public void setIdFactor(int idFactor) {
        this.idFactor = idFactor;
    }

    public String getTipoFactor() {
        return tipoFactor;
    }

    public void setTipoFactor(String tipoFactor) {
        this.tipoFactor = tipoFactor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


}
