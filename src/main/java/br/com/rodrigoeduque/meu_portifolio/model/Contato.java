package br.com.rodrigoeduque.meu_portifolio.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Contato {
    private Long id;
    private String nome;
    private String email;
    private String assunto;
    private String mensagem;
    private LocalDateTime dataMensagem;
    private Boolean lido;
}
