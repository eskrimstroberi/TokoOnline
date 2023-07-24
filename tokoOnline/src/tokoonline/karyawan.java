package tokoonline;
import java.util.ArrayList;
public class karyawan implements user{

    private ArrayList <String> namakaryawan = new ArrayList <String>();
    private ArrayList <String> alamat = new ArrayList <String>();
    private ArrayList <String> telepon = new ArrayList <String>();
    private ArrayList <Integer> jabatan = new ArrayList <Integer>(); 
    
    public karyawan (){
     this.namakaryawan.add("admin");//add: untuk menambah
     this.alamat.add("malang");
     this.telepon.add("0812345777");//min ngak ero nomor e
     this.jabatan.add(0);
    }
    public void setJabatan (int jabatan){
        this.jabatan.add(jabatan);// kolom matrix. jaid ini yang pertama. 0
    }
    public int getJabatan (int id){
        return this.jabatan.get(id);// get disini: mendapatkan id mambernya
    }
    public int getJmlKaryawan (){
        return this.namakaryawan.size();
    }

    @Override
    public void setNama(String namakaryawan) {
       this.namakaryawan.add(namakaryawan);
    }

    @Override
    public void setAlamat(String Alamat) {
       this.alamat.add(Alamat);
    }

    @Override
    public void setTelepon(String Telepon) {
       this.telepon.add(Telepon);
    }

    @Override
    public String getNama(int idkaryawan) {
        return this.namakaryawan.get(idkaryawan);
    }

    @Override
    public String getAlamat(int idkaryawan) {
    return this.alamat.get(idkaryawan);
    }

    @Override
    public String getTelepon(int idkaryawan) {
      return this.telepon.get(idkaryawan); 
    }
    
}
