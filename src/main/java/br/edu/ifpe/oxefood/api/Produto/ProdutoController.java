package br.edu.ifpe.oxefood.api.Produto;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifpe.oxefood.api.cliente.Cliente;
import br.edu.ifpe.oxefood.api.cliente.ClienteDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Produtos")
public class ProdutoController {

    
    private final ProdutoService ProdutoService;


     
    @PostMapping
    public ResponseEntity<Produto> cadastrar(@RequestBody ProdutoDTO dto) {

        Cliente clienteCadastrado = ProdutoService.cadastrar(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(ProdutoCadastrado);
    }


}
