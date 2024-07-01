package pid.formulario.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pid.formulario.modelos.AntecedentesAlergicoPersonales;
import pid.formulario.servicio.AntecedentesServicio;


@RestController
@RequestMapping("/antecedentes/")
public class AntecedentesREST {
    @Autowired
    private AntecedentesServicio antecedentesServicio;

    @PostMapping()
    private void salvarAntecedentes(@RequestBody AntecedentesAlergicoPersonales antecedentes) {
        try {
            AntecedentesAlergicoPersonales antecedentesAP = antecedentesServicio.save(antecedentes);
            System.out.println(antecedentesAP.getAntecedentes());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
