package br.com.uff.dac.idonateapi.repository;

import br.com.uff.dac.idonateapi.model.Instituicao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "instituicoes", path = "instituicoes")
public interface InstituicaoRepository extends JpaRepository<Instituicao, Long> {

}
