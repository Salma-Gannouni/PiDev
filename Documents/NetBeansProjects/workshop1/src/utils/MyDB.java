/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lenovo
 */
public class MyDB {

    /*public static Object getInstance() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/
     String ur1 ="jdbc:mysql://localhost:3306/troc" ;
     String user = "root";
     String password ="" ;
    
   Connection cnx;
   
  private static MyDB instance;
  
  private MyDB ()
  {
        try {
            cnx = DriverManager.getConnection(ur1,user,password);
            System.out.println("connexion  etablie");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
           
  }
  
   public static MyDB getInstance() {
        if (instance == null) {
            instance = new MyDB();
        }
        return instance;
    }

    public Connection getCnx() {
        return cnx;
    }

    
}
