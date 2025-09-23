public class Main {
    public static void main(String[] args) {
        FilaFIFO fila = new FilaFIFO(5);

        fila.enqueue(2);
        fila.enqueue(6);
        fila.enqueue(9);
        fila.enqueue(1);

        fila.printFila(); // Fila: 2 6 9 1

        System.out.println("Front: " + fila.front()); // 2
        System.out.println("Rear: " + fila.rear());   // 1
        System.out.println("Tamanho: " + fila.size()); // 4

        System.out.println("Removido: " + fila.dequeue()); // 2
        fila.printFila(); // Fila: 6 9 1
    }
}
