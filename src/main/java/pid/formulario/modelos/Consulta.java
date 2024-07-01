package pid.formulario.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Consulta")
public class Consulta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idConsulta;
    // private int idAntecedente;
    // private int idEnfermedad;
    // private int idExamen;
    // private int idExposicion;
    // private int idFactores;
    // private int idInmunizacion;
    // private int idPaciente;
    private String antecedentesAlergicosFamiliares;
    private String aspectosPsicosociales;
    private String impresionDiagnostica;
    private String motivoConsulta;
    private String otrosAnticiposPersonales;
    private String resumen;

    @OneToOne
    @JoinColumn(name = "idAntecedente")
    private AntecedentesAlergicoPersonales antecedentes;
    
    @OneToOne
    @JoinColumn(name = "idEnfermedad")
    private EnfermedadActual enfermedad;
    
    @OneToOne
    @JoinColumn(name = "idExamen")
    private ExamenFisico examen;
    
    @OneToOne
    @JoinColumn(name = "idExposicion")
    private ExposicionAAlergenos exposicion;
    
    @OneToOne
    @JoinColumn(name = "idFactores")
    private FactoresDesencadenantes factores;
    
    @OneToOne
    @JoinColumn(name = "idInmunizacion")
    private Inmunizacion inmunizacion;

    @ManyToOne
    @JoinColumn(name = "idPaciente")
    private Paciente paciente;

    public Consulta() {
    }

    public Consulta(String antecedentesAlergicosFamiliares, String aspectosPsicosociales, String exposicionAlergenos,
            String impresionDiagnostica, String motivoConsulta, String otrosAnticiposPersonales, String resumen) {
        super();
        this.antecedentesAlergicosFamiliares = antecedentesAlergicosFamiliares;
        this.aspectosPsicosociales = aspectosPsicosociales;
        this.impresionDiagnostica = impresionDiagnostica;
        this.motivoConsulta = motivoConsulta;
        this.otrosAnticiposPersonales = otrosAnticiposPersonales;
        this.resumen = resumen;
    }

    // public int getIdAntecedente() {
    //     return idAntecedente;
    // }

    // public void setIdAntecedente(int idAntecedente) {
    //     this.idAntecedente = idAntecedente;
    // }

    // public int getIdEnfermedad() {
    //     return idEnfermedad;
    // }

    // public void setIdEnfermedad(int idEnfermedad) {
    //     this.idEnfermedad = idEnfermedad;
    // }

    // public int getIdExamen() {
    //     return idExamen;
    // }

    // public void setIdExamen(int idExamen) {
    //     this.idExamen = idExamen;
    // }

    // public int getIdExposicion() {
    //     return idExposicion;
    // }

    // public void setIdExposicion(int idExposicion) {
    //     this.idExposicion = idExposicion;
    // }

    // public int getIdFactores() {
    //     return idFactores;
    // }

    // public void setIdFactores(int idFactores) {
    //     this.idFactores = idFactores;
    // }

    // public int getIdInmunizacion() {
    //     return idInmunizacion;
    // }

    // public void setIdInmunizacion(int idInmunizacion) {
    //     this.idInmunizacion = idInmunizacion;
    // }

    // public int getIdPaciente() {
    //     return idPaciente;
    // }

    // public void setIdPaciente(int idPaciente) {
    //     this.idPaciente = idPaciente;
    // }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public String getAntecedentesAlergicosFamiliares() {
        return antecedentesAlergicosFamiliares;
    }

    public void setAntecedentesAlergicosFamiliares(String antecedentesAlergicosFamiliares) {
        this.antecedentesAlergicosFamiliares = antecedentesAlergicosFamiliares;
    }

    public String getAspectosPsicosociales() {
        return aspectosPsicosociales;
    }

    public void setAspectosPsicosociales(String aspectosPsicosociales) {
        this.aspectosPsicosociales = aspectosPsicosociales;
    }

    public String getImpresionDiagnostica() {
        return impresionDiagnostica;
    }

    public void setImpresionDiagnostica(String impresionDiagnostica) {
        this.impresionDiagnostica = impresionDiagnostica;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public String getOtrosAnticiposPersonales() {
        return otrosAnticiposPersonales;
    }

    public void setOtrosAnticiposPersonales(String otrosAnticiposPersonales) {
        this.otrosAnticiposPersonales = otrosAnticiposPersonales;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public AntecedentesAlergicoPersonales getAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(AntecedentesAlergicoPersonales antecedentes) {
        this.antecedentes = antecedentes;
    }

    public EnfermedadActual getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(EnfermedadActual enfermedad) {
        this.enfermedad = enfermedad;
    }

    public ExamenFisico getExamen() {
        return examen;
    }

    public void setExamen(ExamenFisico examen) {
        this.examen = examen;
    }

    public ExposicionAAlergenos getExposicion() {
        return exposicion;
    }

    public void setExposicion(ExposicionAAlergenos exposicion) {
        this.exposicion = exposicion;
    }

    public FactoresDesencadenantes getFactores() {
        return factores;
    }

    public void setFactores(FactoresDesencadenantes factores) {
        this.factores = factores;
    }

    public Inmunizacion getInmunizacion() {
        return inmunizacion;
    }

    public void setInmunizacion(Inmunizacion inmunizacion) {
        this.inmunizacion = inmunizacion;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
