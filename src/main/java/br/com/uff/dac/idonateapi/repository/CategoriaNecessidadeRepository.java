package br.com.uff.dac.idonateapi.repository;

import br.com.uff.dac.idonateapi.model.CategoriaNecessidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "categoriasNecessidades", path = "categoriasNecessidades")
public interface CategoriaNecessidadeRepository extends JpaRepository<CategoriaNecessidade, Long> {

}
