/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo7_;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Rafly Farhandika
 */
public class DB_Connection {
    static final String DB_url = "jdbc:mysql://localhost/tubespbo";
    static final String DB_User = "root";
    static final String DB_Pass = "";
    static Connection conn;
    //PreparedStatement ps;
    
    public static void Connection(){
        try {
            conn = DriverManager.getConnection(DB_url, DB_User, DB_Pass);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    } 
}
