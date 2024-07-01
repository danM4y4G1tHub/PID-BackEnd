package pid.formulario.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pid.formulario.modelos.FactoresDesencadenantes;
import pid.formulario.servicio.FactoresServicio;

@RestController
@RequestMapping("/factores/")
public class FactoresREST {
    @Autowired
    private FactoresServicio factoresServicio;

    @PostMapping()
    private void salvarAntecedentes(@RequestBody FactoresDesencadenantes factores) {
        try {
            FactoresDesencadenantes factoresD = factoresServicio.save(factores);
            System.out.println(factoresD);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
