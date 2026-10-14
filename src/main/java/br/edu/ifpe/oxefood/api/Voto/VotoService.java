package br.edu.ifpe.oxefood.api.Voto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifpe.oxefood.api.Voto.VotoDTO;
import br.edu.ifpe.oxefood.api.Produto.Produto;
import br.edu.ifpe.oxefood.api.Voto.Voto;


import br.edu.ifpe.oxefood.api.Voto.VotoRepository;
import br.edu.ifpe.oxefood.api.Voto.Voto;
import br.edu.ifpe.oxefood.api.Voto.VotoDTO;
import jakarta.transaction.Transactional;

@Service 
public class VotoService {
    private final VotoRepository repository;

    public VotoService(VotoRepository repository){
        this.repository = repository;
    }
  public Voto build(VotoDTO dto) {

        Voto voto = null;

      if (dto.getId() == null) { //Montado para o cadastro

         voto = new Voto();

      } else { //Consultado para a alteração

         voto = repository.findById(dto.getId()).get();
      }

   

        voto.se
        voto.setNomeEleitor(dto.getNomeEleitor());
        voto.setdataVotacao(dto.getdataVotacao());
        voto.setNumeroRegistroEleitoral(dto.getNumeroRegistroEleitoral());
        voto.setnumeroCandidatoDepFederal(dto.getnumeroCandidatoDepFederal());
        voto.setnumeroCandidatoPresidente(dto.getnumeroCandidatoPresidente());
        voto.setnumeroCandidatoGovernador(dto.getnumeroCandidatoGovernador());
        
        

        

        return voto;
    
    @Transactional
    public Voto cadastrar(VotoDTO dto){

        Voto Voto = build(dto);
        Voto.setHabilitado(true);
        return repository.save(Voto);

}
 
    @Transactional
    public Voto atualizar(VotoDTO dto) {

        Voto voto = build(dto);
        return repository.save(voto);
        }


public List<Voto> listar() {

        return repository.findAll();
    }

    public Voto buscarPorId(Long id) {

        return repository.findById(id).get(Long, id);
    }

     @Transactional
     public void remover(Long id) {

        Voto voto = repository.findById(id).get();
        voto.setHabilitado(false);

        repository.save(voto);
   }

}
@Service
public class VotoService {

    @Autowired
    private VotoRepository votoRepository;

    public List<Voto> listarTodos() {
        return votoRepository.findAll();
    }

    public void remover(Long id) {
        votoRepository.deleteById(id);
    }
}
}