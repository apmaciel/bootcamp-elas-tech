package org.example.petshop;

import java.lang.reflect.Array;
import java.util.*;

public class Pet_Shop {
    static void main() {

        Pet[] listaPet = new Pet[5]; // criando um array do tipo da classe Pet

        ArrayDeque<String> fila = new ArrayDeque<>(); //array deque pega sempre o primeiro

        ArrayList<Servico> servicos = new ArrayList<>(); //criando o arrayList para pegar os métodos

        servicos.add(new Banho()); //aqui estamos adicionando as classes a lista
        servicos.add(new Tosa());
        servicos.add(new Consulta());


        Scanner sc = new Scanner(System.in); // aqui declaramos o input


        int opcao = -1;
        int total = 0;


        while (opcao != 0) {

            System.out.println("\n=== ESCOLHA UMA DAS OPÇÕES ===");
            System.out.println(" 1 - Cadastrar novo Pet.");
            System.out.println(" 2 - Listar pets.");
            System.out.println(" 3 - Busca por nome de pet.");
            System.out.println(" 4 - Espécies Cadastradas");
            System.out.println(" 5 - Entrar na fila de banho");
            System.out.println(" 6 - Atender próximo da fila");
            System.out.println(" 7 - Serviços completos ");
            System.out.println(" 0 - Sair.");

            try {
                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                    case 1:
                        //criando um pet animal ou nova ficha
                        // antigo jeito de armazenar antes da q.14, Pet novoPet = new Pet();

                        //perguntando e armazenando os dados dos pet nas variáveis
//                        System.out.println("Digite o nome do seu Pet? ");
//                        novoPet.nome = sc.nextLine();
//                        System.out.println("Qual a espécie do seu Pet? ");
//                        novoPet.especie = sc.nextLine();
//                        System.out.println("O peso do seu Pet?");
//                        novoPet.peso = sc.nextDouble();
//                        sc.nextLine();

                        //guardando o pet e assim sucessivamente
//                        listaPet[total] = novoPet;
//                        total++;
//
//                        System.out.println("Pet cadastrado! Agora são " + total + " pet(s)");

                        // 14 - para gato e cao distinguir as classes

                        System.out.println("Digite o nome do seu Pet: ");
                        String nomeDigitado = sc.nextLine();
                        System.out.println("Qual a espécie do seu Pet: ");
                        String especieDigitada = sc.nextLine();
                        System.out.println("O peso do seu Pet: ");
                        double pesoDigitado = sc.nextDouble();
                        sc.nextLine();

                        Pet novoPet; // Salva sem definir as classes, apenas declarando

                        if (especieDigitada.equalsIgnoreCase("cachorro")){
                            novoPet = new Cachorro();
                        } else if (especieDigitada.equalsIgnoreCase("gato")) {
                            novoPet = new Gato();
                        }else {
                            novoPet = new Pet();
                        }

                        //aqui salvando os restantes dos dados em que ambas usam

                        novoPet.nome = nomeDigitado;
                        novoPet.especie = especieDigitada;
                        novoPet.peso = pesoDigitado;

                        listaPet[total] = novoPet; // quando um novo pet é criado adiciona 1 no total e por ai vai
                        total++;

                        System.out.println("Pet cadastrado! agora são " + total );

                        break;

                    case 2:

                        //fazendo um for para gente ver os pets que foram cadastrados
                        System.out.println("--- PETS CADASTRADOS ---");

                        for (int i = 0; i < total; i++) {
                            System.out.printf("\n" + listaPet[i].nome + " (" + listaPet[i].especie + ") - " + listaPet[i].peso +
                                    "Kg, Porte " + listaPet[i].definirPorte() + "\n");

                            listaPet[i].emitirSom(); //chamando a interface
                        }
                        break;

                    case 3:
                        System.out.println("Qual pet você procura ?");
                        String busca = sc.nextLine();

                        boolean achou = false;

                        for (int i = 0; i < total; i++) {
                            if (listaPet[i].nome.equalsIgnoreCase(busca)) {

                                System.out.printf("\n" + listaPet[i].nome + " (" + listaPet[i].especie + ") - " + listaPet[i].peso +
                                        "Kg, Porte " + listaPet[i].definirPorte() + "\n");
                                achou = true;
                            }
                        }
                        if (!achou) {
                            System.out.println("Não encontrado!");
                        }

                        break;

                    case 4:
                        HashSet<String> conjuntos = new HashSet<>();

                        for (int i = 0; i < total; i++){
                            conjuntos.add(listaPet[i].especie);
                        }
                        for(String conjunto : conjuntos){
                            System.out.println(conjunto);
                        }

                        System.out.println("Total de espécies diferentes " + conjuntos.size());

                        break;

                    case 5:
                    System.out.println("Nome do pet pra entrar na fila");
                    String nomeFila = sc.nextLine();

                    fila.add(nomeFila); //entra no fim da fila

                        System.out.println(nomeFila + "Entrou na fila");
                        System.out.println("Fila agora: " + fila);
                        break;

                    case 6:
                        if (fila.isEmpty()){ // verifica se tem alguem na fia
                            System.out.println("Fila vazia!");

                        }else {
                            System.out.println("Próximo da fila " + fila.peek() + "...");//olha quem ta na fila

                            String atendido = fila.poll(); //tirando fa fila -- está sendo atendido
                            System.out.println("Atendendo " + atendido + "...");

                            System.out.println("Fila agora: " + fila);
                        }
                        break;

                    case 7:
                        //descobrindo o pet
                        System.out.println("Qual o nome do pet para verificar os serviços");
                        String nomeServico = sc.nextLine(); //armazenando o nome

                        //aplicando os serviços das classes no que foi armazenado
                        for (Servico s : servicos){
                            s.executar(nomeServico);
                        }

                        break;

                    case 0:
                        System.out.println("Até logo!");
                        break;

                    default:
                        System.out.println("Opção inválida.");

                }


            }catch (InputMismatchException e) {
                System.out.println("Digite apenas número");
                sc.nextLine();

    }


}


        //saida do nossos inputs
//        System.out.println("=== FICHA DO PET ===");
////        System.out.println("Nome : " + animal.nome);
////        System.out.println("Espécie : " + animal.especie);
////        System.out.println("Peso :" + animal.peso);
////        System.out.println("Porte : " + animal.definirPorte()); //nosso método de porte foi chamado aqui
//



    }
}
