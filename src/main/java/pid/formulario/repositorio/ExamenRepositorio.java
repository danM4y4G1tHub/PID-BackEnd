package pid.formulario.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import pid.formulario.modelos.ExamenFisico;

public interface ExamenRepositorio extends JpaRepository<ExamenFisico, Long>{
    
}
