import java.util.Scanner;

public class DecisaoEncadeada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero;
        System.out.println("Digite um número: ");
        numero = leitor.nextInt();
        if(numero>0){
            System.out.println("Número positivo");
        } else if (numero == 0) {
            System.out.println("Número nulo");
        }else {
            System.out.println("Número negativo");
        }
    }
}
