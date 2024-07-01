package pid.formulario.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ExamenFisico")
public class ExamenFisico {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int idExamen;
    private float peso;
    private String talla;
    private String estadoGeneral;
    private String alteracionesPiel;
    private String mucosas;
    private String craneo;
    private String cara;
    private String cuello;
    private String torax;
    private String abdomen;
    private String pelvis;
    private String extremidades;
    private String aparatoRespiratorio;
    private String aparatoCirculatorio;
    private String tensionArterial;
    private String otrosAparatos;

    public ExamenFisico(String abdomen, String alteracionesPiel, String aparatoCirculatorio, String aparatoRespiratorio, String cara, String craneo, String cuello, String estadoGeneral, String extremidades, String mucosas, String otrosAparatos, String pelvis, float peso, String talla, String tensionArterial, String torax) {
        this.abdomen = abdomen;
        this.alteracionesPiel = alteracionesPiel;
        this.aparatoCirculatorio = aparatoCirculatorio;
        this.aparatoRespiratorio = aparatoRespiratorio;
        this.cara = cara;
        this.craneo = craneo;
        this.cuello = cuello;
        this.estadoGeneral = estadoGeneral;
        this.extremidades = extremidades;
        this.mucosas = mucosas;
        this.otrosAparatos = otrosAparatos;
        this.pelvis = pelvis;
        this.peso = peso;
        this.talla = talla;
        this.tensionArterial = tensionArterial;
        this.torax = torax;
    }

    public int getIdExamen() {
        return idExamen;
    }

    public void setIdExamen(int idExamen) {
        this.idExamen = idExamen;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getEstadoGeneral() {
        return estadoGeneral;
    }

    public void setEstadoGeneral(String estadoGeneral) {
        this.estadoGeneral = estadoGeneral;
    }

    public String getAlteracionesPiel() {
        return alteracionesPiel;
    }

    public void setAlteracionesPiel(String alteracionesPiel) {
        this.alteracionesPiel = alteracionesPiel;
    }

    public String getMucosas() {
        return mucosas;
    }

    public void setMucosas(String mucosas) {
        this.mucosas = mucosas;
    }

    public String getCraneo() {
        return craneo;
    }

    public void setCraneo(String craneo) {
        this.craneo = craneo;
    }

    public String getCara() {
        return cara;
    }

    public void setCara(String cara) {
        this.cara = cara;
    }

    public String getCuello() {
        return cuello;
    }

    public void setCuello(String cuello) {
        this.cuello = cuello;
    }

    public String getTorax() {
        return torax;
    }

    public void setTorax(String torax) {
        this.torax = torax;
    }

    public String getAbdomen() {
        return abdomen;
    }

    public void setAbdomen(String abdomen) {
        this.abdomen = abdomen;
    }

    public String getPelvis() {
        return pelvis;
    }

    public void setPelvis(String pelvis) {
        this.pelvis = pelvis;
    }

    public String getExtremidades() {
        return extremidades;
    }

    public void setExtremidades(String extremidades) {
        this.extremidades = extremidades;
    }

    public String getAparatoRespiratorio() {
        return aparatoRespiratorio;
    }

    public void setAparatoRespiratorio(String aparatoRespiratorio) {
        this.aparatoRespiratorio = aparatoRespiratorio;
    }

    public String getAparatoCirculatorio() {
        return aparatoCirculatorio;
    }

    public void setAparatoCirculatorio(String aparatoCirculatorio) {
        this.aparatoCirculatorio = aparatoCirculatorio;
    }

    public String getTensionArterial() {
        return tensionArterial;
    }

    public void setTensionArterial(String tensionArterial) {
        this.tensionArterial = tensionArterial;
    }

    public String getOtrosAparatos() {
        return otrosAparatos;
    }

    public void setOtrosAparatos(String otrosAparatos) {
        this.otrosAparatos = otrosAparatos;
    }


}