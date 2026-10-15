package org.example.aula16;

public class Principios_Solides {


}

/*
São usados no mercado de trabalho.

S.O.L.I.D

S - Single Responsibility Principle (Princípio da Responsabilidade Única)
O - Open/Closed Principle (Princípio do Aberto/Fechado)
L - Liskov Substitution Principle (Princípio da Substituição de Liskov)
I - Interface Segregation Principle (Princípio da Segregação de Interfaces)
D - Dependency Inversion Principle (Princípio da Inversão de Dependência)

S = uma classe, componente ou função, deve ter apenas uma única responsabilidade.

Importância -- > cada metodo resolve um problema, cada classe cuida de um assunto.
Não é regra de belez. è para facilitar e achar as coisas.
Vocês já sentira, a falta disso: metodo gigante é onde o bug se esconde

Não pode lógica de login e usuários juntos.

Ao invés de ter uma classe Usuario que faz tudo isso, separar na classe cadastroUnico
e loginUsuario.

Divisão de Funções -->

Vantagens --> Facilidade de alteração :

Menor rísco de efeitos colaterais :

Código mais fácil de entender:

Testes unitários simples:

Alta coesão.

Componentes reaproveitáveis:

Facilidade para trabalhar em equipe:

O : ligado ao Switch e if/else

L: uma classe filha deve perder substitui sua classe mãe sem quebrar o funcionamento
do programa




 */
