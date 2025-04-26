package br.com.rodrigoeduque.meu_portifolio.model;

import lombok.Data;

@Data
public class Usuario {
    private Long id;
    private String login;
    private String senha;
    private String nome;
}
