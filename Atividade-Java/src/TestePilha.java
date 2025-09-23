public class TestePilha {
    public static void main(String[] args) {
        MinhaPilha pilha = new MinhaPilha();

        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        System.out.println("Topo: " + pilha.top());
        System.out.println("Tamanho: " + pilha.size());

        System.out.println("Removido: " + pilha.pop());
        System.out.println("Topo: " + pilha.top());
        System.out.println("Está vazia? " + pilha.isEmpty());
    }
}
