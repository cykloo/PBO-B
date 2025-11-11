public class Mobil extends Kendaraan {
    private int jumlahRoda;

    public Mobil(String merk, String model, int tahunProduksi, int jumlahRoda) {
        super(merk, model, tahunProduksi, "Mobil");
        this.jumlahRoda = jumlahRoda;
    }

    @Override
    public void tampilInfo() {
        System.out.println("=== INFORMASI MOBIL ===");
        super.tampilInfo();
        System.out.println("Jumlah Roda: " + jumlahRoda);
    }
}
