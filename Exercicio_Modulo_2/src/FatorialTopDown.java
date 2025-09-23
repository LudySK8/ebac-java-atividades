import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class FatorialTopDown {

    private static Map<Integer, BigInteger> memo = new HashMap<>();

    public static BigInteger fatorial(int n) {
        if (n == 0 || n == 1)
            return BigInteger.ONE;
        if (memo.containsKey(n))
            return memo.get(n);

        BigInteger resultado = BigInteger.valueOf(n).multiply(fatorial(n - 1));
        memo.put(n, resultado);
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(fatorial(100));
    }
}
