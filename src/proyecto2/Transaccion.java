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
public class Transaccion {
    
    private int idPedidoTransaccion;
    private int idSucursalTransaccion;
    private int codigoTransaccion;
    
    public Transaccion(int idPedidoTransaccion,int idSucursalTransaccion,int codigoTransaccion){
        
        this.idPedidoTransaccion = idPedidoTransaccion;
        this.idSucursalTransaccion = idSucursalTransaccion;
        this.codigoTransaccion = codigoTransaccion;
        
    }
    
    /**
     * Método para seleccionar los datos de la tabla transaccion
     * 
     * @return todos los datos de la tabla
     * @throws SQLException 
     */
    public static synchronized ResultSet selecciona() throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("SELECT * FROM transaccion");
        return declaracion.executeQuery(cadena);
        
    }
    
    public synchronized void agregar() throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("INSERT INTO transaccion (id_pedido_transaccion,id_sucursal_transaccion,codigo_transaccion) "
                + "VALUES (" + this.idPedidoTransaccion + "," + this.idSucursalTransaccion + "," + this.codigoTransaccion + ");");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
    
    /**
     * Método para eliminar datos de la tabla transaccion
     * @throws SQLException 
     */
    public synchronized void eliminar() throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("DELETE FROM marca WHERE id_pedido_transaccion = " + this.idPedidoTransaccion + " AND id_sucursal_transaccion = " + this.idSucursalTransaccion + " AND codigo_transaccion = " + this.codigoTransaccion + ");");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
    
}
