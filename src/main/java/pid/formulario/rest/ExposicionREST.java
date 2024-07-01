package pid.formulario.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pid.formulario.modelos.ExposicionAAlergenos;
import pid.formulario.servicio.ExposicionServicio;

@RestController
@RequestMapping("/exposicion/")
public class ExposicionREST {
    @Autowired
    private ExposicionServicio exposicionServicio;

    @PostMapping()
    private void salvarExposicion(@RequestBody ExposicionAAlergenos exposicion) {
        try {
            ExposicionAAlergenos exposicionAA = exposicionServicio.save(exposicion);
            System.out.println(exposicionAA);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
