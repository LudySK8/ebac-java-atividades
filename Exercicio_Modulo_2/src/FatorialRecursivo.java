import java.math.BigInteger;

public class FatorialRecursivo {

    public static BigInteger fatorial(int n) {
        if (n == 0 || n == 1)
            return BigInteger.ONE;
        return BigInteger.valueOf(n).multiply(fatorial(n - 1));
    }

    public static void main(String[] args) {
        int numero = 7;
        System.out.println("Fatorial de " + numero + " é: " + fatorial(numero));
    }
}
