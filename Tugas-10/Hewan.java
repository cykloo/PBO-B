public class Hewan extends Makhluk_Hidup {

    @Override
    public void bernapas() {
        System.out.println("Hewan = Bernapas (bisa dengan paru-paru, insang).");
    }
    
    @Override
    public void makan() {
        System.out.println("Hewan = Makan (bisa daging atau tumbuhan).");
    }

    public void suara() {
        System.out.println("Hewan mengeluarkan suara.");
    }

    public void bergerak() {
        System.out.println("Hewan bergerak dengan berbagai cara.");
    }
}
