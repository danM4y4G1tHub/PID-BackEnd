package pid.formulario.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import pid.formulario.modelos.AntecedentesAlergicoPersonales;

public interface AntecedentesRepositorio extends JpaRepository<AntecedentesAlergicoPersonales, Long>{

}