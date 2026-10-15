package org.example.atividadeheranca;

public class Main_Escola {

    static void main() {
        Aluna alunosNovos = new Aluna();

        alunosNovos.nome = "Ane Justos";
        alunosNovos.idade = 30;
        alunosNovos.curso = "Enfermagem";


        Professora prof = new Professora();

        prof.nome = "Flora";
        prof.disciplina ="Java";
        prof.idade = 30;
        prof.lancarNota("Ane Justos \n", 9.5);


        alunosNovos.apresentar();
        alunosNovos.estudar();

        prof.apresentar();
        alunosNovos.apresentar();

    }
}
