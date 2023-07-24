package tokoonline;
import java.util.Scanner;
public class TokoOnline {
static Scanner masukkan = new Scanner (System.in); 

     public static void main(String[] args){
     barang barang = new barang();
     karyawan karyawan = new karyawan();
     laporan laporan = new laporan();
     member member = new member();
     transaksi transaksi = new transaksi();
     
     laporan.laporan(barang);
     laporan.laporan(member);
     laporan.laporan(transaksi, barang);
     System.out.println("");
     transaksi.prosesTransaksi(member, transaksi, barang);
 
     }
    }
    

