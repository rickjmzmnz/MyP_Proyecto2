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
    private float precio;
    private int clasificacion;
    
    /**
     * Constructor de la clase Juguete
     * @param codigoDeBarras
     * @param nombreJuguete
     * @param precio
     * @param clasificacion 
     */
    public Juguete(int codigoDeBarras,String nombreJuguete,float precio,int clasificacion) {
        
        codigoDeBarras = this.codigoDeBarras;
        nombreJuguete = this.nombreJuguete;
        precio = this.precio;
        clasificacion = this.clasificacion;
        
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
                 + "VALUES (" + this.codigoDeBarras + "," + this.nombreJuguete + "," + this.precio + "," + this.clasificacion + ");");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
    
}
