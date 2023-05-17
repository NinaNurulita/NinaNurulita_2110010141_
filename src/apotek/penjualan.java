/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apotek;

/**
 *
 * @author Acer
 */
public class penjualan {
    
    private String tanggal;
    private int jumlah;
    private int total;
    private int pajak;
    private int totalBayar;
    
    public penjualan(String tanggal, int jumlah, int total, int pajak, int totalBayar){
        setTanggalPenjualan(tanggal);
        setJumlahPenjualan(jumlah);
        setTotalPenjualan(total);
        setPajakPenjualan(pajak);
        setTotalBayar(totalBayar);
    }
    
    //method set
    public void setTanggalPenjualan(String tanggal){
        this.tanggal = tanggal;
    }
    public void setJumlahPenjualan(int jumlah){
        this.jumlah = jumlah;
    }
    public void setTotalPenjualan(int total){
        this.total = total;
    }
    public void setPajakPenjualan(int pajak){
        this.pajak = pajak;
    }
    public void setTotalBayar(int totalBayar){
        this.totalBayar = totalBayar;
    }
    
    //method get
    public String getTanggalPenjualan(){
        return tanggal;
    }
    public int getJumlahPenjualan(){
        return jumlah;
    }
    public int getTotalPenjualan(){
        return total;
    }
    public int getPajakPenjualan(){
        return pajak;
    }
    public int getTotalBayar(){
        return total+pajak;
    }
    
}
