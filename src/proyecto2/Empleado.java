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
        
        this.idEmpleado = idEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.apellidoPaternoEmpleado = apellidoPaternoEmpleado;
        this.apellidoMaternoEmpleado = apellidoMaternoEmpleado;
        this.mesN= mesN;
        this.diaN = diaN;
        this.anyoN = anyoN;
        this.mesI = mesI;
        this.diaI = diaI;
        this.anyoI = anyoI;
        this.posicion = posicion;
        
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
                + "VALUES (" + this.idEmpleado + ",'" + this.nombreEmpleado + "','" + this.apellidoPaternoEmpleado + "','" + this.apellidoMaternoEmpleado + "'," + this.mesN + "/" + this.diaN + "/" + this.anyoN + "," + this.mesI + "/" + this.diaI + "/" + this.anyoI + ",'" + this.posicion + "');");
        declaracion.executeLargeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
    
    /**
     * Método para actualizar el nombre de un empleado
     * @param nuevoNombre - el nuevo nombre del empleado
     * @throws SQLException 
     */
    public synchronized void actualizarNombre(String nuevoNombre) throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("UPDATE empleado SET nombre_empleado = '" + nuevoNombre + "' WHERE id_empleado = " + this.idEmpleado + ");");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
    
    /**
     * Método para actualizar el apellido paterno de un empleado
     * @param nuevoAPaterno - el nuevo apellido paterno del empleado
     * @throws SQLException 
     */
    public synchronized void actualizarApellidoPaterno(String nuevoAPaterno) throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("UPDATE empleado SET apellido_paterno_empleado = '" + nuevoAPaterno + "' WHERE id_empleado = " + this.idEmpleado + ");");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
    
    /**
     * Método para actualizar el apellido materno de un empleado
     * @param nuevoAMaterno - el nuevo apellido materno del empleado
     * @throws SQLException 
     */
    public synchronized void actualizarApellidoMaterno(String nuevoAMaterno) throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("UPDATE empleado SET apellido_materno_empleado = '" + nuevoAMaterno + "' WHERE id_empleado = " + this.idEmpleado + ");");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
    
    /**
     * Método para actualizar la fecha de nacimiento de un empleado
     * @param nuevoMesN - el nuevo mes de nacimiento
     * @param nuevoDiaN - el nuevo dia de nacimiento
     * @param nuevoAñoN - el nuevo año de nacimiento
     * @throws SQLException 
     */
    public synchronized void actualizarFechaNacimiento(int nuevoMesN,int nuevoDiaN,int nuevoAñoN) throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("UPDATE empleado SET fecha_de_nacimiento = '" + nuevoMesN + "/" + nuevoDiaN + "/" + nuevoAñoN + "' WHERE id_empleado = " + this.idEmpleado + ");");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
    
    /**
     * Método para actualizar la fecha de ingreso de un empleado
     * @param nuevoMesI - el nuevo mes de ingreso
     * @param nuevoDiaI - el nuevo dia de ingreso
     * @param nuevoAñoI - el nuevo año de ingreso
     * @throws SQLException 
     */
    public synchronized void actualizarFechaIngreso(int nuevoMesI,int nuevoDiaI,int nuevoAñoI) throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("UPDATE empleado SET fecha_de_ingreso = '" + nuevoMesI + "/" + nuevoDiaI + "/" + nuevoAñoI + "' WHERE id_empleado = " + this.idEmpleado + ");");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
    
    /**
     * Método para actualizar la posición de trabajo de un empleado
     * @param nuevaPosicion - la nueva posicion de trabajo del empleado
     * @throws SQLException 
     */
    public synchronized void actualizarPosicion(String nuevaPosicion) throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("UPDATE empleado SET posicion = '" + nuevaPosicion + "' WHERE id_empleado = " + this.idEmpleado + ");");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
    
    /**
     * Método para eliminar datos de la tabla empleado
     * @throws SQLException 
     */
    public synchronized void eliminar() throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("DELETE FROM marca WHERE id_empleado = " + this.idEmpleado + ");");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
    
}
