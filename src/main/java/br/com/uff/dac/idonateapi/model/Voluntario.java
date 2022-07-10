package br.com.uff.dac.idonateapi.model;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.*;

import lombok.Data;

/** Classe modelo da Entidade Voluntário do Idonate. */
@Data
@Entity
@Table(name = "voluntarios")
public class Voluntario extends Usuario {

    private String nome;
    private String cpf;
    @OneToOne
    private Endereco endereco;
    private LocalDate dataNascimento;
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Instituicao> instituicoes;
    @OneToMany(fetch = FetchType.LAZY)
    private List<Doacao> doacoes;
}