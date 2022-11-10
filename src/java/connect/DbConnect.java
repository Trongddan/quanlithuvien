package connect;


import java.sql.Connection;
import java.sql.DriverManager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DanDT
 */
public class DbConnect {
    private final String localhost="localhost:3306";
    private final String dbName="quanlythuvien";
    private final String user ="root";
    private final String password ="";
    String url = "jdbc:mysql://"+localhost+"/"+dbName;
    public Connection getConnection()throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection(url,user,password);
    }
}
