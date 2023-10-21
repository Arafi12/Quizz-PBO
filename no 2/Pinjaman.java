import java.util.Scanner;

public class Pinjaman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" ----- WELCOME TO THE SOLUTION OF MONEY ----- ");
        System.out.println(" ================================================= ");
        System.out.println();
        System.out.println("----------------------< * >----------------------  ");
        System.out.println("SILAHKAN PILIH PAKET PINJAMAN :");
        System.out.println("1. KARUNG");
        System.out.println("2. PAPER BAG");
        System.out.println();
        System.out.print("MASUKKAN PILIHAN PAKET : ");
        int pilihan = scanner.nextInt();
        System.out.println("----------------------< * >----------------------  ");
        System.out.println();
        if (pilihan == 1) {
            System.out.println("Silahkan Masukan Data Anda");
            System.out.println("----------------------< * >----------------------  ");
            System.out.print("Masukkan nama peminjam : ");
            scanner.nextLine();
            String namaPeminjam = scanner.nextLine();
            System.out.print("Masukkan nomor KTP peminjam : ");
            String nomorKtpPeminjam = scanner.next();
            System.out.println();
            System.out.println("====================================");
            Karung karung = new Karung();
            karung.setUkuranKarung();
            System.out.print("Berapa Lama Pinjam ( Bulan ) : ");
            int bulan = scanner.nextInt();
            karung.hitungBungaDanKewajiban(bulan);

            System.out.println();
            System.out.println("Ukuran Paket  : " + karung.getUkuranBaju());
            System.out.printf("Harga Paket   : Rp%,d%n", karung.getHargaBaju());
            System.out.printf("Bunga         : Rp%,.2f%n", karung.getBunga());
            System.out.println("----------------------< * >----------------------  ");
            System.out.println("Nama Peminjam        : " + namaPeminjam);
            System.out.println("Nomor KTP Peminjam   : " + nomorKtpPeminjam);
            System.out.println();
            System.out.printf("Kewajiban Bulanan    : Rp%,.2f%n", karung.getKewajibanBulanan());
            System.out.println();
            System.out.printf("Total Wajib Bayar    : Rp%,.2f%n", karung.getTotalWajibBayar());
            System.out.println();
            System.out.println("Terima kasih Sudah Meminjam di THE SOLUTION OF MONEY");
            System.out.println("pusing dengan keuangan... kami solusinya (*_*)");
        } else if (pilihan == 2) {
            System.out.println("Silahkan Masukan Data Anda");
            System.out.println("----------------------< * >----------------------  ");
            System.out.print("Masukkan nama peminjam : ");
            scanner.nextLine();
            String namaPeminjam = scanner.nextLine();
            System.out.print("Masukkan nomor KTP peminjam : ");
            String nomorKtpPeminjam = scanner.next();
            System.out.println();
            System.out.println("====================================");
            PaperBag pprbag = new PaperBag();
            pprbag.setUkuranPaper_bag();
            System.out.print("Masukkan jumlah bulan peminjaman : ");
            int bulan = scanner.nextInt();
            pprbag.hitungBungaDanKewajiban(bulan);

            System.out.println("Ukuran Paket : " + pprbag.getUkuranPaper_bag());
            System.out.printf("Harga Paket: Rp%,d%n", pprbag.getHargaPaper_bag());
            System.out.printf("Bunga: Rp%,.2f%n", pprbag.getBunga());
            System.out.println("-----------------------------------------------  ");
            System.out.println("Nama Peminjam : " + namaPeminjam);
            System.out.println("Nomor KTP Peminjam : " + nomorKtpPeminjam);
            System.out.println();
            System.out.printf("Kewajiban Bulanan: Rp%,.2f%n", pprbag.getKewajibanBulanan());
            System.out.println();
            System.out.printf("Total Wajib Bayar: Rp%,.2f%n", pprbag.getTotalWajibBayar());
            System.out.println();
            System.out.println("Terima kasih Sudah Meminjam di THE SOLUTION OF MONEY");
            System.out.println("pusing dengan keuangan... kami solusinya (*_*)");
        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }
}