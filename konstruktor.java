
package fitro;

public class konstruktor {
    String nama, nik, jabatan;
    int gaji, lembur, tunjangan, totalGaji;
    
    public konstruktor(){
        System.out.println("==== Data Gaji Karyawan ====");
    }
    
    public konstruktor(String nama, String nik, String jabatan,
        int gaji, int lembur, int tunjangan, int totalGaji){
        this.nama = nama;
        this.nik = nik;
        this.jabatan = jabatan;
        this.gaji = gaji;
        this.lembur = lembur;
        this.tunjangan = tunjangan;
        this.totalGaji = totalGaji;
    }
    
    void cetak(){
        System.out.println("Nama : " + this.nama);
        System.out.println("Nik  : " + this.nik);
        System.out.println("Jabatan : "+ this.jabatan);
        System.out.println("Gaji Pokok : " + this.gaji);
        System.out.println("Gaji Lembur : " + this.lembur);
        System.out.println("Tunjangan : " + this.tunjangan);
        System.out.println("Total Gaji : " + this.totalGaji);
    }
    
    
}
