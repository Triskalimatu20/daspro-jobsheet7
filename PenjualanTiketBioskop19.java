import java.util.Scanner;

public class PenjualanTiketBioskop19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int HARGA_TIKET = 50000; 
        int jumlahTiket; 
        double totalHarga; 
        double diskon = 0;
        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            jumlahTiket = sc.nextInt();
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Silakan masukkan jumlah yang valid.");
                continue; 
            }
            
            if (jumlahTiket > 10) {
                diskon = 0.15; 
            } else if (jumlahTiket > 4) {
                diskon = 0.10; 
            }
        
            totalHarga = jumlahTiket * HARGA_TIKET * (1 - diskon);
            break; 
        }
        
        System.out.println("Total tiket yang terjual: " + jumlahTiket);
        System.out.printf("Total harga penjualan tiket: Rp %.2f%n", totalHarga);
        
    }
}