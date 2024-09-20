package aula3;

public class Cachorro extends Animal {
    private String nome;
    int idade;

    public void setNome(String nomeDoCachorro) {
        this.nome = nomeDoCachorro;
    }
    public String getNome() {
        return this.nome;
    }

    public void latir(){
        System.out.println(this.nome + " late");
    }

    @Override
    public void fazerSom(){
        System.out.println("Auau");
    }

    @Override
    public void fazerSom(String nome){
        System.out.println(nome + " latiu: auau");
    }
}
