/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project_pi4.DAO;

/**
 *
 * @author lucas.paiva
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private static final String driverName = "com.mysql.jdbc.Driver";
    private static final String username = "newuser";
    private static final String password = "adminadmin";
    private static Connection con;
    private static final String urlString = "jdbc:mysql://localhost:3306/mobileStore?useUnicode=yes&characterEncoding=UTF-8&useTimezone=true&serverTimezone=UTC&useSSL=false";

    public static Connection getConnection() {
        try {
            Class.forName(driverName);
            try {
                con = DriverManager.getConnection(urlString, username, password);
            } catch (SQLException ex) {
                System.out.println("Failed to create the database connection.");
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver not found.");
        }
        return con;
    }

    public static void closeConnection() {
        try {
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

//    public Connection getConexao(){
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            return DriverManager.getConnection("jdbc:mysql://localhost:3306/mobileStore?autoReconnect=true&amp;useSSL=false","netbeans","netbeans");
//            
//        }catch(Exception error){
//            throw new RuntimeException("Erro 1: "+ error);
//        }
//    }
}
