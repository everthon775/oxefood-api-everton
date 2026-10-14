package br.edu.ifpe.oxefood.api.Voto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class VotoDTO {
    private Long id;

    private String nomeEleitor;

    private LocalDate dataVotacao;

    private String numeroRegistroEleitoral;

    private Integer numeroCandidatoDepFederal;

    private Integer numeroCandidatoDepEstadual;

    private Integer numeroCandidatoSenador;

    private  Integer numeroCandidatoGovernador;

    private  Integer numeroCandidatoPresidente;

}