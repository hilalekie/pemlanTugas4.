public class Akun {
    private int saldo;
    private String nama;
    private String nomorPelanggan;
    private String pin;
    private boolean aktivasi = true;

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNomorPelanggan(String nomorPelanggan) {
        this.nomorPelanggan = nomorPelanggan;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public void setAktivasi(boolean aktivasi) {
        this.aktivasi = aktivasi;
    }

    public boolean getAktivasi() {
        return aktivasi;
    }

    public String getnomorPelanggan() {
        return nomorPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public String getPin() {
        return pin;
    }

    public int getSaldo() {
        return saldo;
    }
}