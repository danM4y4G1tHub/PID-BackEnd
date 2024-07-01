package pid.formulario.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import pid.formulario.modelos.Paciente;

public interface PacienteRepositorio extends JpaRepository<Paciente, Long>{
    
}
