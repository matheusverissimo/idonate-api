package br.com.uff.dac.idonateapi.repository;

import br.com.uff.dac.idonateapi.model.CategoriaInstituicao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "categoriasInstituicoes", path = "categoriasInstituicoes")
public interface CategoriaInstituicaoRepository extends JpaRepository<CategoriaInstituicao, Long> {
    List<CategoriaInstituicao> findByNome(String nome);
}
