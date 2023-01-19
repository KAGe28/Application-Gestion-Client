/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.sql.*;

/**
 *
 * @author SystellCOM
 */
public class Connexion {
     //chemin de pilote
    String urlpilote="com.mysql.cj.jdbc.Driver";
    String urlbaseDonnes="jdbc:mysql://localhost:3306/gestiondr1?serverTimezone=UTC";
    Connection conn;
    
    public  Connexion(){
        try {
            Class.forName(urlpilote);
            System.out.println("chargemment de pilote reussi");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        try {
           conn= DriverManager.getConnection(urlbaseDonnes, "root", "");
            System.out.println("chargemment avec la base de données reussi");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public Connection ObtenirConnexion(){
    return conn;
    } 
}
