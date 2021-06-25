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
public class MHalamanUtama {
    public String nama, kategori;
    private int harga, jumlah;
    
    public MHalamanUtama(String _nama, int _harga, int _jumlah, String _kategori){
        nama = _nama;
        harga = _harga;
        jumlah = _jumlah;
        kategori = _kategori;
    }
    
    public MHalamanUtama(String _nama, int _harga){
        nama = _nama;
        harga = _harga;
    }
    
     public MHalamanUtama(String _nama, int _harga, String _kategori){
        nama = _nama;
        harga = _harga;
        kategori = _kategori;
    }
    
    public void setNama(String _nama){
        nama = _nama;
    }
    
    public void setHarga(int _harga){
        harga = _harga;
    }
    
    public void setKategori(String _kategori){
        kategori = _kategori;
    }
    
    public void setJumlah(int _jumlah){
        jumlah = _jumlah;
    }
    
    public String getNama(){
        return nama;
    }
    
    public int getHarga(){
        return harga;
    }
    
    public String getKategori(){
        return kategori;
    }
    
    public int getJumlah(){
        return jumlah;
    }
    
}
