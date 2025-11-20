public class Manusia extends Makhluk_Hidup {

    @Override
    public void bernapas() {
        System.out.println("Manusia = Bernapas menggunakan paru-paru untuk mengambil oksigen.");
    }
    
    @Override
    public void makan() {
        System.out.println("Manusia = Mengonsumsi berbagai jenis makanan untuk mendapatkan energi.");
    }

    public void belajar() {
        System.out.println("Manusia sedang belajar untuk menambah pengetahuan.");
    }

    public void bekerja() {
        System.out.println("Manusia dapat bekerja untuk memenuhi kebutuhan hidup.");
    }
}
