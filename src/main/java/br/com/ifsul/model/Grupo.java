package br.com.ifsul.model;


import br.com.ifsul.model.Pessoa;

public class Grupo {

    private Long Id;
    private String nome;
    private Pessoa pessoa;

    public Grupo(Pessoa pessoa) {
        this.setPessoa(pessoa);
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        this.Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

}