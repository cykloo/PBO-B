public class Motor extends Kendaraan {
    private int jumlahRoda;

    public Motor(String merk, String model, int tahunProduksi, int jumlahRoda) {
        super(merk, model, tahunProduksi, "Motor");
        this.jumlahRoda = jumlahRoda;
    }

    @Override
    public void tampilInfo() {
        System.out.println("=== INFORMASI MOTOR ===");
        super.tampilInfo();
        System.out.println("Jumlah Roda: " + jumlahRoda);
    }
}
