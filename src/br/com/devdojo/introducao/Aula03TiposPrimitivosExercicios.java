package br.com.devdojo.introducao;

/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <Nome>, morando no endereço <Endereço>,
confirmo que recebi o salário de <Salário>, na data <Data>
 */

public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {

        String nome = "Goku";
        String endereco = "Rua Alberto Williams";
        double salario = 1200.00;
        String dataRecebimentoSalario = "12/12/2012";
        String relatorio = "Eu " + nome + ", morando no endereço " + endereco + ",\n" +
                "confirmo que recebi o salário de " + salario + ", na data " + dataRecebimentoSalario + ".";

        System.out.println(relatorio);
    }

}
