package org.example.aula13;

public class Aula_Heranca {
    static void main() {

        //classe mãe

        Medico mariaMedica = new Medico();

        mariaMedica.batePonto();
        mariaMedica.dorme();
        mariaMedica.fazCirurgia();


        FuncionariosHospital joaoRh = new FuncionariosHospital();

        joaoRh.batePonto();

        Oftalmologista alineOftalmo = new Oftalmologista();

        alineOftalmo.examinaOlho();
        alineOftalmo.passarCrachar();
        alineOftalmo.fazCirurgia();

    }

}

/*
Quais são os Pilares:

Herança: Herança em java é um mecanismo de Programação


 */
