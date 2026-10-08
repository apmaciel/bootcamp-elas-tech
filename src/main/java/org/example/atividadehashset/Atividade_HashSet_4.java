package org.example.atividadehashset;

import java.util.HashSet;

public class Atividade_HashSet_4 {

    static void main() {

        /*
        4. Crie um HashSet com três CPFs e imprima. Depois remova um deles e
   imprima de novo, junto com o tamanho.
         */

        HashSet<String> cpf = new HashSet<>();

        cpf.add("043.166.166-22");
        cpf.add("033.033.033-68");
        cpf.add("022.222.022-45");

        System.out.println(cpf);
        System.out.println(cpf.size());

        cpf.remove("033.033.033-68");

        System.out.println(cpf);
        System.out.println(cpf.size());
    }
}
