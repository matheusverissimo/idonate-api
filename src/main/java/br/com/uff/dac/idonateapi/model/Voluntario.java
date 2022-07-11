package br.com.uff.dac.idonateapi.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.persistence.*;

import lombok.Data;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.format.annotation.DateTimeFormat;

/** Classe modelo da Entidade Voluntário do Idonate. */
@Data
@Entity
@Table(name = "voluntarios")
public class Voluntario extends Usuario {

    private String nome;
    private String cpf;
    @OneToOne
    private Endereco endereco;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataNascimento;
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Instituicao> instituicoes;
    @OneToMany(fetch = FetchType.LAZY)
    private List<Doacao> doacoes;
}