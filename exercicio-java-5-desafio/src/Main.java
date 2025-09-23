public class Main {
    public static void main(String[] args) {
        HashMapDoZero mapa = new HashMapDoZero();

        mapa.put(1, 10);
        mapa.put(11, 20);
        mapa.put(21, 30);

        mapa.printMapa();

        System.out.println("Valor da chave 11: " + mapa.get(11));

        mapa.delete(11);
        mapa.printMapa();

        mapa.clear();
        mapa.printMapa();
    }
}
