package aula3;

public class Animal {

    private String nome;

    public void fazerSom(){
        System.out.println("O animal emite som");
    }

    public void fazerSom(String nome){
        System.out.println(nome + " emite som");
    }

}