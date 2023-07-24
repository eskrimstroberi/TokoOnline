package tokoonline;
import java.util.ArrayList;
public class member implements user {

    private ArrayList <String> namaMember = new ArrayList <String>();
    private ArrayList <String> alamat = new ArrayList <String>();
    private ArrayList <String> telepon = new ArrayList <String>();
    private ArrayList <Integer> saldo = new ArrayList <Integer>();
    
    public member(){
        this.namaMember.add("Tuti");//add: untuk menambah
        this.alamat.add("klaten");
        this.telepon.add("081217526799");//nomor te;lp member
        this.saldo.add(200000);//ngak pakek petik karena int
    }
    public void setSaldo (int saldo){
        this.saldo.add(saldo);// kolom matrix. jaid ini yang pertama. 0
    }
    public int getSaldo (int idMember){
        return this.saldo.get(idMember);// get disini: mendapatkan id mambernya
    }                                   // set untuk masukkan. arraylist
    public void editSaldo (int idMember, int Saldo){
        this.saldo.set(Saldo, idMember);
    }
    public int getJmlMember (){
        return this.saldo.size();//size: untuk menghitung banyaknya arraylist
    }                            // gungsinya seperti lang. ngak usah input lagi, sudah di updatekan
    
    @Override
    public void setNama (String namaMember){
        this.namaMember.add(namaMember);
    }
    @Override
    public void setAlamat (String Alamat){
        this.alamat.add(Alamat);
    }
    @Override
    public void setTelepon (String Telepon){
        this.telepon.add(Telepon);
    }
    @Override
    public String getNama (int idMember){
        return this.namaMember.get(idMember);
    }
    @Override
    public String getAlamat (int idMember){
        return this.alamat.get(idMember);
    }
    @Override
    public String getTelepon (int idMember){
        return this.telepon.get(idMember);
    }
    
    }
      
