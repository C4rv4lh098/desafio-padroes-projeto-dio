package edu.rodrigo.desafio.padroes.projetos.dio.domain.repository;

import edu.rodrigo.desafio.padroes.projetos.dio.domain.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
}
