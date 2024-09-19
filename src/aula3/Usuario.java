package aula3;

public class Usuario {
    String nome;
    int idade;
    String cpf;
    boolean estaLogado = false;

    public boolean eleEstaLogado() {
        return this.estaLogado;
    }
}
