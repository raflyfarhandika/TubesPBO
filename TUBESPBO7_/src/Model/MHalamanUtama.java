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
    public String search;
    private int harga, jumlah;
    
    public MHalamanUtama(String _search, int _harga, int _jumlah){
        search = _search;
        harga = _harga;
        jumlah = _jumlah;
    }
    
    public MHalamanUtama(String _search){
        search = _search;
    }
    
    public void setSearch(String _search){
        search = _search;
    }
    
    public void setHarga(int _harga){
        harga = _harga;
    }
    
    public void setJumlah(int _jumlah){
        jumlah = _jumlah;
    }
    
    public String getSearch(){
        return search;
    }
    
    public int getHarga(){
        return harga;
    }
    
    public int getJumlah(){
        return jumlah;
    }
    
}
