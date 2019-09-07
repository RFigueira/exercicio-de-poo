package br.com.ifsul.model;



import br.com.ifsul.model.Endereco;

public class Pessoa {

    private Long Id;
    private String nome;
    private Endereco endereco;

    public Pessoa(Endereco endereco) {
        this.setEndereco(endereco);
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


}