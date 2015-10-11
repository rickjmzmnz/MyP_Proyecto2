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
public class Marca {

    private int idMarca;
    private String nombreMarca;
    
    public Marca(int idMarca,String nombreMarca) {
        idMarca = this.idMarca;
        nombreMarca = this.nombreMarca;
    }
    
    public synchronized void agregar() throws SQLException {
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("INSERT INTO marca (id_marca,nombre_marca) "
                + "VALUES (" + this.idMarca + "," + this.nombreMarca + ");");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
    }
            
}
