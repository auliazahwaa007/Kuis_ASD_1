import java.util.Scanner;

public class DosenMain07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        Dosen07[] arrayOfDosen07 = new Dosen07[jumlah];
        String dummy;

        for (int i = 0; i < arrayOfDosen07.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("NIDN                 : " );
            arrayOfDosen07[i].nidn = sc.nextLine();
            System.out.print("Nama                 : " );
            arrayOfDosen07[i].nama = sc.nextLine();
            System.out.print("Tahun Masuk          : " );
            dummy = sc.nextLine();
            arrayOfDosen07[i].tahunMasuk = Integer.parseInt(dummy);
            System.out.print("Jenjang Pendidikan   : " );
            arrayOfDosen07[i].jenjangPendidikan = sc.nextLine();
            System.out.print("Program Studi        : " );
            arrayOfDosen07[i].prodi = sc.nextLine();
            System.out.println("----------------------------------");
        }
        for (int i = 0; i < 7; i++) {
            System.out.println("Data Dosen ke-" + (i + 1));
            arrayOfDosen07[i].tampilkanInfo();
        }
        System.out.println("===== MENU DOSEN =====");
        System.out.println("1. Tampilkan Semua Dosen");
        System.out.println("2. Ubah Prodi Dosen");
        System.out.println("3. Ubah Pendidikan Dosen");
        System.out.print("Pilih menu: ");
        int pilih = sc.nextInt();
        sc.nextLine();

        switch (pilih) {

            case 1:
                for (int i = 0; i < arrayOfDosen07.length; i++) {
                    arrayOfDosen07[i].tampilkanInfo();
                }
                break;
            case 2:
                System.out.print("Pilih index dosen: ");
                int idx = sc.nextInt();
                sc.nextLine();

                System.out.print("Prodi baru: ");
                String prodiBaru = sc.nextLine();

                arrayOfDosen07[jumlah].ubahProdi(prodiBaru);
                arrayOfDosen07[jumlah].tampilkanInfo();
                break;
            case 3:
                System.out.print("Pilih index dosen: ");
                int idx2 = sc.nextInt();
                sc.nextLine();

                System.out.print("Pendidikan baru: ");
                String pendidikanBaru = sc.nextLine();

                arrayOfDosen07[jumlah].ubahPendidikan(pendidikanBaru);
                arrayOfDosen07[jumlah].tampilkanInfo();
                break;

            default:
                System.out.println("Menu tidak tersedia");
        }
    }    
}
