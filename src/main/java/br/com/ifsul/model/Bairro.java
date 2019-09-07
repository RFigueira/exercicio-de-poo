package br.com.ifsul.model;



public class Bairro {

    private Long Id;
    private String nome;

    public String getNome() {
        return nome;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        this.Id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



}