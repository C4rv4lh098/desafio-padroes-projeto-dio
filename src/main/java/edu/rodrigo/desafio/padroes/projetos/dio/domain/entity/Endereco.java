package edu.rodrigo.desafio.padroes.projetos.dio.domain.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "endereco")
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(name = "cep")
    @NotBlank(message = "CEP é obrigatório")
    @Length(message = "CEP com no máximo 9 caracteres", max=9)
    private String cep;

    @Column(name = "rua")
    @NotBlank(message = "Rua é obrigatório")
    private String rua;

    @Column(name = "bairro")
    @NotBlank(message = "Bairro é obrigatório")
    private String bairro;

    @Column(name = "numero")
    private Integer numero;

    @Column(name = "cidade")
    @NotBlank(message = "Cidade é obrigatório")
    private String cidade;

    @Column(name = "uf")
    @NotBlank(message = "UF é obrigatório")
    private String uf;

    @OneToOne(mappedBy = "endereco")
    private Cliente cliente;
}
