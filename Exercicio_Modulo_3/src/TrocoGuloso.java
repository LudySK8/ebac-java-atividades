import java.util.*;

public class TrocoGuloso {

    public static int menorNumeroDeMoedas(int quantia, int[] moedas) {
        Arrays.sort(moedas); // ordena crescente
        int totalMoedas = 0;
        int restante = quantia;

        // percorre do maior para o menor
        for (int i = moedas.length - 1; i >= 0; i--) {
            int moeda = moedas[i];
            int usar = restante / moeda; // quantas moedas dessa posso usar
            totalMoedas += usar;
            restante -= usar * moeda;

            if (restante == 0) break;
        }

        return totalMoedas;
    }

    public static void main(String[] args) {
        int quantia = 18;
        int[] moedas = {5, 2, 1};

        int resultado = menorNumeroDeMoedas(quantia, moedas);
        System.out.println("Menor número de moedas: " + resultado);
    }
}
