package br.com.devdojo.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - * /

        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;
        System.out.println(resultado);

        // %
        int resto = 20 % 2;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = numero01 > numero02;
        System.out.println("isDezMaiorQueVinte: " + isDezMaiorQueVinte);
        boolean isDezMenorQueVinte = numero01 < numero02;
        System.out.println("isDezMenorQueVinte: " + isDezMenorQueVinte);
        boolean isDezIgualQueVinte = numero01 == numero02;
        System.out.println("isDezIgualQueVinte: " + isDezIgualQueVinte);
        boolean isDezDiferenteQueVinte = numero01 != numero02;
        System.out.println("isDezDiferenteQueVinte: " + isDezDiferenteQueVinte);

        // && (AND) || (OR) ! (NOT)

        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLei: " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLei: " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorTotalPlaystation = 5000F;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorTotalPlaystation || valorTotalContaPoupanca > valorTotalPlaystation;
        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);

        // =  +=  -=  *=  /=  %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println("bonus " + bonus);

        // ++ --
        int contador = 0;
        contador += 1;
        contador ++;
        contador --;

        int contador2 = 0;
        System.out.println(contador2++);
        System.out.println(contador2);

    }
}
