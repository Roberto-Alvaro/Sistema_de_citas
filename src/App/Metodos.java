/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;


import java.sql.*;

/**
 *
 * @author espar
 */
public class Metodos {

    public static Connection getConexion() {
        //String connectionUrl = "jdbc:sqlserver://localhost:1433;" + "database=Salon";
         String connectionUrl = "jdbc:sqlserver://DESKTOP-E7P4920:1433;" + "database=Salon";
        Connection conector = null;
        Statement stm = null;
        ResultSet resultado = null;
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conector = DriverManager.getConnection(connectionUrl, "sa", "1234");
            System.out.println("Conexion exitosa");
            return conector;
        }catch(Exception e){
            System.out.println("Conexion no exitosa");
            return conector;
        }
    }

    /*public  static Connection getConexion() {
        String connectionUrl = "jdbc:sqlserver:DESKTOP-E7P4920:1433;"
                + "database=Salon;"
                + "user=sar;"
                + "password=1234;";
        try {
           Connection con = DriverManager.getConnection(connectionUrl);
           return con;
        } // Handle any errors that may have occurred.
        catch (SQLException ex) {
            System.out.println(ex.toString());
            return null;
        }
    }*/
}
