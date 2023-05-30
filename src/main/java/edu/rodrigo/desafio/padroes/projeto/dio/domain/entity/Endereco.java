package edu.rodrigo.desafio.padroes.projeto.dio.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
    private  Long id;
    private String cep;
    private String rua;

    private String bairro;

    private Integer numero;

    private String cidade;

    private String uf;

    private Cliente cliente;
}
