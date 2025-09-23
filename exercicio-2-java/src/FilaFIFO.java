public class FilaFIFO {
    private int[] elementos;
    private int tamanho;
    private int capacidade;

    public FilaFIFO(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new int[capacidade];
        this.tamanho = 0;
    }

    // Adiciona um número no final da fila
    public void enqueue(int valor) {
        if (tamanho == capacidade) {
            throw new RuntimeException("Fila cheia!");
        }
        elementos[tamanho] = valor;
        tamanho++;
    }

    // Remove o primeiro número da fila
    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia!");
        }
        int valor = elementos[0];
        // Shift dos elementos
        for (int i = 0; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        tamanho--;
        return valor;
    }

    // Retorna o último elemento (rear)
    public int rear() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia!");
        }
        return elementos[tamanho - 1];
    }

    // Retorna o primeiro elemento (front)
    public int front() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia!");
        }
        return elementos[0];
    }

    // Retorna tamanho da fila
    public int size() {
        return tamanho;
    }

    // Verifica se está vazia
    public boolean isEmpty() {
        return tamanho == 0;
    }

    // Só para visualizar a fila
    public void printFila() {
        System.out.print("Fila: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(elementos[i] + " ");
        }
        System.out.println();
    }
}
