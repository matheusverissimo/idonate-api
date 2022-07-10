package br.com.uff.dac.idonateapi.repository;

import br.com.uff.dac.idonateapi.model.Necessidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource(collectionResourceRel = "necessidades", path = "necessidades")
public interface NecessidadeRepository extends JpaRepository<Necessidade, Long> {
}
