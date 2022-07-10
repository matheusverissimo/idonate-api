package br.com.uff.dac.idonateapi.repository;

import br.com.uff.dac.idonateapi.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "usuarios", path = "usuarios")
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
