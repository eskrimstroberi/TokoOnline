package tokoonline;
public interface user {
  public void setNama (String nama); //modifier: public. merupakan method abstrak
  //nama, alamat, telepon
  public void setAlamat (String Alamat);
  public void setTelepon (String Telepon);
  
  public String getNama (int id);//pakek id dikarenakan:
  public String getAlamat (int id);//pakek array id. 0: isi ke-1
  public String getTelepon (int id);// id 1: getnama, getalamat, gettelepon punya satu orang
  //contoh: riskha: 1. getnama, getalamat, gettelepon punya riskha semua
}


