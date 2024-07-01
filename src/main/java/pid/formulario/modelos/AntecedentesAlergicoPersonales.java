package pid.formulario.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "AntecedentesAlergicoPersonales")
public class AntecedentesAlergicoPersonales {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int idAntecedente;
    private String antecedentes;
    private String primerosSintomas;
    private int edadOrigen;
    private String probablesCausas;
    private String descripcion;
    private String duracion;
    private String secuencia;
    private String mutacion;
    private String tratamiento;
    private String resultados;
    private String shockAnafilactico;

    public AntecedentesAlergicoPersonales() {
    }

    public AntecedentesAlergicoPersonales(String antecedentes, String primerosSintomas, int edadOrigen,
            String probablesCausas, String descripcion, String duracion, String secuencia, String mutacion,
            String tratamiento, String resultados, String shockAnafilactico) {
        this.antecedentes = antecedentes;
        this.primerosSintomas = primerosSintomas;
        this.edadOrigen = edadOrigen;
        this.probablesCausas = probablesCausas;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.secuencia = secuencia;
        this.mutacion = mutacion;
        this.tratamiento = tratamiento;
        this.resultados = resultados;
        this.shockAnafilactico = shockAnafilactico;
    }



    public int getIdAntecedente() {
        return idAntecedente;
    }

    public void setIdAntecedente(int idAntecedente) {
        this.idAntecedente = idAntecedente;
    }

    public String getAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(String antecedentes) {
        this.antecedentes = antecedentes;
    }

    public String getPrimerosSintomas() {
        return primerosSintomas;
    }

    public void setPrimerosSintomas(String primerosSintomas) {
        this.primerosSintomas = primerosSintomas;
    }

    public int getEdadOrigen() {
        return edadOrigen;
    }

    public void setEdadOrigen(int edadOrigen) {
        this.edadOrigen = edadOrigen;
    }

    public String getProbablesCausas() {
        return probablesCausas;
    }

    public void setProbablesCausas(String probablesCausas) {
        this.probablesCausas = probablesCausas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(String secuencia) {
        this.secuencia = secuencia;
    }

    public String getMutacion() {
        return mutacion;
    }

    public void setMutacion(String mutacion) {
        this.mutacion = mutacion;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getResultados() {
        return resultados;
    }

    public void setResultados(String resultados) {
        this.resultados = resultados;
    }

    public String getShockAnafilactico() {
        return shockAnafilactico;
    }

    public void setShockAnafilactico(String shockAnafilactico) {
        this.shockAnafilactico = shockAnafilactico;
    }


}
