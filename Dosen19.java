public class Dosen19 {

    String kode;
    String nama;
    Boolean jenisKelamin; 
    int usia;

    public Dosen19(String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }
    void tampilInformasi(int no) {
        System.out.println("Kode           : " + kode);
        System.out.println("Nama           : " + nama);
        System.out.println("Jenis Kelamin  : " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia           : " + usia);
        System.out.println("-------------------------------");
    }
}

