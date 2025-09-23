class HashMapDoZero {

    // Nó da lista encadeada
    private static class Node {
        int key;
        int value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private Node[] buckets;
    private int tamanho;

    public HashMapDoZero() {
        this.tamanho = 10; // tamanho fixo
        this.buckets = new Node[tamanho];
    }

    // Função hash
    private int hash(int key) {
        return key % tamanho;
    }

    // put -> adiciona ou atualiza
    public void put(int key, int value) {
        int index = hash(key);
        Node head = buckets[index];

        // Atualiza se a chave já existir
        Node current = head;
        while (current != null) {
            if (current.key == key) {
                current.value = value;
                return;
            }
            current = current.next;
        }

        // Insere no início da lista
        Node novo = new Node(key, value);
        novo.next = head;
        buckets[index] = novo;
    }

    // get -> retorna o valor associado
    public Integer get(int key) {
        int index = hash(key);
        Node current = buckets[index];

        while (current != null) {
            if (current.key == key) {
                return current.value;
            }
            current = current.next;
        }
        return null; // não encontrado
    }

    // delete -> remove a chave
    public void delete(int key) {
        int index = hash(key);
        Node current = buckets[index];
        Node prev = null;

        while (current != null) {
            if (current.key == key) {
                if (prev == null) {
                    buckets[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    // clear -> limpa tudo
    public void clear() {
        buckets = new Node[tamanho];
    }

    // só para debug
    public void printMapa() {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(i + ": ");
            Node current = buckets[i];
            while (current != null) {
                System.out.print("[" + current.key + " -> " + current.value + "] ");
                current = current.next;
            }
            System.out.println();
        }
    }
}
