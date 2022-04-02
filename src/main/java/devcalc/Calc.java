// 1 pacote (conjunto de classes)

package devcalc;
// 2 bibliotecas (arquivos prontos para uso, o que já é herdado)

import java.util.Scanner;

public class Calc {
        static Scanner entrada = new Scanner(System.in);

//3.1 atributos (altura, peso, idade, etc)
//3.2 método / função (realiza alguma ação e na função a ação é realizada e comunicada; retorno)

    public static void main (String [] args) {
        System.out.println(">>>CALCULADORA<<<:");
        System.out.println("(1) Somar");
        System.out.println("(2) Subtrair");
        System.out.println("(3) Multiplicar");
        System.out.println("(4) Dividir");
        System.out.print("ESCOLHA O CALCULO DESEJADO: ");

        int opcao = entrada.nextInt();
        int num1 = 0;
        int num2 = 0;

        if (opcao >= 1 && opcao <=4) {
            System.out.print("ENTRE COM O PRIMEIRO NÚMERO: ");
            num1 = entrada.nextInt();
            System.out.print("ENTRE COM O SEGUNDO NÚMERO: ");
            num2 = entrada.nextInt();
            System.out.print("O resultado é: ");
        }
        switch (opcao) {
            case 1:
                System.out.println(somarDoisNumeros(num1,num2));
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }


    }

    public static int somarDoisNumeros (int num1,int num2){

               return num1 + num2;
    }



}
