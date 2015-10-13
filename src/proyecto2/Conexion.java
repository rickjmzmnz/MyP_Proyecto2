/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.sql.*;

/**
 *
 * @author ricardo
 */
public class Conexion {

    public static Connection conexion;

    /**
     * Método para abrir una conexión a la base de datos
     * @return la conexion abierta
     */
    public synchronized static Connection abrir() {
        try {
            if (conexion == null || conexion.isClosed()) {
                Class.forName("org.sqlite.JDBC");
                conexion = DriverManager.getConnection("jdbc:sqlite:./lib/rickys_toys.db");
            }
        } catch (Exception e) {
            //mandar errores
        }
        return conexion;
    }

    /**
     * Método para cerrar la conexion a la base de datos
     */
    public synchronized static void cerrar() {
        try {
            if(conexion == null || conexion.isClosed()) {
                return;
            } else {
                conexion.close();
            }
        } catch (Exception e) {
            //agregar
        }
    }
    
}
