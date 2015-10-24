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
public class DireccionSucursal {
    
    private int idDireccionSucursal;
    private String calleSucursal;
    private String estadoSucursal;
    private int numeroSucursal;
    private String coloniaSucursal;
    private String municipioDelegacionSucursal;
    
    /**
     * Constructor de la clase DireccionSucursal
     * @param idDireccionSucursal
     * @param calleSucursal
     * @param estadoSucursal
     * @param numeroSucursal
     * @param coloniaSucursal
     * @param municipioDelegacionSucursal 
     */
    public DireccionSucursal(String calleSucursal,String estadoSucursal,int numeroSucursal,String coloniaSucursal,String municipioDelegacionSucursal,int idDireccionSucursal) {
    
        this.calleSucursal = calleSucursal;
        this.estadoSucursal = estadoSucursal;
        this.numeroSucursal = numeroSucursal;
        this.coloniaSucursal = coloniaSucursal;
        this.municipioDelegacionSucursal = municipioDelegacionSucursal;
        this.idDireccionSucursal = idDireccionSucursal;
        
    }
    
    /**
     * Método para seleccionar los datos de la tabla direccion_sucursal
     * @return todos los datos de la tabla
     * @throws SQLException 
     */
    public static synchronized ResultSet selecciona() throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("SELECT * FROM direccion_sucursal");
        return declaracion.executeQuery(cadena);
        
    }
    
    /**
     * Método para agregar datos a la tabla dirrecion_sucursal
     * @throws SQLException 
     */
    public synchronized void agregar() throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("INSERT INTO direccion_sucursal (calle_sucursal,estado_sucursal,numero_sucursal,colonia_sucursal,municipio_delegacion_sucursal,id_direccion_sucursal) "
                + "VALUES ('" + this.calleSucursal + "','" + this.estadoSucursal + "'," + this.numeroSucursal + ",'" + this.coloniaSucursal + "','" + this.municipioDelegacionSucursal + "'," + this.idDireccionSucursal + ");");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
    
    /**
     * Método para actualizar la calle de una sucursal
     * @param nuevaCalle - la nueva calle de la sucursal
     * @throws SQLException 
     */
    public synchronized void actualizarCalle(String nuevaCalle) throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("UPDATE direccion_sucursal SET calle_sucursal = '" + nuevaCalle + "' WHERE id_direccion_sucursal = " + this.idDireccionSucursal + ");");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
    
    /**
     * Método para actualizar el estado de una sucursal
     * @param nuevoEstado - el nuevo estado de la sucursal
     * @throws SQLException 
     */
    public synchronized void actualizarEstado(String nuevoEstado) throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("UPDATE direccion_sucursal SET estado_sucursal = '" + nuevoEstado + "' WHERE id_direccion_sucursal = " + this.idDireccionSucursal + ");");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
    
    /**
     * Método para actualizar el numero de sucursal
     * @param nuevoNumero - el nuevo numero de la sucursal
     * @throws SQLException 
     */
    public synchronized void actualizarNumero(int nuevoNumero) throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("UPDATE direccion_sucursal SET numero_sucursal = " + nuevoNumero + " WHERE id_direccion_sucursal = " + this.idDireccionSucursal + ");");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
    
    /**
     * Método para actualizar la colonia de una sucursal
     * @param nuevaColonia - la nueva colonia de la sucursal
     * @throws SQLException 
     */
    public synchronized void actualizarColonia(String nuevaColonia) throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("UPDATE direccion_sucursal SET colonia_sucursal = '" + nuevaColonia + "' WHERE id_direccion_sucursal = " + this.idDireccionSucursal + ");");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
    
    /**
     * Método para actualizar el municipio o delegacion de una sucursal
     * @param nuevoMunDel - el nuevo municipio o delegacion de la sucursal
     * @throws SQLException 
     */
    public synchronized void actualizarMunDel(String nuevoMunDel) throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("UPDATE direccion_sucursal SET municipio_delegacion_sucursal = '" + nuevoMunDel + "' WHERE id_direccion_sucursal = " + this.idDireccionSucursal + ");");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
    
    /**
     * Método para eliminar datos de la tabla direccion_sucursal
     * @throws SQLException 
     */
    public synchronized void eliminar() throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("DELETE FROM direccion_sucursal WHERE id_direccion_sucursal = " + this.idDireccionSucursal + ";");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
    
}
