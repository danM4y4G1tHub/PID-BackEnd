package pid.formulario.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pid.formulario.modelos.ExamenFisico;
import pid.formulario.servicio.ExamenServicio;

@RestController
@RequestMapping("/examen/")
public class ExamenREST {

    @Autowired
    private ExamenServicio examenServicio;

    @PostMapping()
    private void salvarExamen(@RequestBody ExamenFisico examen) {
        try {
            ExamenFisico examenF = examenServicio.save(examen);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}