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
public class Juguete {

    private int codigoDeBarras;
    private String nombreJuguete;
    private double precio;
    private int clasificacion;
    
    /**
     * Constructor de la clase Juguete
     * @param codigoDeBarras
     * @param nombreJuguete
     * @param precio
     * @param clasificacion 
     */
    public Juguete(int codigoDeBarras,String nombreJuguete,double precio,int clasificacion) {
        
        this.codigoDeBarras = codigoDeBarras;
        this.nombreJuguete = nombreJuguete;
        this.precio = precio;
        this.clasificacion = clasificacion;
        
    }
    
    /**
     * Método para agregar datos a la tabla juguete
     * @throws SQLException 
     */
    public synchronized void agregar() throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("INSERT INTO juguete (codigo_de_barras,nombre_juguete,precio,clasificacion) "
                 + "VALUES (" + this.codigoDeBarras + ",'" + this.nombreJuguete + "'," + this.precio + "," + this.clasificacion + ");");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
    
    public synchronized void actualizarNombre(String nuevoNombre) throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("UPDATE juguete SET nombre_juguete = '" + nuevoNombre + "' WHERE codigo_de_barras = " + this.codigoDeBarras + ");");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    } 
    
    public synchronized void actualizarPrecio(double nuevoPrecio) throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("UPDATE juguete SET precio = " + nuevoPrecio + " WHERE codigo_de_barras = " + this.codigoDeBarras + ");");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
    
    public synchronized void actualizarClasificacion(int nuevaClasificacion) throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("UPDATE juguete SET clasificacion = " + nuevaClasificacion + " WHERE codigo_de_barras = " + this.codigoDeBarras + ");");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
    
    public synchronized void eliminar() throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("DELETE FROM marca WHERE codigo_de_barras = " + this.codigoDeBarras + ");");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
    
}
