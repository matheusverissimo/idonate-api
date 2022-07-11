package br.com.uff.dac.idonateapi.repository;


import br.com.uff.dac.idonateapi.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "enderecos", path = "enderecos")
public interface EnderecoRepository extends JpaRepository <Endereco, Long> {

}
