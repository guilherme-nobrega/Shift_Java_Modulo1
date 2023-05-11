import java.util.Scanner;

public class ConsumoVeiculo {
    public static void main(String[] args) {
        int kmIni;
        int kmFinal;
        float litros;
        String skipl = "\n";

        Scanner reader = new Scanner(System.in);
        System.out.println(skipl+"Cálculo de consumo de combustível"+skipl);
        System.out.println("Digite a quilometragem inicial do veículo: ");
        kmIni = reader.nextInt();
        System.out.println("Digite a quilometragem final do veículo: ");
        kmFinal = reader.nextInt();
        System.out.println("Digite a quantidade de combustível abastecida: ");
        litros = reader.nextFloat();

        System.out.println(skipl+"A média de consumo é de "+ String.format("%,.2f",(kmFinal-kmIni)/litros) + " Km/l");

    }
}
