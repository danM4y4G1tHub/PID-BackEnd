package pid.formulario.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import pid.formulario.modelos.Inmunizacion;

public interface InmunizacionesRepositorio extends JpaRepository<Inmunizacion, Long>{
    
}
