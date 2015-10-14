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
public class TrabajaEn {
    
    private int idEmpleadoTrabajaEn;
    private int idSucursalTrabajaEn;
    
    public TrabajaEn(int idEmpleadoTrabajaEn,int idSucursalTrabajaEn){
        
        this.idEmpleadoTrabajaEn = idEmpleadoTrabajaEn;
        this.idSucursalTrabajaEn = idSucursalTrabajaEn;
        
    }
    
    public synchronized void agregar() throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("INSERT INTO trabaja_en (id_empleado_trabaja_en,id_sucursal_trabaja_en) "
                + "VALUES (" + this.idEmpleadoTrabajaEn + "," + this.idSucursalTrabajaEn + ");");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
    
    public synchronized void eliminar() throws SQLException {
        
        Connection conexion = Conexion.abrir();
        Statement declaracion = conexion.createStatement();
        String cadena = "";
        cadena = cadena.concat("DELETE FROM marca WHERE id_empleado_trabaja_en = " + this.idEmpleadoTrabajaEn + ");");
        declaracion.executeUpdate(cadena);
        declaracion.close();
        //conexion.commit();
        Conexion.cerrar();
        
    }
    
}
