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
public class DistribuyeA {
    
    private int idMarcaDistribuyeA;
    private int idDistribuidorDistribuyeA; 
    

    public DistribuyeA(int idMarcaDistribuyeA,int idDistribuidorDistribuyeA) {

        idMarcaDistribuyeA = this.idMarcaDistribuyeA;
        idDistribuidorDistribuyeA = this.idDistribuidorDistribuyeA;
        
    }
 
    public synchronized void agregar() throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("INSERT INTO distribuye_a (id_marca_distribuye_a,id_distribuidor_distribuye_a) "
                + "VALUES (" + this.idMarcaDistribuyeA + "," + this.idDistribuidorDistribuyeA + ");");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
    
    public synchronized void eliminar() throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("DELETE FROM marca WHERE id_marca_distribuye_a = " + this.idMarcaDistribuyeA + ");");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
    
}