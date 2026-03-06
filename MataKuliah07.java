public class MataKuliah07 {
    public String kodeMK;
    public String namaMK;
    public int sks;
    Dosen07[] dosenPengampu;
    int jmlDosen;

    public MataKuliah07(String kodeMK, String namaMK, int sks, int jmlDosen) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
        dosenPengampu = new Dosen07[jmlDosen];
        jmlDosen = 0;
    }
    public void tampilkanInfo() {
        System.out.println("Kode MK : " + kodeMK);
        System.out.println("Nama MK : " + namaMK);
        System.out.println("SKS : " + sks);
        System.out.println("Dosen Pengampu : ");

        for (int i = 0; i < jmlDosen; i++) {
            dosenPengampu[i].tampilkanInfo();
        }
    }
    public void ubahNamaMK(String namaMKBaru) {
        namaMK = namaMKBaru;
    }
    public void ubahSKS(int sksBaru) {
        if (sksBaru >= 2) {
            sks = sksBaru;
        } else {
            System.out.println("SKS tidak boleh kurang dari 2");
        }
    }
    public void tambahDosen(Dosen07 dosen) {
        if (jmlDosen < dosenPengampu.length) {
            dosenPengampu[jmlDosen] = dosen;
            jmlDosen++;
        } else {
            System.out.println("Kapasitas dosen penuh");
        }
    }
    
}
