package Exercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *Objective: To make exercises from Connection Factory page 9 fj21
 * @author marcella
 */
public class ConnectionFactory 
{
    private String url = "jdbc:mysql://localhost/fj21";
    private String user = "root";
    private String password = "";
    
    public Connection getConnection()
    {
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
