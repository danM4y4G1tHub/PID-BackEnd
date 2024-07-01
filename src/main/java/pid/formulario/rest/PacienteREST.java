package pid.formulario.rest;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.ServletInputStream;
import jakarta.servlet.http.HttpServletRequest;
import pid.formulario.servicio.PacienteServicio;

@RestController
@RequestMapping("/paciente/")
public class PacienteREST {
    @Autowired
    private PacienteServicio pacienteServicio;

    @PostMapping(consumes = MediaType.TEXT_PLAIN_VALUE)
    public void salvarPaciente(HttpServletRequest request) throws IOException {
        ServletInputStream inputStream = request.getInputStream();
        StringBuilder stringBuilder = new StringBuilder();

        byte[] buffer = new byte[1024];
        int length;
        while ((length = inputStream.read(buffer)) != -1) {
            stringBuilder.append(new String(buffer, 0, length));
        }

        String pacienteTextoPlano = stringBuilder.toString();

        // Aquí puedes convertir el texto plano a un objeto Paciente si es necesario
        // Por ejemplo, usando una biblioteca de análisis JSON como Jackson
        // Paciente paciente = objectMapper.readValue(pacienteTextoPlano,
        // Paciente.class);

        try {
            // Suponiendo que save() devuelve un Paciente, aunque en realidad devolverá null
            // Paciente pacienteN = pacienteServicio.save(paciente);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
