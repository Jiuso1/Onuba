/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.*;
import Vista.*;
import java.sql.SQLException;

/**
 *
 * @author jesus
 */

public class ControladorLogin {
    //Atributos:
    private Conexion conexion;
    private VistaConsola vista;
    
    //Métodos públicos:
    public ControladorLogin(){
        vista = new VistaConsola();
        conexion = new Conexion("oracle","172.17.20.39","1521","DDSI_058","DDSI_058");  //Yo pongo mi usuario, que es BD_058. He puesto Oracle porque quiero, la conexión a mariaDB la dejo abajo comentada. Si quieres conectarte a mariaDB, debes comentar la línea de conexión a Oracle.
        //conexion = new Conexion("mariadb","172.18.1.241","3306","DDSI_058","DDSI_058");
        conexion.desconexion();
    }
    
    public void recuperarMetaDatos(){
        try {
            vista.mensajeMetadatos(this.conexion.informacionBD());
        } catch (SQLException ex) {
            vista.mensajeConsola("Se produjo una excepción :(");
        }
    }
    
}


