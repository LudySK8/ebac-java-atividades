public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.push(new Node(10));
        list.push(new Node(20));
        list.push(new Node(30));
        list.printList(); // 10 -> 20 -> 30 -> null

        list.insert(1, new Node(15));
        list.printList(); // 10 -> 15 -> 20 -> 30 -> null

        list.remove(2);
        list.printList(); // 10 -> 15 -> 30 -> null

        System.out.println("Elemento no índice 1: " + list.elementAt(1).data); // 15

        Node popped = list.pop();
        System.out.println("Removido: " + popped.data);
        list.printList(); // 10 -> 15 -> null

        System.out.println("Tamanho da lista: " + list.size());
    }
}
