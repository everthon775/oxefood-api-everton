
package br.edu.ifpe.oxefood.api.empresa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/empresas")
public class EmpresaController {

    @Autowired
    private EmpresaService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public EmpresaDTO salvar(@RequestBody EmpresaDTO dto) {
        return service.salvar(dto);
    }
}
