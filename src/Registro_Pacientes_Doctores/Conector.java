/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Registro_Pacientes_Doctores;

import java.sql.Statement;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

/**
 *
 * @author Blanca
 */
public class Conector {
    //public static String dato;
    /**
     * crea una conexion a una base de datos especifica
     *
     * @return la conexion creada o nula
     */
    public Connection crearConexion() {
        String url = "jdbc:sqlite:";
        Path rutaBD = Paths.get("src/database/DB_Pacientes_Doctores.db");
        url += rutaBD.toAbsolutePath();
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection(url);
        } catch (SQLException ex) {
            conexion = null;
            //JOptionPane.showMessageDialog(this, ex.getMessage());

        }
        return conexion;
    }

    /**
     * Realiza una consulta en la base de datos y devuelve la tabla con los
     * resultados
     *
     * @param conexion la conexion donde se va a hacer la consulta
     * @param query la sentencia SQL a ejecutar
     * @return Los resultados de la consulta
     */
    public ResultSet ejecutarQuery(Connection conexion, String query) {
        ResultSet resultados=null;
        Statement sentencia = null;
        try {
            sentencia = conexion.createStatement();
            //Hacer una consulta y obtener la tabla con los resultados
            //Statement.executeQuery(String query)
            resultados = sentencia.executeQuery(query);
        } catch (SQLException ex) {
            resultados = null;
        }/*finally { // Close in order: ResultSet, Statement, Connection.
            try {
                resultados.close();
            } catch (Exception e) {
            }
            try {
                sentencia.close();
            } catch (Exception e) {
            }
            try {
                conexion.close();
            } catch (Exception e) {
            }
        }*/

        return resultados;
    }

    /**
     * ejecuta una sentencia SQL y devuelve la cantidad de filas afectadas por
     * la consulta
     *
     * @param conexion la conexion donde se va a hacer la consulta
     * @param query la sentencia SQL a ejecutar
     * @return la cantidad de filas afectadas
     */
    public int ejecutarActualizacion(Connection conexion, String query) {
        int filasAfectadas;
        Statement sentencia = null;
        try {
            sentencia = conexion.createStatement();
            //Hacer una consulta y devolver la cantidad de filas afectadas por la consulta
            //Statement.executeUpdate(String query);
            filasAfectadas = sentencia.executeUpdate(query);
            //filasAfectadas2=filasAfectadas;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            filasAfectadas = -1;
        }finally { // Close in order: ResultSet, Statement, Connection.
            /*try {
                resultados.close();
            } catch (Exception e) {
            }*/
            try {
                sentencia.close();
            } catch (SQLException e) {
            }
            try {
                conexion.close();
            } catch (SQLException e) {
            }
        }
        return filasAfectadas;
    }
    
    
    
    public ResultSet ejecutarQuery2(Connection conexion, String query) {
        ResultSet resultados=null;
        Statement sentencia = null;
        try {
            sentencia = conexion.createStatement();
            //Hacer una consulta y obtener la tabla con los resultados
            //Statement.executeQuery(String query)
            resultados = sentencia.executeQuery(query);
            //dato = resultados.getString("Id");
        } catch (SQLException ex) {
            resultados = null;
        }/*finally { // Close in order: ResultSet, Statement, Connection.
            try {
                resultados.close();
            } catch (SQLException e) {
            }
            try {
                sentencia.close();
            } catch (SQLException e) {
            }
            try {
                conexion.close();
            } catch (SQLException e) {
            }
        }*/

        return null;
    }
    
    public int ejecutarActualizacion2(Connection conexion, String query) {
        int filasAfectadas;
        Statement sentencia = null;
        try {
            sentencia = conexion.createStatement();
            //Hacer una consulta y devolver la cantidad de filas afectadas por la consulta
            //Statement.executeUpdate(String query);
            filasAfectadas = sentencia.executeUpdate(query);
            //filasAfectadas2=filasAfectadas;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            filasAfectadas = -1;
        }finally { // Close in order: ResultSet, Statement, Connection.
            /*try {
                resultados.close();
            } catch (Exception e) {
            }*/
            try {
                sentencia.close();
            } catch (Exception e) {
            }
            try {
                conexion.close();
            } catch (Exception e) {
            }
        }
        return filasAfectadas;
    }

}
