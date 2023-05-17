/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apotek;

/**
 *
 * @author Acer
 */
public class pelanggan {
    
    private String nama;
    private String alamat;
    private String jenisKelamin;
    private String pekerjaan;
    
    public pelanggan(String nama, String alamat, String jenisKelamin, String pekerjaan){
        setNama(nama);
        setAlamat(alamat);
        setJenisKelamin(jenisKelamin);
        setPekerjaan(pekerjaan);
    } //Contructor Overload
    
    //method set
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    public void setJenisKelamin(String jenisKelamin){
        this.jenisKelamin = jenisKelamin;
    }
    public void setPekerjaan(String pekerjaan){
        this.pekerjaan = pekerjaan;
    }
    
    //method get
    public String getNama(){
        return nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public String getJenisKelamin(){
        return jenisKelamin;
    }
    public String getPekerjaan(){
        return pekerjaan;
    }
    
    
}
