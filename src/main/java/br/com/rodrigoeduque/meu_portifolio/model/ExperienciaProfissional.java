package br.com.rodrigoeduque.meu_portifolio.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ExperienciaProfissional {
    private Long id;
    private String empresa;
    private String cargo;
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private Boolean atual;
}
