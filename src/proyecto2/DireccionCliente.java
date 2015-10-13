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
    
    private int idDireccionCliente;
    private String calleCliente;
    private String estadoCliente;
    private int numeroCliente;
    private String coloniaCliente;
    private String municipioDelegacionCliente;
    
    /**
     * Constructor de la clase DireccionCliente
     * @param idDireccionCliente
     * @param calleCliente
     * @param estadoCliente
     * @param numeroCliente
     * @param coloniaCliente
     * @param municipioDelegacionCliente 
     */
    public DireccionCliente(int idDireccionCliente,String calleCliente,String estadoCliente,int numeroCliente,String coloniaCliente,String municipioDelegacionCliente) {
    
        idDireccionCliente = this.idDireccionCliente;
        calleCliente = this.calleCliente;
        estadoCliente = this.estadoCliente;
        numeroCliente = this.numeroCliente;
        coloniaCliente = this.coloniaCliente;
        municipioDelegacionCliente = this.municipioDelegacionCliente;
        
    }
    
    /**
     * Método para agregar datos a la tabla direccion_cliente
     * @throws SQLException 
     */
    public synchronized void agregar() throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("INSERT INTO direccion_cliente (id_direccion_cliente,calle_cliente,estado_cliente,numero_cliente,colonia_cliente,municipio_delegacion_cliente) "
                + "VALUES (" + this.idDireccionCliente + "," + this.calleCliente + "," + this.estadoCliente + "," + this.numeroCliente + "," + this.coloniaCliente + "," + this.municipioDelegacionCliente + ");");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
    
}
