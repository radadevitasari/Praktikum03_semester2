import java.util.Scanner;

public class DataDosen19 {

    static class Dosen19 {
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
        void tampilInformasi() {
            System.out.println("Kode : " + kode);
            System.out.println("Nama : " + nama);
            System.out.println("Jenis Kelamin : " + (jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia : " + usia);
            System.out.println();
        }
    }
    static void dataSemuaDosen(Dosen19[] arrayOfDosen) {
        System.out.println("=== Semua Data Dosen ===");
        for (Dosen19 d : arrayOfDosen) {
            d.tampilInformasi();
        }
    }
    static void jumlahDosenPerJenisKelamin(Dosen19[] arrayOfDosen) {
        int pria = 0, wanita = 0;

        for (Dosen19 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
        System.out.println();
    }
    static void rerataUsiaDosenPerJenisKelamin(Dosen19[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0;
        int jmlPria = 0, jmlWanita = 0;

        for (Dosen19 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                totalPria += d.usia;
                jmlPria++;
            } else {
                totalWanita += d.usia;
                jmlWanita++;
            }
        }
        if (jmlPria > 0)
            System.out.println("Rata-rata Usia Dosen Pria   : " + (totalPria / jmlPria));

        if (jmlWanita > 0)
            System.out.println("Rata-rata Usia Dosen Wanita : " + (totalWanita / jmlWanita));

        System.out.println();
    }
    static void infoDosenPalingTua(Dosen19[] arrayOfDosen) {
        Dosen19 tertua = arrayOfDosen[0];

        for (Dosen19 d : arrayOfDosen) {
            if (d.usia > tertua.usia) {
                tertua = d;
            }
        }
        System.out.println("=== Dosen Paling Tua ===");
        tertua.tampilInformasi();
    }
    static void infoDosenPalingMuda(Dosen19[] arrayOfDosen) {
        Dosen19 termuda = arrayOfDosen[0];

        for (Dosen19 d : arrayOfDosen) {
            if (d.usia < termuda.usia) {
                termuda = d;
            }
        }
        System.out.println("=== Dosen Paling Muda ===");
        termuda.tampilInformasi();
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Dosen19[] arrayOfDosen = new Dosen19[3];

        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode : ");
            String kode = sc.nextLine();
            System.out.print("Nama : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (Pria/Wanita) : ");
            String jk = sc.nextLine();
            Boolean jenisKelamin = jk.equalsIgnoreCase("Pria");
            System.out.print("Usia : ");
            int usia = sc.nextInt();
            sc.nextLine();
            System.out.println();
            arrayOfDosen[i] = new Dosen19(kode, nama, jenisKelamin, usia);
        }
        dataSemuaDosen(arrayOfDosen);
        jumlahDosenPerJenisKelamin(arrayOfDosen);
        rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        infoDosenPalingTua(arrayOfDosen);
        infoDosenPalingMuda(arrayOfDosen);
        
        sc.close();
    }
}
