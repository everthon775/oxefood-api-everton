package br.edu.ifpe.oxefood.api.empresa;

import br.edu.ifpe.oxefood.util.EntidadeAuditavel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import org.hibernate.annotations.SQLRestriction;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "cliente")
@SQLRestriction("habilitado = true")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Empresa extends EntidadeAuditavel {

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
