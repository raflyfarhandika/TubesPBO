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
public class MLogin {
    private String id;
    private String pass;
    
    public MLogin(String _id, String _pass){
        id = _id;
        pass = _pass;
    }
    
    public void setId(String _id){
        id = _id;
    }
    
    public void setPass(String _pass){
        pass = _pass;
    }
    
    public String getId(){
        return this.id;
    }
    
    public String getPass(){
        return this.pass;
    }
}
