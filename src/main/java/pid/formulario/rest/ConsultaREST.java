package pid.formulario.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pid.formulario.modelos.Consulta;
import pid.formulario.servicio.AntecedentesServicio;
import pid.formulario.servicio.ConsultaServicio;
import pid.formulario.servicio.EnfermedadServicio;
import pid.formulario.servicio.ExamenServicio;
import pid.formulario.servicio.ExposicionServicio;
import pid.formulario.servicio.FactoresServicio;
import pid.formulario.servicio.InmunizacionesServicio;
import pid.formulario.servicio.PacienteServicio;

@RestController
@RequestMapping("/consulta/")
public class ConsultaREST {
    @Autowired
    private ConsultaServicio consultaServicio;
    @Autowired
    private AntecedentesServicio antecedentesServicio;
    @Autowired
    private EnfermedadServicio enfermedadServicio;
    @Autowired
    private ExamenServicio examenServicio;
    @Autowired
    private ExposicionServicio exposicionServicio;
    @Autowired
    private FactoresServicio factoresServicio;
    @Autowired
    private InmunizacionesServicio inmunizacionesServicio;
    @Autowired
    private PacienteServicio pacienteServicio;

    @PostMapping()
    private void salvarConsulta(@RequestBody Consulta consulta) {
        try {
            Consulta consultaPaciente = new Consulta();
            // relacionarConsulta(consultaPaciente);
            // consultaPaciente = consultaServicio.save(consulta);
            System.out.println(consultaPaciente);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // private void relacionarConsulta(Consulta consultaPaciente) {
    //     consultaPaciente.setIdAntecedente(antecedentesServicio.identificadorAntecedentes());
    //     consultaPaciente.setIdEnfermedad(enfermedadServicio.identificadorEnfermedad());
    //     consultaPaciente.setIdExamen(examenServicio.identificadorExamen());
    //     consultaPaciente.setIdExposicion(exposicionServicio.identificadorExposicion());
    //     consultaPaciente.setIdFactores(factoresServicio.identificadorFactor());
    //     consultaPaciente.setIdInmunizacion(inmunizacionesServicio.identificadorInmunizacion());
    //     consultaPaciente.setIdPaciente(pacienteServicio.identificadorPaciente());
    // }
}
