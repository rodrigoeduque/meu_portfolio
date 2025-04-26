package br.com.rodrigoeduque.meu_portifolio.model;

import lombok.Data;

@Data
public class Habilidade {
    private Long id;
    private String nome;
    private Integer nivelConhecimento; // 1-5 por exemplo
    private String categoria; // "Back-end", "DevOps", etc
    private String icone;

}
