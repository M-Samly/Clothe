/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author M_Samly
 */
public class db {

    //remote database. every time should be change ip address. <<not working>>
    /*private static final String JDBC_URL = "jdbc:mysql://mamfarmhouse.com/mamfarmh_wp59418";
    private static final String USERNAME = "mamfarmh_wp59418";
    private static final String PASSWORD = ")65p48.ESg";
    */
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/cloth";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);//"Please Contact Developers!");
            return null;
        }
    }
}
