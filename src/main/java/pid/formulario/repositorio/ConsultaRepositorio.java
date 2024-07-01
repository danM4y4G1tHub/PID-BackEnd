package pid.formulario.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import pid.formulario.modelos.Consulta;

public interface ConsultaRepositorio extends JpaRepository<Consulta, Long>{

}