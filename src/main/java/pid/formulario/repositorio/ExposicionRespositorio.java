package pid.formulario.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import pid.formulario.modelos.ExposicionAAlergenos;

public interface ExposicionRespositorio extends JpaRepository<ExposicionAAlergenos, Long>{
    
}
