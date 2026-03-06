import java.util.Scanner;

public class MataKuliahMain07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kode MK: ");
        String kode = sc.nextLine();

        System.out.print("Nama MK: ");
        String nama = sc.nextLine();

        System.out.print("SKS: ");
        int sks = sc.nextInt();

        System.out.print("Jumlah dosen pengampu: ");
        int jumlahDosen = sc.nextInt();
        sc.nextLine();

        MataKuliah07 mk = new MataKuliah07(kode, nama, sks, jumlahDosen);

        for (int i = 0; i < jumlahDosen; i++) {

            System.out.println("Data Dosen Pengampu ke-" + (i + 1));

            System.out.print("NIDN: ");
            String nidn = sc.nextLine();

            System.out.print("Nama: ");
            String namaDosen = sc.nextLine();

            System.out.print("Tahun Masuk: ");
            int tahunMasuk = sc.nextInt();
            sc.nextLine();

            System.out.print("Jenjang Pendidikan: ");
            String pendidikan = sc.nextLine();

            System.out.print("Prodi: ");
            String prodi = sc.nextLine();

            Dosen07 d = new Dosen07(nidn, namaDosen, tahunMasuk, pendidikan, prodi);
            mk.tambahDosen(d);
        }

        System.out.println("===== MENU MATA KULIAH =====");
        System.out.println("1. Tampilkan Info MK");
        System.out.println("2. Ubah Nama MK");
        System.out.println("3. Ubah SKS");
        System.out.print("Pilih menu: ");
        int pilih = sc.nextInt();
        sc.nextLine();

        switch (pilih) {

            case 1:
                mk.tampilkanInfo();
                break;

            case 2:
                System.out.print("Nama MK baru: ");
                String namaBaru = sc.nextLine();
                mk.ubahNamaMK(namaBaru);
                mk.tampilkanInfo();
                break;

            case 3:
                System.out.print("SKS baru: ");
                int sksBaru = sc.nextInt();
                mk.ubahSKS(sksBaru);
                mk.tampilkanInfo();
                break;

            default:
                System.out.println("Menu tidak tersedia");
        }
    }
}
