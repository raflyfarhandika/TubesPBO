/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author afan
 */
public class MRegistrasi {
    private int id;
    private String nama, email, nohp, pass;
    
    MRegistrasi (int id, String nama, String email, String nohp, String pass){
        this.id = id;
        this.nama = nama;
        this.email = email;
        this.nohp = nohp;
        this.pass = pass;
    }
    
    public int getID(){
        return id;
    }
    
    public void setID(int id){
        this.id = id;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getNohp(){
        return nohp;
    }
    
    public void setNohp(String nohp){
        this.nohp = nohp;
    }
    
    public String getPass(){
        return pass;
    }
    
    public void setPass(String pass){
        this.pass = pass;
    }
}
