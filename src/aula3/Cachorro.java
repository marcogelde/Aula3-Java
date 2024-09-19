package aula3;

public class Cachorro {
    private String nome;
    int idade;

    //Criando a condição de inserir nome
    public void atribuiNome(String nomeDoCachorro) {
        this.nome = nomeDoCachorro;
    }

    public String obterNome() {
        return this.nome;
    }

    public void latir(){
        System.out.println(this.nome + " late");
    }
}
