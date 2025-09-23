public class MinhaPilha {
    private int[] elementos;
    private int topo;
    private static final int CAPACIDADE_INICIAL = 100;

    public MinhaPilha() {
        elementos = new int[CAPACIDADE_INICIAL];
        topo = -1;
    }

    public void push(int valor) {
        if (topo == elementos.length - 1) {
            System.out.println("Erro: pilha cheia!");
            return;
        }
        topo++;
        elementos[topo] = valor;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Erro: pilha vazia!");
            return -1; // Ou lançar exceção
        }
        int valor = elementos[topo];
        topo--;
        return valor;
    }

    public int top() {
        if (isEmpty()) {
            System.out.println("Erro: pilha vazia!");
            return -1;
        }
        return elementos[topo];
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public int size() {
        return topo + 1;
    }
}
