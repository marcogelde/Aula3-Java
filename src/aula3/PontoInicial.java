package aula3;

import java.util.ArrayList;
import java.util.List;

public class PontoInicial {
    public static void main(String[] args) {

        //Definição && Instanciação

        Usuario marcelo = new Usuario();
        Usuario carlos = new Usuario();

        marcelo.nome = "Marcelo de Carvalho";
        marcelo.idade = 41;

        carlos.nome = "Carlos Manica";
        carlos.idade = 17;

        System.out.println(marcelo.nome + " está logado: " + marcelo.estaLogado);
        System.out.println(carlos.nome + " está logado: " + carlos.estaLogado);

        Carro carro = new Carro();
        System.out.println(carro.acelerar());

        Livro sacoDeOssos = new Livro("Stephen King", "Saco de Ossos", 568);

        /*
        sacoDeOssos.setAutor("Stephen King");
        sacoDeOssos.setTitulo("Saco de Ossos");
        sacoDeOssos.setPaginas(568);
        */

        System.out.println(
                sacoDeOssos.getAutor() + " escreveu " +
                sacoDeOssos.getTitulo() + " com " +
                sacoDeOssos.getPaginas() + " páginas "
        );


        Gato felix = new Gato();
        Peixe glubglub = new Peixe();

        felix.fazerSom("Felix");
        felix.fazerSom();

        glubglub.fazerSom("Glubglub");
        glubglub.fazerSom();

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Marco");
        pessoa.setIdade(29);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

        // Criando o cachorro rex e chamando o método fazerSom
        Cachorro rex = new Cachorro();
        rex.setNome("Rex");
        rex.idade = 3;
        rex.fazerSom("Rex");

        // Criação de uma lista de veiculos
        List<Veiculo> veiculos = new ArrayList<>();

        // Adicionando objetos Carro e Moto à lista
        veiculos.add(new Carro());
        veiculos.add(new Moto());

        // Iterando pela lista e chamando o método ligar
        for (Veiculo veiculo : veiculos) {
            veiculo.ligar();
        }
    }
}