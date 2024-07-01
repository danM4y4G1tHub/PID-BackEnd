package pid.formulario.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pid.formulario.modelos.Inmunizacion;
import pid.formulario.servicio.InmunizacionesServicio;

@RestController
@RequestMapping("/inmunizaciones/")
public class InmunizacionesREST {
    @Autowired
    private InmunizacionesServicio inmunizacionesServicio;

    @PostMapping()
    private void salvarInmunizacion(@RequestBody Inmunizacion inmunizacion) {
        try {
            Inmunizacion inmunizacionN = inmunizacionesServicio.save(inmunizacion);
            System.out.println(inmunizacionN);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
