package br.com.ifsul.model;


import br.com.ifsul.model.Bairro;

public class Endereco {

    private Long Id;
    private String rua;
    private Bairro bairro;

    public Endereco(Bairro bairro) {
        this.setBairro(bairro);
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        this.Id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

}