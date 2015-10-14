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
    private int telefonoSucursal;
    private double balance;
    
    /**
     * Constructor de la clase Sucursal
     * @param idSucursal
     * @param nombreSucursal
     * @param telefonoSucursal
     * @param balance 
     */
    public Sucursal(int idSucursal,String nombreSucursal,int telefonoSucursal,double balance) {
        
        this.idSucursal = idSucursal;
        this.nombreSucursal = nombreSucursal;
        this.telefonoSucursal = telefonoSucursal;
        this.balance = balance;
        
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
        declaracion.executeLargeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
    
    public synchronized void eliminar() throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("DELETE FROM marca WHERE id_sucursal = " + this.idSucursal + ");");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
    
}
