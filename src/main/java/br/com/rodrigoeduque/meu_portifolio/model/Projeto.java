package br.com.rodrigoeduque.meu_portifolio.model;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class Projeto {

    private Long id;
    private String titulo;
    private String descricao;
    private String imagem;
    private String repositorio;
    private String urlDemo;
    private List<String> tecnologiasUtilizadas;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private Boolean destaque;
}
