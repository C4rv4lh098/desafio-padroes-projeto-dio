package edu.rodrigo.desafio.padroes.projetos.dio.domain.config;

import edu.rodrigo.desafio.padroes.projetos.dio.domain.dto.ResponseDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DtoConfig {
    @Bean
    public ResponseDto responseDto(){
        return new ResponseDto();
    }
}
