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
public class Cliente {
    
    private int idCliente;
    private String nombreCliente;
    private String apellidoPaternoCliente;
    private String apellidoMaternoCliente;
    private int telefonoCliente;
    private String correo;
    private int tarjetaDeCredito;
    
    /**
     * Constructor de la clase Cliente
     * @param idCliente
     * @param nombreCliente
     * @param apellidoPaternoCliente
     * @param apellidoMaternoCliente
     * @param telefonoCliente
     * @param correo
     * @param tarjetaDeCredito 
     */
    public Cliente(int idCliente,String nombreCliente,String apellidoPaternoCliente,String apellidoMaternoCliente,int telefonoCliente,String correo,int tarjetaDeCredito) {
        
        idCliente = this.idCliente;
        nombreCliente = this.nombreCliente;
        apellidoPaternoCliente = this.apellidoPaternoCliente;
        apellidoMaternoCliente = this.apellidoMaternoCliente;
        telefonoCliente = this.telefonoCliente;
        correo = this.correo;
        tarjetaDeCredito = this.tarjetaDeCredito;
        
    }
    
    
    /**
     * Método para agregar datos a la tabla cliente
     * @throws SQLException 
     */
    public synchronized void agregar() throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("INSERT INTO cliente (id_cliente,nombre_cliente,apellido_paterno_cliente,apellido_materno_cliente,telefono_cliente,correo,tarjeta_de_credito) "
                + "VALUES (" + this.idCliente + "," + this.nombreCliente + "," + this.apellidoPaternoCliente + "," + this.apellidoMaternoCliente + "," + this.telefonoCliente + "," + this.correo + "," + this.tarjetaDeCredito + ");");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
    
}
