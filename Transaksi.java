public class Transaksi {

    public void statusBarang(String barang, int harga, int jumlah) { // menampilkan barang yang dibeli
        System.out.println("======================================");
        System.out.println("        Barang: " + barang);
        System.out.println("        Harga : Rp" + harga);
        System.out.println("        Jumlah: " + jumlah);
        System.out.println("======================================");
    }

    public static int silverBeli(int saldo, int harga, int jumlah) { // jika pelanggan user silver
        if (saldo >= 10000) { // saldo minimal 10000
            if (saldo >= (harga * jumlah) && (harga * jumlah > 1000000)) {
                saldo -= (harga * jumlah);
                saldo += (harga * jumlah * 0.05); // cashback 5%
                System.out.println("Pembelian Berhasil!");
                System.out.println("Sisa saldo Anda: " + saldo);
                System.out.println();
            } else if (saldo >= (harga * jumlah) && (harga * jumlah < 1000000)) {
                saldo -= (harga * jumlah);
                System.out.println("Pembelian Berhasil!");
                System.out.println("Sisa saldo Anda: " + saldo);
                System.out.println();
            } else {
                System.out.println("Maaf, saldo Anda tidak mencukupi!");
                System.out.println("Silahkan top up terlebih dahulu!");
                System.out.println();
            }
        } else {
            System.out.println("Maaf, saldo Anda tidak mencukupi!");
            System.out.println("Silahkan top up terlebih dahulu!");
            System.out.println();
        }
        return saldo;
    }

    public static int goldBeli(int saldo, int harga, int jumlah) { // jika pelanggan user gold
        if (saldo >= 10000) { // saldo minimal 10000
            if (saldo >= (harga * jumlah) && (harga * jumlah > 1000000)) {
                saldo -= (harga * jumlah);
                saldo += (harga * jumlah * 0.07); // cashback 7%
                System.out.println("Pembelian Berhasil!");
                System.out.println("Sisa saldo Anda: " + saldo);
                System.out.println();
            } else if (saldo >= (harga * jumlah) && (harga * jumlah < 1000000)) {
                saldo -= (harga * jumlah);
                saldo += (harga * jumlah * 0.02); // cashback 2%
                System.out.println("Pembelian Berhasil!");
                System.out.println("Sisa saldo Anda: " + saldo);
                System.out.println();
            } else {
                System.out.println("Maaf, saldo Anda tidak mencukupi!");
                System.out.println("Silahkan top up terlebih dahulu!");
                System.out.println();
            }
        } else {
            System.out.println("Maaf, saldo Anda tidak mencukupi!");
            System.out.println("Silahkan top up terlebih dahulu!");
            System.out.println();
        }
        return saldo;
    }

    public static int platinumBeli(int saldo, int harga, int jumlah) { // jika pelanggan user platinum
        if (saldo >= 10000) { // saldo minimal 10000
            if (saldo >= (harga * jumlah) && (harga * jumlah > 1000000)) {
                saldo -= (harga * jumlah);
                saldo += (harga * jumlah * 0.1); // cashback 10%
                System.out.println("Pembelian Berhasil!");
                System.out.println("Sisa saldo Anda: " + saldo);
                System.out.println();
            } else if (saldo >= (harga * jumlah) && (harga * jumlah < 1000000)) {
                saldo -= (harga * jumlah);
                saldo += (harga * jumlah * 0.05); // cashback 5%
                System.out.println("Pembelian Berhasil!");
                System.out.println("Sisa saldo Anda: " + saldo);
                System.out.println();
            } else {
                System.out.println("Maaf, saldo Anda tidak mencukupi!");
                System.out.println("Silahkan top up terlebih dahulu!");
                System.out.println();
            }
        } else {
            System.out.println("Maaf, saldo Anda tidak mencukupi!");
            System.out.println("Silahkan top up terlebih dahulu!");
            System.out.println();
        }
        return saldo;
    }

    public static void akunInfo(String nama, String nomorPelanggan, String member, int saldo) { // mendapatkan info
        System.out.println("======================================");
        System.out.println("SELAMAT DATANG " + nama);
        System.out.println("Nomor Pelanggan : " + nomorPelanggan);
        System.out.println("Member          : " + member);
        System.out.println("Saldo           : " + saldo);
        System.out.println("======================================");
    }
}