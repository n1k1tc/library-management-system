/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nikit
 */
import java.sql.*;
public class Connect {
    public static Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/library", 
                "root", 
                "L0v3kp0p123!#"
            );
        } catch (SQLException ex) {
            System.getLogger(Connect.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        
        return con;
    }
}
