import java.util.Scanner;

public class ConverteONG {
    public static void main(String[] args) {
        float cotaDolar;
        float doacao;
        String skipl = "\n";
        Scanner reader = new Scanner(System.in);
        System.out.println("Conversão de vaalores em dólar para real");
        System.out.println("Digite a cotação atual do dólar: ");
        cotaDolar = reader.nextFloat();
        System.out.println("Digite o valor da doação recebida: ");
        doacao = reader.nextFloat();
        System.out.println("O valor da doação em reais é de: "+skipl+"R$"+ String.format("%,.2f",(doacao*cotaDolar)));
    }
}