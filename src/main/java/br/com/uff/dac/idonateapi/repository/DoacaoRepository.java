package br.com.uff.dac.idonateapi.repository;

import br.com.uff.dac.idonateapi.model.Doacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource(collectionResourceRel = "doacoes", path = "doacoes")
public interface DoacaoRepository extends JpaRepository<Doacao, Long> {

}
