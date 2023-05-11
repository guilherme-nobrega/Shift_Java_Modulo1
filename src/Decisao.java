import java.util.Scanner;

public class Decisao {
    public static void main(String[] args) {
        char sexo;
        int idade;
        String bemVindo;
        Scanner reader = new Scanner(System.in);
        System.out.println("Escolha seu genêro: ");
        System.out.println("Masculino - M \nFeminino - F \nNeutro - N");
        sexo = reader.next().charAt(0);
        if (sexo == 'M' || sexo == 'm')
            bemVindo = "Bem vindo";
        else if (sexo == 'F' || sexo == 'f') {
            bemVindo = "Bem vinda";
        }else {
            bemVindo = "Bem vinde";
        }
        System.out.println(bemVindo+" a classificação etária do filme:");
        System.out.println("\nDigite sua idade: ");
        idade = reader.nextInt();

        if (idade < 0){
            System.out.println("\nIdade inválida");
        } else if (idade >= 0 && idade < 12) {
            System.out.println("\nFilmes de classificação livre");
        } else if (idade >= 12 && idade < 16) {
            System.out.println("\nFilmes de classificação livre e 12 anos");
        } else if (idade < 18 && idade >= 16) {
            System.out.println("\nFilmes de classificação livre, 12 e 16 anos");
        } else if (idade >= 18 && idade < 100) {
            System.out.println("\nFilmes de qualquer classificação");
        }else {
            System.out.println("\nIdade inválida");
        }
    }
}
