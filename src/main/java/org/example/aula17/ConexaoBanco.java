package org.example.aula17;

public class ConexaoBanco {

    private static ConexaoBanco instancia;
    public String a;

    //instancia é o que vai receber o objeto
    // singleton sempre privado - esconder o construtor para outras classes não criarem

    private ConexaoBanco(){
    //aqui um novo construtor
    }

    public static ConexaoBanco getInstancia(){
        // checa para ver se ta vazio
        if (instancia == null){
            instancia = new ConexaoBanco();
        }
        return instancia;
    }

}
