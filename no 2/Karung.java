import java.util.Scanner;

public class Karung {
    private String ukuranKarung;
    private long hargaKarung;
    private double bunga;
    private double kewajibanBulanan;
    private double totalWajibBayar;

    public void setUkuranKarung() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pilih ukuran Karung:");
        System.out.println("====================================");
        System.out.println("1. XL");
        System.out.println("2. L");
        System.out.println("3. M ");
        System.out.println();
        System.out.print("MASUKKAN PILIHAN : ");
        int pilihan = scanner.nextInt();

        if (pilihan == 1) {
            ukuranKarung = "XL";
            hargaKarung = 100000000;
        } else if (pilihan == 2) {
            ukuranKarung = "L";
            hargaKarung = 75000000;
        } else {
            ukuranKarung = "M";
            hargaKarung = 50000000;
        }
    }

    public void hitungBungaDanKewajiban(int bulan) {
        bunga = hargaKarung * 0.025;
        kewajibanBulanan = (bunga * bulan + hargaKarung) / bulan;
        totalWajibBayar = hargaKarung + (bunga * bulan);
    }

    public String getUkuranBaju() {
        return ukuranKarung;
    }

    public long getHargaBaju() {
        return hargaKarung;
    }

    public double getBunga() {
        return bunga;
    }

    public double getKewajibanBulanan() {
        return kewajibanBulanan;
    }

    public double getTotalWajibBayar() {
        return totalWajibBayar;
    }
}