/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apotek;

/**
 *
 * @author Acer
 */
public class obat {
    
    private String nama;
    private String jenis;
    private int harga;
    private int stock;
    
    public obat(String nama, String jenis, int harga, int stock){
        setNamaObat(nama);
        setJenisObat(jenis);
        setHarga(harga);
        setStock(stock);
    }
    
    //method set
    public void setNamaObat(String nama){
        this.nama = nama;
    }
    public void setJenisObat(String jenis){
        this.jenis = jenis;
    }
    public void setHarga(int harga){
        this.harga = harga;
    }
    public void setStock(int stock){
        this.stock = stock;
    }
    
    //method get
    public String getNamaObat(){
        return nama;
    }
    public String getJenisObat(){
        return jenis;
    }
    public int getHarga(){
        return harga;
    }
    public int getStock(){
        return stock;
    }
}
