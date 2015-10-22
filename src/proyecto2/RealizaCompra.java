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
public class RealizaCompra {
    
    private int idPedidoRealizaCompra;
    private int idClienteRealizaCompra;
    
    public RealizaCompra(int idPedidoRealizaCompra,int idClienteRealizaCompra){
        
        this.idPedidoRealizaCompra = idPedidoRealizaCompra;
        this.idClienteRealizaCompra = idClienteRealizaCompra;
        
    }
    
    /**
     * Método para seleccionar los datos de la tabla realiza_compra
     * @return todos los datos de la tabla
     * @throws SQLException 
     */
    public static synchronized ResultSet selecciona() throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("SELECT * FROM realiza_compra");
        return declaracion.executeQuery(cadena);
        
    }
    
    public synchronized void agregar() throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("INSERT INTO realiza_compra (id_pedido_realiza_compra,id_cliente_realiza_compra) "
                + "VALUES (" + this.idPedidoRealizaCompra + "," + this.idClienteRealizaCompra + ");");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
        
    /**
     * Método para eliminar datos de la tabla realiza_compra
     * @throws SQLException 
     */
    public synchronized void eliminar() throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("DELETE FROM marca WHERE id_pedido_realiza_compra = " + this.idPedidoRealizaCompra + ");");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }    
    
}
