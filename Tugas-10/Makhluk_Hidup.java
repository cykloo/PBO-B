public abstract class Makhluk_Hidup {

    protected String nama;

    public Makhluk_Hidup() {
        this.nama = "Tidak Bernama";
    }

    public Makhluk_Hidup(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public abstract void bernapas();

    public abstract void makan();

    public void tumbuh() {
        System.out.println(nama + " sedang mengalami pertumbuhan.");
    }
}
