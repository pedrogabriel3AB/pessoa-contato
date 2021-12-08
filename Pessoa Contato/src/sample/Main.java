package sample;

import sample.model.Pessoa;

public class Main {


    public static void main(String[] args) {


            Pessoa pessoa = new Pessoa();
            pessoa.setNome("João Souza e Silva");
            pessoa.setContato("48-9999-9999", "joao@souza.com", "@joaosouzasilva");
            System.out.println(pessoa);
        }


    }


