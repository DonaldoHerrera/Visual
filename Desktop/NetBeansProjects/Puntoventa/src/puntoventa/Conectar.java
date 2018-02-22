/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntoventa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conectar {
    private static Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password ="root";
    private static final String url = "jdbc:mysql://localhost:8889/tienda";

    public Conectar() {
        conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
            if(conn != null){
                System.out.println("Conexión establecida...");
            }
            
        } catch(ClassNotFoundException | SQLException e){
            System.out.println("Error al conectar"+ e);
        }
    }
    //Este metodo nos retorna la conexion
    public Connection getConnection(){
        return conn;
    }
    
    //Con este metodo nos desconectamos de la base de datos
    public void desconectar () {
        conn = null;
        if(conn == null){
            System.out.println("Conexión terminada");
        }
    }
    
    
}