import java.util.HashMap;
import java.util.Map;

public class FibonacciTopDown {

    private static Map<Integer, Integer> memo = new HashMap<>();

    public static int fib(int n) {
        if (n <= 1)
            return n;
        if (memo.containsKey(n))
            return memo.get(n);

        int resultado = fib(n - 1) + fib(n - 2);
        memo.put(n, resultado);
        return resultado;
    }
}
