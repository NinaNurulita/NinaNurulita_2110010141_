/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apotek;

/**
 *
 * @author Acer
 */
public class supplier {
    
    private String nama;
    private String alamat;
    private String kota;
    private String telpon;
    
    public supplier(String nama, String alamat, String kota, String telpon){
        setNamaSupplier(nama);
        setAlamatSupplier(alamat);
        setKotaSupplier(kota);
        setTelpon(telpon);
    }
    
    //method set
    public void setNamaSupplier(String nama){
        this.nama = nama;
    }
    public void setAlamatSupplier(String alamat){
        this.alamat = alamat;
    }
    public void setKotaSupplier(String kota){
        this.kota = kota;
    }
    public void setTelpon(String telpon){
        this.telpon = telpon;
    }
    
    //method get
    public String getNamaSupplier(){
        return nama;
    }
    public String getAlamatSupplier(){
        return alamat;
    }
    public String getKotaSupplier(){
        return kota;
    }
    public String getTelpon(){
        return telpon;
    }
    
}
