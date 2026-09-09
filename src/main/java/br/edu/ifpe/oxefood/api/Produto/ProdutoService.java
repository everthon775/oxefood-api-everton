package br.edu.ifpe.oxefood.api.Produto;


import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

  

    public ProdutoDTO salvar(ProdutoDTO dto) {

        Produto produto = new Produto();

        produto.setCodigo(dto.getCodigo());
        produto.setTitulo(dto.getTitulo());
        produto.setDescricao(dto.getDescricao());
        produto.setValorUnitario(dto.getValorUnitario());
        produto.setTempoEntregaMinimo(dto.getTempoEntregaMinimo());
        produto.setTempoEntregaMaximo(dto.getTempoEntregaMaximo());

        

        dto.setId(produto.getId());

        return dto;
    }
}
