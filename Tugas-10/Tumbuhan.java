public class Tumbuhan extends Makhluk_Hidup {

    @Override
    public void bernapas() {
        System.out.println("Tumbuhan = Melakukan respirasi menggunakan stomata dan lentisel.");
    }
    
    @Override
    public void makan() {
        System.out.println("Tumbuhan = Menghasilkan makanan sendiri melalui proses fotosintesis.");
    }

    public void fotosintesis() {
        System.out.println("Tumbuhan sedang melakukan fotosintesis dengan bantuan cahaya matahari.");
    }
}
