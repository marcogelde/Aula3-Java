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

        System.out.println(marcelo.nome + " tem " + marcelo.idade); //Imprimir o hash
        System.out.println(carlos.nome + " tem " + carlos.idade);

    }
}