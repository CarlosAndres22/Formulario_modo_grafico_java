/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modo_grafico_formulario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class conectar {
    Connection con=null;
     
    public Connection conexion() throws SQLException{
   
    
        try {
        /*Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost/db_ejemplo","root","");
        System.out.println("conexion establecida.");
        JOptionPane.showMessageDialog( null, "Conexion establecida");*/
        String uname="root";
        String url="jdbc:mysql://localhost/db_ejemplo";

        String password="Diegozambrano1";
        
        
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection(url,uname,password);
        System.out.println("conexion establecida.");
        JOptionPane.showMessageDialog( null, "Conexion establecida");
        
    } catch(ClassNotFoundException | SQLException e){
        System.out.println("error de conexion");
        JOptionPane.showMessageDialog(null, "error de conexion" + e);
        
    }
       /* catch(ClassNotFoundException | SQLException e){
        System.out.println("error de conexion");
        JOptionPane.showMessageDialog(null, "error de conexion" + e);
    }*/
    return con;
    }
}
