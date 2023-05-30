package edu.rodrigo.desafio.padroes.projetos.dio.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteDto {
    Long id;
    String cpf;
    String nome;
    String sexo;
    Date nascimento;
    EnderecoDto endereco;
}
