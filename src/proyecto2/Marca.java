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
    
    /**
     * Constructor de la clase Marca
     * @param idMarca
     * @param nombreMarca 
     */
    public Marca(int idMarca,String nombreMarca) {
        this.idMarca = idMarca;
        this.nombreMarca = nombreMarca;
    }
    
    /**
     * Método para seleccionar los datos de la tabla marca
     * @return todos los datos de la tabla
     * @throws SQLException 
     */
    public static synchronized ResultSet selecciona() throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("SELECT * FROM marca");
        return declaracion.executeQuery(cadena);
        
    }
    
    /**
     * Método para agregar datos a la tabla marca
     * @throws SQLException 
     */
    public synchronized void agregar() throws SQLException {
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("INSERT INTO marca (id_marca,nombre_marca) "
                + "VALUES (" + this.idMarca + ",'" + this.nombreMarca + "');");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
    }
    
    /**
     * Método para actualizar el nombre de una marca
     * @param nuevoNombre - nuevo nombre la marca
     * @throws SQLException 
     */
    public synchronized void actualizarNombre(String nuevoNombre) throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("UPDATE marca SET nombre_marca = '" + nuevoNombre + "' WHERE id_marca = " + this.idMarca + ");" );
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
    
    /**
     * Método para eliminar datos de la tabla marca
     * @throws SQLException 
     */
    public synchronized void eliminar() throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("DELETE FROM marca WHERE id_marca = " + this.idMarca + ";");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
            
}
