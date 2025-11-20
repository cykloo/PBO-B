public class Main {
    public static void main(String[] args) {

        System.out.println("=== Manusia ===");
        Manusia manusia = new Manusia();
        manusia.bernapas();
        manusia.makan();
        manusia.tumbuh();
        manusia.bekerja();   

        System.out.println();

        System.out.println("=== Hewan ===");
        Hewan hewan = new Hewan();
        hewan.bernapas();
        hewan.makan();
        hewan.tumbuh();
        hewan.suara();
        hewan.bergerak();

        System.out.println();

        System.out.println("=== Tumbuhan ===");
        Tumbuhan tumbuhan = new Tumbuhan();
        tumbuhan.bernapas();
        tumbuhan.makan();
        tumbuhan.tumbuh();
        tumbuhan.fotosintesis();
    }
}
