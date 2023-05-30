package edu.rodrigo.desafio.padroes.projeto.dio.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
    private Long id;

    private String nome;

    private String sexo;

    private Date dataNascimento;

    private Endereco endereco;
}
