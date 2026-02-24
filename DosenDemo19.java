import java.util.Scanner;

public class DosenDemo19 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         Dosen19[] arrayDosen = new Dosen19[3];

        for (int i = 0; i < arrayDosen.length; i++) {
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
            arrayDosen[i] = new Dosen19(kode, nama, jenisKelamin, usia);
        }
        int no = 1;
        for (Dosen19 d : arrayDosen) {
            d.tampilInformasi(no++);
        }
        sc.close();
    }
}
