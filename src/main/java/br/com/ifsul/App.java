package br.com.ifsul;

import br.com.ifsul.model.Bairro;
import br.com.ifsul.model.Endereco;
import br.com.ifsul.model.Grupo;
import br.com.ifsul.model.Pessoa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Bairro meuBairro = new Bairro();
        meuBairro.setNome("sao judas");

        Endereco end = new Endereco(meuBairro);

        Pessoa eu = new Pessoa(end);
        eu.setNome("FUlano");

        Grupo grupo1 = new Grupo(eu);
        grupo1.setNome("grupo de java");

        System.out.println( "GRUPO: " + grupo1.getNome() + " tem o " + grupo1.getPessoa().getNome() + " como administrador");



    }
}
