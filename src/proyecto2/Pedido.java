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
public class Pedido {
    
    private int idPedido;
    private int numeroArticulos;
    private float total;
    private int mes;
    private int dia;
    private int anyo;
    
    /**
     * Constructor de la clase Pedido
     * @param idPedido
     * @param numeroArticulos
     * @param total
     * @param mes
     * @param dia
     * @param anyo 
     */
    public Pedido(int idPedido,int numeroArticulos,float total,int mes,int dia,int anyo) {
        
        idPedido = this.idPedido;
        numeroArticulos = this.numeroArticulos;
        total = this.total;
        mes = this.mes;
        dia = this.dia;
        anyo = this.anyo;
        
    }
    
    /**
     * Método para agregar datos a la tabla pedido
     * @throws SQLException 
     */
    public synchronized void agregar() throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("INSERT INTO pedido (id_pedido,numero_articulos,total,fecha_pedido) "
                + "VALUES (" + this.idPedido + "," + this.numeroArticulos + "," + this.total + "," + this.mes + "," + this.dia + "," + this.anyo + ");");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
    
}
