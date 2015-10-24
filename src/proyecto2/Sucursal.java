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
public class Sucursal {
    
    private int idSucursal;
    private String nombreSucursal;
    private double telefonoSucursal;
    private double balance;
    
    /**
     * Constructor de la clase Sucursal
     * @param idSucursal
     * @param nombreSucursal
     * @param telefonoSucursal
     * @param balance 
     */
    public Sucursal(int idSucursal,String nombreSucursal,double telefonoSucursal,double balance) {
        
        this.idSucursal = idSucursal;
        this.nombreSucursal = nombreSucursal;
        this.telefonoSucursal = telefonoSucursal;
        this.balance = balance;
        
    }
    
    /**
     * Método para seleccionar los datos de la tabla sucursal
     * @return todos los datos de la tabla
     * @throws SQLException 
     */
    public static synchronized ResultSet selecciona() throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("SELECT * FROM sucursal");
        return declaracion.executeQuery(cadena);
        
    }
    
    /**
     * Método para agregar datos a la tabla sucursal
     * @throws SQLException 
     */
    public synchronized void agregar() throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("INSERT INTO sucursal (id_sucursal,nombre_sucursal,telefono_sucursal,balance) "
                + "VALUES (" + this.idSucursal + ",'" + this.nombreSucursal + "'," + this.telefonoSucursal + "," + this.balance + ");");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
    
    /**
     * Método para actualizar el nombre de una sucursal
     * @param nuevoNombre - el nuevo nombre de la sucursal
     * @throws SQLException 
     */
    public synchronized void actualizarNombre(String nuevoNombre) throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("UPDATE sucursal SET nombre_sucursal = '" + nuevoNombre + "' WHERE id_sucursal = " + this.idSucursal + ");");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
    
    /**
     * Método para actualizar el telefono de una sucursal
     * @param nuevoTelefono - el nuevo telefono de la sucursal
     * @throws SQLException 
     */
    public synchronized void actualizarTelefono(int nuevoTelefono) throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("UPDATE sucursal SET telefono_sucursal = " + nuevoTelefono + " WHERE id_sucursal = " + this.idSucursal + ");");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
    
    /**
     * Método para actualizar el balance de una sucursal
     * @param nuevoBalance - el nuevo balance de la sucursal
     * @throws SQLException 
     */
    public synchronized void actualizarBalance(double nuevoBalance) throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("UPDATE sucursal SET balance = " + nuevoBalance + " WHERE id_sucursal = " + this.idSucursal + ");");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
        
    /**
     * Método para eliminar datos de la tabla sucursal
     * @throws SQLException 
     */
    public synchronized void eliminar() throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("DELETE FROM sucursal WHERE id_sucursal = " + this.idSucursal + ";");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
    
}
