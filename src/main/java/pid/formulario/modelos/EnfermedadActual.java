package pid.formulario.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "EnfermedadActual")
public class EnfermedadActual {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int idEnfermedad;
    private String efermedad;
    private String tiempoEvolucion;
    private String formaComienzo;
    private String caracteresClinicos;
    private String caracteresEvolutivos;
    private String horario;
    private String estacion;
    private String lugar;
    private String efectosCambiosAmbiental;
    private String tratamientoAnterior;
    private String resultados;
    private String patologiaAsociada;

    public EnfermedadActual(String caracteresClinicos, String caracteresEvolutivos, String efectosCambiosAmbiental,
            String efermedad, String estacion, String formaComienzo, String horario, String lugar,
            String patologiaAsociada, String resultados, String tiempoEvolucion, String tratamientoAnterior) {
        super();
        this.caracteresClinicos = caracteresClinicos;
        this.caracteresEvolutivos = caracteresEvolutivos;
        this.efectosCambiosAmbiental = efectosCambiosAmbiental;
        this.efermedad = efermedad;
        this.estacion = estacion;
        this.formaComienzo = formaComienzo;
        this.horario = horario;
        this.lugar = lugar;
        this.patologiaAsociada = patologiaAsociada;
        this.resultados = resultados;
        this.tiempoEvolucion = tiempoEvolucion;
        this.tratamientoAnterior = tratamientoAnterior;
    }

    public int getIdEnfermedad() {
        return idEnfermedad;
    }

    public void setIdEnfermedad(int idEnfermedad) {
        this.idEnfermedad = idEnfermedad;
    }

    public String getEfermedad() {
        return efermedad;
    }

    public void setEfermedad(String efermedad) {
        this.efermedad = efermedad;
    }

    public String getTiempoEvolucion() {
        return tiempoEvolucion;
    }

    public void setTiempoEvolucion(String tiempoEvolucion) {
        this.tiempoEvolucion = tiempoEvolucion;
    }

    public String getFormaComienzo() {
        return formaComienzo;
    }

    public void setFormaComienzo(String formaComienzo) {
        this.formaComienzo = formaComienzo;
    }

    public String getCaracteresClinicos() {
        return caracteresClinicos;
    }

    public void setCaracteresClinicos(String caracteresClinicos) {
        this.caracteresClinicos = caracteresClinicos;
    }

    public String getCaracteresEvolutivos() {
        return caracteresEvolutivos;
    }

    public void setCaracteresEvolutivos(String caracteresEvolutivos) {
        this.caracteresEvolutivos = caracteresEvolutivos;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getEstacion() {
        return estacion;
    }

    public void setEstacion(String estacion) {
        this.estacion = estacion;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getEfectosCambiosAmbiental() {
        return efectosCambiosAmbiental;
    }

    public void setEfectosCambiosAmbiental(String efectosCambiosAmbiental) {
        this.efectosCambiosAmbiental = efectosCambiosAmbiental;
    }

    public String getTratamientoAnterior() {
        return tratamientoAnterior;
    }

    public void setTratamientoAnterior(String tratamientoAnterior) {
        this.tratamientoAnterior = tratamientoAnterior;
    }

    public String getResultados() {
        return resultados;
    }

    public void setResultados(String resultados) {
        this.resultados = resultados;
    }

    public String getPatologiaAsociada() {
        return patologiaAsociada;
    }

    public void setPatologiaAsociada(String patologiaAsociada) {
        this.patologiaAsociada = patologiaAsociada;
    }


}
