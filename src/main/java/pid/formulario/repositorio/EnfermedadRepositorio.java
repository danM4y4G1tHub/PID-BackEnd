package pid.formulario.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import pid.formulario.modelos.EnfermedadActual;

public interface EnfermedadRepositorio extends JpaRepository<EnfermedadActual, Long>{
    
}
