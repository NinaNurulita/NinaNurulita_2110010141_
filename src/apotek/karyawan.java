/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apotek;

/**
 *
 * @author Acer
 */
public class karyawan {
    
    private String nama;
    private String alamat;
    private String kota;       
    private String status;
    private String telpon;
    
    public karyawan(String nama, String alamat, String kota, String status, String telpon){
        setNamaKaryawan(nama);
        setAlamatKaryawan(alamat);
        setKotaKaryawan(kota);
        setStatusKaryawan(status);
        setTelponKaryawan(telpon);
    }
    
    //method set
    public void setNamaKaryawan(String nama){
        this.nama = nama;
    }
    public void setAlamatKaryawan(String alamat){
        this.alamat = alamat;
    }
    public void setKotaKaryawan(String kota){
        this.kota = kota;
    }
    public void setStatusKaryawan(String status){
        this.status = status;
    }
    public void setTelponKaryawan(String telpon){
        this.telpon = telpon;
    }
    
    //method get
    public String getNamaKaryawan(){
        return nama;
    }
    public String getAlamatKaryawan(){
        return alamat;
    }
    public String getKotaKaryawan(){
        return kota;
    }
    public String getStatusKaryawan(){
        return status;
    }
    public String getTelponKaryawan(){
        return telpon;
    }
}
