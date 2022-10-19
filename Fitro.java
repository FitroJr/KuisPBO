
package fitro;
import java.util.Scanner;

public class Fitro {
    
    String nama, nik, jabatan;
    int gaji, lembur, tunjangan, totalGaji, hariLembur;
    
    public static void main(String[] args) {
        String nama, nik, jabatan;
        int gaji, lembur, tunjangan, totalGaji, hariLembur;
        Scanner sc = new Scanner(System.in);
        Fitro p = new Fitro();
        System.out.println("=== Input Data Karyawan ===");
        System.out.print("Masukan Nama :");
        nama = sc.next();
        System.out.print("Masukan Nik :");
        nik = sc.next();
        System.out.print("Masukan Jabatan : ");
        jabatan = sc.next();
        System.out.print("Masukan banyak hari lembur : ");
        hariLembur = sc.nextInt();
        
        gaji = p.gajiJabatan(jabatan);
        tunjangan = p.tunjanganJabatan(jabatan);
        lembur = p.uangLembur(hariLembur);
        totalGaji = p.gajiTotal(gaji, lembur);
        
        konstruktor s = new konstruktor(nama, nik, jabatan, gaji, lembur, tunjangan, totalGaji);
        konstruktor x = new konstruktor();
        s.cetak();
        
    }
    
    private int gajiJabatan(String jabatan){
        if(jabatan.equalsIgnoreCase("manajer")){
            gaji = 23000;           
        }else if(jabatan.equalsIgnoreCase("kepstaff")){
            gaji = 15000;;
        }else if(jabatan.equalsIgnoreCase("staff")){
            gaji = 10000;
        }else{
            gaji = 7000;
        }
        return gaji;
    }
    
    private int tunjanganJabatan(String jabatan){
        if(jabatan.equalsIgnoreCase("manajer")){          
            tunjangan = 7000;
        }else if(jabatan.equalsIgnoreCase("kepstaff")){
            tunjangan = 4000;
        }else if(jabatan.equalsIgnoreCase("staff")){
            tunjangan = 2000;
        }else{
            tunjangan = 1000;
        }
        return tunjangan;
    }
    
    private int uangLembur(int hariLembur){
        return lembur = hariLembur * 100;
    }
    
    private int gajiTotal(int gaji, int lembur){
        return totalGaji = gaji + tunjangan + lembur;
    }
}
