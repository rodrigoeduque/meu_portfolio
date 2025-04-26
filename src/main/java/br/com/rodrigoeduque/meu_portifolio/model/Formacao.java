package br.com.rodrigoeduque.meu_portifolio.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Formacao {
    private Long id;
    private String instituicao;
    private String curso;
    private String nivel; // "Graduação", "Pós-graduação", etc
    private LocalDate dataInicio;
    private LocalDate dataFim;
}
