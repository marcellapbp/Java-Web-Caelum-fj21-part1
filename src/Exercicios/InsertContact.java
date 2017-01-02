package Exercicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Calendar;

/**
 *Objective: Try an insert
 * @author marcella
 */
public class InsertContact 
{
    public static void main (String [] args) 
    {
        try(Connection conn = new ConnectionFactory().getConnection()) {
            
        

        String sql = "insert into contatos (nome, email, endereco, datanasc)"
                   + "values(?,?,?,?)";

        PreparedStatement pstmt = conn.prepareStatement(sql);
        
        pstmt.setString(1, "Caelum");
        pstmt.setString(2, "contato@caelum.com.br");
        pstmt.setString(3, "R. Vergueiro 3185");
        pstmt.setDate(4, new java.sql.Date(Calendar.getInstance().getTimeInMillis()));
        
        pstmt.execute();
        pstmt.close();
        
        System.out.print("Gravado!");
        
        conn.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        
        
        
    }
}
