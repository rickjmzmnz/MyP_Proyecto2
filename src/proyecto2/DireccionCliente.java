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
public class DireccionCliente {
    
    private String calleCliente;
    private String estadoCliente;
    private int numeroCliente;
    private String coloniaCliente;
    private String municipioDelegacionCliente;
    private int idDireccionCliente;
    
    /**
     * Constructor de la clase DireccionCliente
     * @param idDireccionCliente
     * @param calleCliente
     * @param estadoCliente
     * @param numeroCliente
     * @param coloniaCliente
     * @param municipioDelegacionCliente 
     */
    public DireccionCliente(String calleCliente,String estadoCliente,int numeroCliente,String coloniaCliente,String municipioDelegacionCliente,int idDireccionCliente) {
    
        this.calleCliente = calleCliente ;
        this.estadoCliente = estadoCliente;
        this.numeroCliente = numeroCliente;
        this.coloniaCliente = coloniaCliente;
        this.municipioDelegacionCliente = municipioDelegacionCliente;
        this.idDireccionCliente = idDireccionCliente;
        
    }
    
    /**
     * Método para seleccionar los datos de la tabla direccion_cliente
     * @return todos los datos de la tabla
     * @throws SQLException 
     */
    public static synchronized ResultSet selecciona() throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("SELECT * FROM direccion_cliente");
        return declaracion.executeQuery(cadena);
        
    }
    
    /**
     * Método para agregar datos a la tabla direccion_cliente
     * @throws SQLException 
     */
    public synchronized void agregar() throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("INSERT INTO direccion_cliente (calle_cliente,estado_cliente,numero_cliente,colonia_cliente,municipio_delegacion_cliente,id_direccion_cliente) "
                + "VALUES ('" + this.calleCliente + "','" + this.estadoCliente + "'," + this.numeroCliente + ",'" + this.coloniaCliente + "','" + this.municipioDelegacionCliente + "'," + this.idDireccionCliente + ");");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
    
    /**
     * Método para actualizar la calle de un cliente
     * @param nuevaCalle - la nueva calle del cliente
     * @throws SQLException 
     */
    public synchronized void actualizarCalle(String nuevaCalle) throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("UPDATE direccion_cliente SET calle_cliente = '" + nuevaCalle + "' WHERE id_direccion_cliente = " + this.idDireccionCliente + ");");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
    
    /**
     * Método para actualizar el estado de un cliente
     * @param nuevoEstado - el nuevo estado del cliente
     * @throws SQLException 
     */
    public synchronized void actualizarEstado(String nuevoEstado) throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("UPDATE direccion_cliente SET estado_cliente = '" + nuevoEstado + "' WHERE id_direccion_cliente = " + this.idDireccionCliente + ");");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
    
    /**
     * Método para actualizar el numero telefónico de un cliente
     * @param nuevoNumero - el nuevo numero telefónico del cliente
     * @throws SQLException 
     */
    public synchronized void actualizarNumero(int nuevoNumero) throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("UPDATE direccion_cliente SET numero_cliente = " + nuevoNumero + " WHERE id_direccion_cliente = " + this.idDireccionCliente + ");");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
    
    /**
     * Método para actualizar la colonia de un cliente
     * @param nuevaColonia - la nueva colonia del cliente
     * @throws SQLException 
     */
    public synchronized void actualizarColonia(String nuevaColonia) throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("UPDATE direccion_cliente SET colonia_cliente = '" + nuevaColonia + "' WHERE id_direccion_cliente = " + this.idDireccionCliente + ");");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
    
    /**
     * Método para actualizar el municipio o delegacion de un cliente
     * @param nuevoMunDel - el nuevo municipio o delegacion del cliente
     * @throws SQLException 
     */
    public synchronized void actualizarMunicipioDelegacion(String nuevoMunDel) throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("UPDATE direccion_cliente SET municipio_delegacion_cliente = '" + nuevoMunDel + "' WHERE id_direccion_cliente = " + this.idDireccionCliente + ");");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
    
    /**
     * Método para eliminar datos de la tabla direccion_cliente
     * @throws SQLException 
     */
    public synchronized void eliminar() throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("DELETE FROM marca WHERE id_direccion_cliente = " + this.idDireccionCliente + ");");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
    
}
