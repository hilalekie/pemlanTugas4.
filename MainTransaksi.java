import java.util.Scanner;

public class MainTransaksi {
    public static void main(String[] args) {
        Scanner hebat = new Scanner(System.in);
        String pelanggan = "";
        Akun silver = new Akun();
        Akun gold = new Akun();
        Akun platinum = new Akun();
        Transaksi transaksi = new Transaksi();

        silver.setNama("Wongirenghebat");
        silver.setNomorPelanggan("3823112482");
        silver.setSaldo(1100000);
        silver.setPin("irenghebat");
        silver.setAktivasi(true);

        gold.setNama("Buna Toddy");
        gold.setNomorPelanggan("5610387609");
        gold.setSaldo(2500000);
        gold.setPin("bravotni");
        gold.setAktivasi(true);

        platinum.setNama("Tungtungtungtung Saor");
        platinum.setNomorPelanggan("7453829102");
        platinum.setSaldo(5000000);
        platinum.setPin("sahorsahor");
        platinum.setAktivasi(true);

        System.out.println("======================================");
        System.out.println("   SELAMAT DATANG DI SWALAYAN TINY");
        System.out.println("======================================");
        while (true) {
            System.out.println();
            System.out.println("================ MENU ================");
            System.out.println("1. Pembelian");
            System.out.println("2. Top up saldo");
            System.out.println("3. Keluar");
            System.out.println("======================================");
            System.out.print("System: ");
            int pilihan1 = hebat.nextInt();
            if (pilihan1 == 1 || pilihan1 == 2) { // login sebelum melakukan transaksi
                System.out.println("Silahkan login terlebih dahulu!");
                for (int i = 0; i < 3; i++) {
                    System.out.print("Nomor Pelanggan: ");
                    String case1 = hebat.next();
                    if (case1.equals(silver.getnomorPelanggan()) && silver.getAktivasi() == true) { // no.pelanggan
                                                                                                    // harus benar dan
                                                                                                    // aktif
                        for (int j = 0; j < 3; j++) {
                            System.out.print("PIN: ");
                            String case2 = hebat.next();
                            if (case2.equals(silver.getPin())) {
                                System.out.println("Login berhasil!");
                                pelanggan = "Silver";
                                System.out.println();
                                transaksi.akunInfo(silver.getNama(), silver.getnomorPelanggan(), pelanggan,
                                        silver.getSaldo());
                                break;
                            } else if (j == 2) { // jika sudah 3x salah pin
                                System.out.println("PIN salah!");
                                System.out.println("Akun anda akan dinonaktifkan!");
                                silver.setAktivasi(false);
                            } else {
                                System.out.println("PIN salah!");
                            }
                        }
                        if (pelanggan.equalsIgnoreCase("Silver")) {
                            break;
                        }

                    } else if (case1.equals(gold.getnomorPelanggan()) && gold.getAktivasi() == true) { // no.pelanggan
                                                                                                       // harus benar
                                                                                                       // dan aktif
                        for (int j = 0; j < 3; j++) {
                            System.out.print("PIN: ");
                            String case2 = hebat.next();
                            if (case2.equals(gold.getPin())) {
                                System.out.println("Login berhasil!");
                                pelanggan = "Gold";
                                System.out.println();
                                transaksi.akunInfo(gold.getNama(), gold.getnomorPelanggan(), pelanggan,
                                        gold.getSaldo());
                                break;
                            } else if (j == 2) { // jika sudah 3x salah pin
                                System.out.println("PIN salah!");
                                System.out.println("Akun anda akan dinonaktifkan!");
                                gold.setAktivasi(false);
                            } else {
                                System.out.println("PIN salah!");
                            }
                        }
                        if (pelanggan.equalsIgnoreCase("Gold")) {
                            break;
                        }

                    } else if (case1.equals(platinum.getnomorPelanggan()) && platinum.getAktivasi() == true) { // no.pelanggan
                                                                                                               // harus
                                                                                                               // benar
                                                                                                               // dan
                                                                                                               // aktif
                        for (int j = 0; j < 3; j++) {
                            System.out.print("PIN: ");
                            String case2 = hebat.next();
                            if (case2.equals(platinum.getPin())) {
                                System.out.println("Login berhasil!");
                                pelanggan = "Platinum";
                                System.out.println();
                                transaksi.akunInfo(platinum.getNama(), platinum.getnomorPelanggan(), pelanggan,
                                        platinum.getSaldo());
                                break;
                            } else if (j == 2) { // jika sudah 3x salah pin
                                System.out.println("PIN salah!");
                                System.out.println("Akun anda akan dinonaktifkan!");
                                platinum.setAktivasi(false);
                            } else {
                                System.out.println("PIN salah!");
                            }
                        }

                        if (pelanggan.equalsIgnoreCase("Platinum")) {
                            break;
                        }
                    }

                    else if (i == 2) {
                        System.out.println("Verifikasi gagal! Coba dalam beberapa saat lagi!");
                        System.exit(0);
                    } else {
                        System.out.println("Nomor pelanggan tidak ditemukan!");
                    }
                }

                if (pilihan1 == 1) {
                    System.out.println();
                    System.out.println("Apa nama barang yang ingin dibeli? (Satu kata)");
                    System.out.print("System: ");
                    String barang = hebat.next();
                    System.out.println("Berapa harga barang yang ingin dibeli?");
                    System.out.print("System: ");
                    int harga = hebat.nextInt();
                    System.out.println("Berapa jumlah barang yang ingin dibeli?");
                    System.out.print("System: ");
                    int jumlah = hebat.nextInt();
                    transaksi.statusBarang(barang, harga, jumlah);
                    if (pelanggan.equalsIgnoreCase("Silver")) {
                        int updatedSaldo = transaksi.silverBeli(silver.getSaldo(), harga, jumlah);
                        silver.setSaldo(updatedSaldo);
                    } else if (pelanggan.equalsIgnoreCase("Gold")) {
                        int updatedSaldo = transaksi.goldBeli(gold.getSaldo(), harga, jumlah);
                        gold.setSaldo(updatedSaldo);
                    } else if (pelanggan.equalsIgnoreCase("Platinum")) {
                        int updatedSaldo = transaksi.platinumBeli(platinum.getSaldo(), harga, jumlah);
                        platinum.setSaldo(updatedSaldo);
                    }
                } else if (pilihan1 == 2) {
                    System.out.println();
                    System.out.println("Silahkan masukkan nominal saldo yang ingin diisi!");
                    System.out.print("System: ");
                    int saldomain = hebat.nextInt();
                    if (pelanggan.equalsIgnoreCase("Silver")) {
                        silver.setSaldo(silver.getSaldo() + saldomain);
                        System.out.println("Saldo berhasil diisi!");
                        System.out.println("Saldo anda: " + silver.getSaldo());
                    } else if (pelanggan.equalsIgnoreCase("Gold")) {
                        gold.setSaldo(gold.getSaldo() + saldomain);
                        System.out.println("Saldo berhasil diisi!");
                        System.out.println("Saldo anda: " + gold.getSaldo());
                    } else if (pelanggan.equalsIgnoreCase("Platinum")) {
                        platinum.setSaldo(platinum.getSaldo() + saldomain);
                        System.out.println("Saldo berhasil diisi!");
                        System.out.println("Saldo anda: " + platinum.getSaldo());
                    }
                }
            } else if (pilihan1 == 3) {
                System.out.println("Terima kasih telah berbelanja di Swalayan Tiny!");
                System.exit(0);
            } else {
                System.out.println("Pilihan tidak tersedia!");
            }
        }
    }
}
