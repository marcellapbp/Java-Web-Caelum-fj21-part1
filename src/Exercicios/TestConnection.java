package Exercicios;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *Objective: To test ConnectionFactory
 * @author marcella
 */
public class TestConnection 
{
    
    public static void main (String[] args)
    {
        try (Connection connection = new ConnectionFactory().getConnection()) {
            System.out.println("Connection Opened");
            connection.close();
            System.out.println("Connection Closed");
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
