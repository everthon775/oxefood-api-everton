package br.edu.ifpe.oxefood.api.empresa;

import br.edu.ifpe.oxefood.util.EntidadeAuditable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Empresa extends EntidadeAuditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String site;

    private String cnpj;

    private String inscricaoEstadual;

    private String nomeEmpresarial;

    private String nomeFantasia;

    private String fone;

    private String foneAlternativo;
}
