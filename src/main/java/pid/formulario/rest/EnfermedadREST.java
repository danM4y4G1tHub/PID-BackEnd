package pid.formulario.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pid.formulario.modelos.EnfermedadActual;
import pid.formulario.servicio.EnfermedadServicio;

@RestController
@RequestMapping("/enfermedades/")
public class EnfermedadREST {

    @Autowired
    private EnfermedadServicio enfermedadServicio;

    @PostMapping()
    private void salvarEnfermedad(@RequestBody EnfermedadActual enfermedad) {
        try {
            EnfermedadActual enfermedadA = enfermedadServicio.save(enfermedad);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
