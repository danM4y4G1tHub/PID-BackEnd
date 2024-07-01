package pid.formulario.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import pid.formulario.modelos.FactoresDesencadenantes;

public interface FactoresRepositorio extends JpaRepository<FactoresDesencadenantes, Long>{
    
}
