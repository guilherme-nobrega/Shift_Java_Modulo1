import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
        int valor1;
        int valor2;
        int soma, subtrai, multiplica;
        float divisao;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Este programa irá somar, subtrair, multiplicar e" +
                " dividir");
        System.out.println("Digite o primeiro valor: ");
        valor1 = leitor.nextInt();
        System.out.println("Digite o segundo valor: ");
        valor2 = leitor.nextInt();
        soma = valor1 + valor2;
        System.out.println("SOMA: " +soma);
        subtrai = valor1 - valor2;
        System.out.println("SUBTRAÇÃO: " +subtrai);
        multiplica = valor1 * valor2;
        System.out.println("MULTIPLICAÇÃO: " +multiplica);
        if(valor2 == 0){
            System.out.println("DIVISAO: Não é possível divisão por zero");
        }else {
            divisao = (float) valor1 / valor2;  // conversão de variável via casting,
                                                // somente necessario a conversao de
                                                // um valor
            System.out.println("DIVISAO: " +divisao);
        }

    }
}
