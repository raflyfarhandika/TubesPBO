/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Rafly Farhandika
 */
public class MPembayaran {
    private String Alamat;
    private String OpsiPembayaran;
    private String OpsiPengantaran;
    private int Total;
    
    public MPembayaran(String _Alamat, String _OpsiPembayaran, String _OpsiPengantaran, int _Total){
        Alamat = _Alamat;
        OpsiPembayaran = _OpsiPembayaran;
        OpsiPengantaran = _OpsiPengantaran;
        Total = _Total;
    }
    
    public void setAlamat(String _Alamat){
        Alamat = _Alamat;
    }
    
    public void setOpsiPembayaran(String _OpsiPembayaran){
        OpsiPembayaran = _OpsiPembayaran;
    }
    
    public void setOpsiPengantaran(String _OpsiPengantaran){
        OpsiPengantaran = _OpsiPengantaran;
    }
    
    public void setTotal(int _Total){
        Total = _Total;
    }
    
    public String getAlamat(){
        return Alamat;
    }
    
    public String getOpsiPembayaran(){
        return OpsiPembayaran;
    }
    
    public String getOpsiPengantaran(){
        return OpsiPengantaran;
    }
    
    public int getTotal(){
        return Total;
    }
}
