import java.math.BigInteger;

public class FatorialBottomUp {

    public static BigInteger fatorial(int n) {
        BigInteger resultado = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            resultado = resultado.multiply(BigInteger.valueOf(i));
        }
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(fatorial(100));
    }
}
