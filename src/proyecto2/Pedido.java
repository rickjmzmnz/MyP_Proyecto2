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
    private double total;
    private int mes;
    private int dia;
    private int año;
    
    /**
     * Constructor de la clase Pedido
     * @param idPedido
     * @param numeroArticulos
     * @param total
     * @param mes
     * @param dia
     * @param año 
     */
    public Pedido(int idPedido,int numeroArticulos,double total,int mes,int dia,int año) {
        
        this.idPedido = idPedido;
        this.numeroArticulos = numeroArticulos;
        this.total = total;
        this.mes = mes;
        this.dia = dia;
        this.año = año;
        
    }
    
    /**
     * Método para seleccionar los datos de la tabla pedido
     * @return todos los datos de la tabla
     * @throws SQLException 
     */
    public static synchronized ResultSet selecciona() throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("SELECT * FROM pedido");
        return declaracion.executeQuery(cadena);
        
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
                + "VALUES (" + this.idPedido + "," + this.numeroArticulos + "," + this.total + ",'" + this.mes + "/" + this.dia + "/" + this.año + "');");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
    
    /**
     * Método para actualizar el numero de artículos
     * @param nuevosArticulos - el nuevo numero de artículos
     * @throws SQLException 
     */
    public synchronized void actualizarArticulos(int nuevosArticulos) throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("UPDATE pedido SET numero_articulos = " + nuevosArticulos + " WHERE id_pedido = " + this.idPedido + ");");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
    
    /**
     * Método para actualizar el total a pagar de un pedido
     * @param nuevoTotal - nuevo total a pagar del pedido
     * @throws SQLException 
     */
    public synchronized void actualizarTotal(double nuevoTotal) throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("UPDATE pedido SET total = " + nuevoTotal + " WHERE id_pedido = " + this.idPedido + ");");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
               
    }
    
    /**
     * Método para actualizar la fecha de un pedido
     * @param nuevoMes - nuevo mes del pedido
     * @param nuevoDia - nuevo día del pedido
     * @param nuevoAño - nuevo año del pedido
     * @throws SQLException 
     */
    public synchronized void actualizarFechaPedido(int nuevoMes,int nuevoDia,int nuevoAño) throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("UPDATE pedido SET fecha_pedido = '" + nuevoMes + "/" + nuevoDia + "/" + nuevoAño + "' WHERE id_pedido = " + this.idPedido + ");");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
    
    /**
     * Método para eliminar datos de la tabla pedido
     * @throws SQLException 
     */
    public synchronized void eliminar() throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("DELETE FROM marca WHERE id_pedido = " + this.idPedido + ");");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
    
}
