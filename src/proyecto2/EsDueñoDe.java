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
public class EsDueñoDe {
    
    private int codigoEsDueñoDe;
    private int idMarcaEsDueñoDe;
    
    public EsDueñoDe(int codigoEsDueñoDe,int idMarcaEsDueñoDe) {
        
        this.codigoEsDueñoDe = codigoEsDueñoDe;
        this.idMarcaEsDueñoDe = idMarcaEsDueñoDe;
        
    }
    
    public synchronized void agregar() throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("INSERT INTO es_dueño_de (codigo_es_dueño_de,id_marca_es_dueño_de) "
                + "VALUES (" + this.codigoEsDueñoDe + "," + this.idMarcaEsDueñoDe + ");");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
    
    public synchronized void eliminar() throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("DELETE FROM marca WHERE codigo_es_dueño_de = " + this.codigoEsDueñoDe + ");");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
    
}
