import java.util.Scanner;

public class main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // String nama,alamat,telp,email;
        int obat, vitamin, Bdokter, biaya;
        Pendaftaran nama = new Pendaftaran();
        Transaksi order = new Transaksi();
        System.out.println();
        System.out.println(" ================================================= ");
        System.out.println(" ------ SELAMAT DATANG DI RUMAH SAKIT WARAS ------ ");
        System.out.println(" ================================================= ");
        System.out.println();
        System.out.println("  ----------------------o0o----------------------  ");
        System.out.println("*Masukan Data Pasien*");

        System.out.print("Masukan Nama      : ");
        // nama = sc.nextLine();
        nama.setNama(sc.nextLine());

        System.out.print("Masukan Alamat    : ");
        // alamat = sc.nextLine();
        nama.setAlamat(sc.nextLine());

        System.out.print("Masukan No. Telp  : ");
        // telp = sc.nextLine();
        nama.setTelpon(sc.nextLine());

        System.out.println();
        order.viewPoli();
        System.out.println();
        System.out.print("Pilih Poli        : ");
        order.setPoli(sc.nextInt());
        sc.nextLine();
        System.out.println();

        order.viewDocter();
        System.out.println();
        System.out.print("Pilih Dokter        : ");
        order.setDokter(sc.nextInt());
        sc.nextLine();

        System.out.println();
        System.out.print("Berikan Keterangan Dokter        : ");
        order.setKeterangan(sc.nextLine());
        System.out.println();

        System.out.print("Masukan Biaya Pendaftaran             : Rp. ");
        biaya = sc.nextInt();

        System.out.print("Masukan Biaya Obat                    : Rp. ");
        obat = sc.nextInt();
        sc.nextLine();

        System.out.print("Masukan Biaya Vitamin                 : Rp. ");
        vitamin = sc.nextInt();
        sc.nextLine();

        System.out.print("Masukan Biaya Dokter                  : Rp. ");
        Bdokter = sc.nextInt();

        System.out.println("------------------------o0o-----------------------  ");
        System.out.println("================================================== ");
        System.out.println("Jasa Yang di Pesan          : " + order.getPoli());
        System.out.println("Nama Penyedia Jasa          : " + order.getDocter());
        System.out.println("Keterangan                  : " + order.getKet());
        System.out.println();
        System.out.println(
                "Total Biaya yang di Bayar Pemesan : Rp."
                        + (biaya + obat + vitamin + Bdokter));
        System.out.println();
        System.out.println("Salam Sehat " + nama.getNama() + " Dari Rumah Sakit Waras");
        System.out.println();

    }
}