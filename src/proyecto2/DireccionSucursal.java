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
    public DireccionSucursal(int idDireccionSucursal,String calleSucursal,String estadoSucursal,int numeroSucursal,String coloniaSucursal,String municipioDelegacionSucursal) {
    
        idDireccionSucursal = this.idDireccionSucursal;
        calleSucursal = this.calleSucursal;
        estadoSucursal = this.estadoSucursal;
        numeroSucursal = this.numeroSucursal;
        coloniaSucursal = this.coloniaSucursal;
        municipioDelegacionSucursal = this.municipioDelegacionSucursal;
        
    }
    
    /**
     * Método para agregar datos a la tabla dirrecion_sucursal
     * @throws SQLException 
     */
    public synchronized void agregar() throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("INSERT INTO direccion_cliente (id_direccion_cliente,calle_cliente,estado_cliente,numero_cliente,colonia_cliente,municipio_delegacion_cliente) "
                + "VALUES (" + this.idDireccionSucursal + "," + this.calleSucursal + "," + this.estadoSucursal + "," + this.numeroSucursal + "," + this.coloniaSucursal + "," + this.municipioDelegacionSucursal + ");");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
    
}
