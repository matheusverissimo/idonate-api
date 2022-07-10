package br.com.uff.dac.idonateapi.repository;

import br.com.uff.dac.idonateapi.model.Voluntario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "voluntarios", path = "voluntarios")
public interface VoluntarioRepository extends JpaRepository <Voluntario, Long>{
}
