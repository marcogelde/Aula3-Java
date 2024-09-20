package aula3;

public class Animal {

    private String nome;

    public void emitirSom(){
        System.out.println("O animal emite som");
    }

    public void emitirSom(String nome){
        System.out.println(nome + " emite som");
    }

}