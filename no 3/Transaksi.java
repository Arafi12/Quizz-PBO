public class Transaksi {
    int Poli;
    int dokter;
    String ket;

    void viewPoli() {
        System.out.println("Nama Poli");
        System.out.println("1. Gigi");
        System.out.println("2. Anak");
        System.out.println("3. Umum");
    }

    public String getPoli() {
        String hasil = null;

        if (this.Poli == 1) {
            hasil = "Gigi";
        } else if (this.Poli == 2) {
            hasil = "Anak";
        } else if (this.Poli == 3) {
            hasil = "Umum";
        }

        return hasil;
    }

    public void setPoli(int Poli) {
        this.Poli = Poli;
    }

    public void setDokter(int dokter) {
        this.dokter = dokter;
    }

    public void setKeterangan(String ket) {
        this.ket = ket;
    }

    public String getKet() {
        return ket;
    }

    void viewDocter() {
        System.out.println("Nama Dokter");
        System.out.println("1. drg. Ahmad Afandi");
        System.out.println("2. dr. Aris Wicaksono, Sp.A.");
        System.out.println("3. dr. Alfia Putri");
    }

    public String getDocter() {
        String hasil = "";

        if (this.dokter == 1) {
            hasil = "drg. Ahmad Afandi";
        } else if (this.dokter == 2) {
            hasil = "dr. Aris Wicaksono, Sp.A.";
        } else if (this.dokter == 3) {
            hasil = "dr. Alfia Putri";
        }

        return hasil;
    }

}
