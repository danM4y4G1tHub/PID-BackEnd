package pid.formulario.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPaciente;
    private String historiaClinica;
    private String nombres;
    private String primerApellido;
    private String segundoApellido;
    private String sala;
    private String cama;
    private String medicoAsistencia;

    public Paciente(String cama, String historiaClinica, String medicoAsistencia, String nombres, String primerApellido,
            String sala, String segundoApellido) {
        this.cama = cama;
        this.historiaClinica = historiaClinica;
        this.medicoAsistencia = medicoAsistencia;
        this.nombres = nombres;
        this.primerApellido = primerApellido;
        this.sala = sala;
        this.segundoApellido = segundoApellido;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(String historiaClinica) {
        this.historiaClinica = historiaClinica;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getCama() {
        return cama;
    }

    public void setCama(String cama) {
        this.cama = cama;
    }

    public String getMedicoAsistencia() {
        return medicoAsistencia;
    }

    public void setMedicoAsistencia(String medicoAsistencia) {
        this.medicoAsistencia = medicoAsistencia;
    }
    
    
}
