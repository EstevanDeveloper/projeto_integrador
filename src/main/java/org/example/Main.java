package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Main {
    static void main() {

        Scanner input = new Scanner(System.in);
        // declarando minhas variáveis

        String nome;
        int idade = 0;
        float salario = 0;
        int medida = 0; // mês, semanas, anos, dias,
        int tempo = 0;
        int filhos = 0;
        int modalidade = 0;
        int veiculo = 0;

        //entrada de dados
        System.out.println("Qual o nome do colaborador? ");
        nome = input.nextLine();

        System.out.println("Qual a idade do colaborador? ");
        idade = input.nextInt();

        System.out.println("Qual o salário? ");
        salario = input.nextInt();

        System.out.println("Trabalha a dias(1), semanas(2), meses(3) ou anos(4) na empresa? ");
        medida = input.nextInt();

        System.out.println("Qual o tempo na empresa? ");
        medida = input.nextInt();

        System.out.println("Quantos filhos tem? ");
        filhos = input.nextInt();

        System.out.println("Qual a modalidade de trabalho? 1 - presencial/ 0 - home office ");
        modalidade = input.nextInt();

        System.out.println("possui o veíulo próprio? 1 - sim/ 0 - não ");
        veiculo = input.nextInt();

        // vale alimentação
        if (filhos > 0 && salario < 3000){
            System.out.println("Tem direito ao vale-alimentação!");
        }

        // direito ao auxilio creche
        if (filhos > 0){
            System.out.println("Tem direito ao auxílio creche!");
        }

        if (modalidade == 0){
            System.out.println("Tem direito ao plano de saúde");
        }

        if (modalidade == 0){
            System.out.println("Você tem direito ao auxílio home office!");
        }

        if (veiculo > 0){
            System.out.println("Você tem direito ao auxílio combustível!");
        }

        if (idade > 18){
            System.out.println("Você pode participar da PLR");
        }

        if (idade < 24 && salario < 3000){
            System.out.println("Você tem direito a bolsa de estudos!");
        }
    }
}
