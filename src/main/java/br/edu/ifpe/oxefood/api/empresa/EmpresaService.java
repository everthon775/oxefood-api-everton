package br.edu.ifpe.oxefood.api.empresa;


import org.springframework.stereotype.Service;

@Service
public class EmpresaService {

    
    private EmpresaRepository repository;

    public EmpresaDTO salvar(EmpresaDTO dto) {

        Empresa empresa = new Empresa();

        empresa.setSite(dto.getSite());
        empresa.setCnpj(dto.getCnpj());
        empresa.setInscricaoEstadual(dto.getInscricaoEstadual());
        empresa.setNomeEmpresarial(dto.getNomeEmpresarial());
        empresa.setNomeFantasia(dto.getNomeFantasia());
        empresa.setFone(dto.getFone());
        empresa.setFoneAlternativo(dto.getFoneAlternativo());

        empresa = repository.save(empresa);

        dto.setId(empresa.getId());

        return dto;
    }
}