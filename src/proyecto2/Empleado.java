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
public class Empleado {
    
    private int idEmpleado;
    private String nombreEmpleado;
    private String apellidoPaternoEmpleado;
    private String apellidoMaternoEmpleado;
    private int mesN;
    private int diaN;
    private int anyoN;
    private int mesI;
    private int diaI;
    private int anyoI;
    private String posicion;
    
    
    /**
     * Constructor de la clase Empleado
     * @param idEmpleado
     * @param nombreEmpleado
     * @param apellidoPaternoEmpleado
     * @param apellidoMaternoEmpleado
     * @param mesN
     * @param diaN
     * @param anyoN
     * @param mesI
     * @param diaI
     * @param anyoI
     * @param posicion 
     */
    public Empleado(int idEmpleado,String nombreEmpleado,String apellidoPaternoEmpleado,String apellidoMaternoEmpleado,int mesN,int diaN,int anyoN,int mesI,int diaI,int anyoI,String posicion) {
        
        idEmpleado = this.idEmpleado;
        nombreEmpleado = this.nombreEmpleado;
        apellidoPaternoEmpleado = this.apellidoPaternoEmpleado;
        apellidoMaternoEmpleado = this.apellidoMaternoEmpleado;
        mesN = this.mesN;
        diaN = this.diaN;
        anyoN = this.anyoN;
        mesI = this.mesI;
        diaI = this.diaI;
        anyoI = this.anyoI;
        posicion = this.posicion;
        
    }
    
    /**
     * Método para agregar datos a la tabla empleado
     * @throws SQLException 
     */
    public synchronized void agregar() throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("INSERT INTO empleado (id_empleado,nombre_empleado,apellido_paterno_empleado,apellido_materno_empleado,fecha_de_nacimiento,fecha_de_ingreso,posicion) "
                + "VALUES (" + this.idEmpleado + "," + this.nombreEmpleado + "," + this.apellidoPaternoEmpleado + "," + this.apellidoMaternoEmpleado + "," + this.mesN + "," + this.diaN + "," + this.anyoN + "," + this.mesI + "," + this.diaI + "," + this.anyoI + "," + this.posicion + ");");
        declaracion.executeLargeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
    
}
