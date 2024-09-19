package aula3;

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

        Cachorro rex = new Cachorro();
        rex.nome = "Rex";
        rex.idade = 3;
        rex.latir();
    }
}