package br.com.rodrigoeduque.meu_portifolio.model;

import lombok.Data;

@Data
public class Pessoa {

    private Long id;
    private String nome;
    private String sobrenome;
    private String email;
    private String telefone;
    private String resumo;
    private String fotoPerfil;
    private String linkedIn;
    private String github;
}
