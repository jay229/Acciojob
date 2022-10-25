/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectionProvider;
import java.sql.*;
//import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author JAY
 */
public class ConnectionProvider {
    public static Connection getcon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con;
            con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/Studentresult","root","root");
            return con;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }
    }
    public static void main(String args[]){
        ConnectionProvider obj=new ConnectionProvider();
        Connection c= obj.getcon();
    }

   
}
