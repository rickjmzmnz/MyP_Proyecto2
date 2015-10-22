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
public class Distribuidor {
    
    private int idDistribuidor;
    private String nombreDistribuidor;
    private double deuda;
    
    /**
     * Constructor de la clase Distribuidor
     * @param idDistribuidor
     * @param nombreDistribuidor
     * @param deuda 
     */
    public Distribuidor(int idDistribuidor,String nombreDistribuidor,double deuda) {
      
        this.idDistribuidor = idDistribuidor;
        this.nombreDistribuidor = nombreDistribuidor;
        this.deuda = deuda;
        
    }
    
    /**
     * Método para seleccionar los datos de la tabla distribuidor
     * @return todos los datos de la tabla
     * @throws SQLException 
     */
    public static synchronized ResultSet selecciona() throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("SELECT * FROM distribuidor");
        return declaracion.executeQuery(cadena);
        
    }
    
    /**
     * Método para agregar datos a la tabla distribuidor
     * @throws SQLException 
     */
    public synchronized void agregar() throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("INSERT INTO distribuidor (id_distribuidor,nombre_distribuidor,deuda) "
                + "VALUES (" + this.idDistribuidor + ",'" + this.nombreDistribuidor + "'," + this.deuda + ");");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
    }
    
    /**
     * Método para actualizar el nombre de un distribuidor
     * @param nuevoNombre - el nuevo nombre del distribuidor
     * @throws SQLException 
     */
    public synchronized void actualizarNombre(String nuevoNombre) throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("UPDATE distribuidor SET nombre_distribuidor = '" + nuevoNombre + "' WHERE id_distribuidor = " + this.idDistribuidor + ");");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
    
    /**
     * Método para actializar la deuda con un distribuidor
     * @param nuevaDeuda - la nueva deuda con el distribuidor
     * @throws SQLException 
     */
    public synchronized void actualizarDeuda(double nuevaDeuda) throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("UPDATE distribuidor SET deuda = " + nuevaDeuda + " WHERE id_distribuidor = " + this.idDistribuidor + ");");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();    
        
    }
    
    /**
     * Método para eliminar datos de la tabla distribuidor
     * @throws SQLException 
     */
    public synchronized void eliminar() throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("DELETE FROM marca WHERE id_distribuidor = " + this.idDistribuidor + ");");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
    
}
