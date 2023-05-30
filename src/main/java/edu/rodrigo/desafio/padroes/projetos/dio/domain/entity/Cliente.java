package edu.rodrigo.desafio.padroes.projetos.dio.domain.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cpf")
    @NotBlank(message = "CPF é obrigatório")
    @Length(message="Nome com no máximo 14 caracteres",max=14)
    @CPF
    private String cpf;

    @Column(name = "nome")
    @NotBlank(message = "Nome é obrigatório")
    @Length(message="Nome com no máximo 50 caracteres",max=50)
    private String nome;

    @Column(name = "sexo")
    @NotBlank(message = "Sexo é obrigatório")
    @Length(message="Nome com no máximo 1 caracteres",max=1)
    private String sexo;

    @Column(name = "nascimento")
    private Date dataNascimento;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id", referencedColumnName = "id")
    private Endereco endereco;
}
