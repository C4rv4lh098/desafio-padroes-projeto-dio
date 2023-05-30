package edu.rodrigo.desafio.padroes.projetos.dio.controller;

import edu.rodrigo.desafio.padroes.projetos.dio.domain.dto.ClienteDto;
import edu.rodrigo.desafio.padroes.projetos.dio.domain.dto.ResponseDto;
import edu.rodrigo.desafio.padroes.projetos.dio.domain.entity.Cliente;
import edu.rodrigo.desafio.padroes.projetos.dio.domain.service.ClienteService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping//Http://localhost:8080/api/cliente
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseDto saveCliente(@Valid @RequestBody Cliente cliente){
        return clienteService.saveCliente(cliente);
    }

    @GetMapping(value = "/list")//Http://localhost:8080/api/list
    public List<ClienteDto> getAllClient(){
        return clienteService.getAllClienteOrderByName();
    }

    @GetMapping(value = "/{id}")//Http://localhost:8080/api/id
    public ClienteDto getClienteById(@Valid @PathVariable Long id){
        return clienteService.getClienteById(id);
    }

    @PutMapping
    public ResponseDto updateCliente(@Valid @RequestBody Cliente cliente){
        return clienteService.updateCliente(cliente);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseDto deleteCliente(@Valid @PathVariable Long id){
        return clienteService.deleteCliente(id);
    }
}
