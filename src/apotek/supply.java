/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apotek;

/**
 *
 * @author Acer
 */
public class supply {
    
    private String tanggal;
    private int jumlahObat;
    private int total;
    private int pajak;
    private int totalBayar;
    
    public supply(String tanggal, int jumlahObat, int total, int pajak, int totalPajak){
        setTanggal(tanggal);
        setJumlahObat(jumlahObat);
        setTotalHarga(total);
        setPajak(pajak);
        setTotalBayar(totalBayar);
    }
    
    //method set
    public void setTanggal(String tanggal){
        this.tanggal = tanggal;
    }
    public void setJumlahObat(int jumlahObat){
        this.jumlahObat = jumlahObat;
    }
    public void setTotalHarga(int total){
        this.total = total;
    }
    public void setPajak(int pajak){
        this.pajak = pajak;
    }
    public void setTotalBayar(int totalBayar){
        this.totalBayar = totalBayar;
    }
    
    //method get
    public String getTanggal(){
        return tanggal;
    }
    public int getJumlahObat(){
        return jumlahObat;
    }
    public int getTotalHarga(){
        return total;
    }
    public int getPajak(){
        return pajak;
    }
    public int getTotalBayar(){
        return total+pajak;
    }
    
            
}
