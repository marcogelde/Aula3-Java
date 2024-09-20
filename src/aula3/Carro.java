package aula3;

public class Carro extends Veiculo{
    String modelo;
    int ano;

    public String acelerar(){
        return "Estou acelerando";
    }

    @Override
    public void ligar() {
        System.out.println("O carro está ligado.");
    }
}
