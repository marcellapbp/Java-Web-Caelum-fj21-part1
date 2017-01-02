package Exercicios;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

/**
 *
 * @author marcella
 */
class ContactDAO {

    private Connection conn;
    
    public ContactDAO()
    {
        this.conn = new ConnectionFactory().getConnection();
    }
    
    public void add(Contact contact) 
    { 
      
        try(Connection conn = new ConnectionFactory().getConnection()) {
            
        

        String sql = "insert into contatos (nome, email, endereco, datanasc)"
                   + "values(?,?,?,?)";

        PreparedStatement pstmt = conn.prepareStatement(sql);
        
        pstmt.setString(1, contact.getName());
        pstmt.setString(2, contact.getEmail());
        pstmt.setString(3, contact.getAddress());
        pstmt.setDate(4, new Date( contact.getBirthDate().getTimeInMillis()));
        
        pstmt.execute();
        pstmt.close();
        
        System.out.print("Gravado!");
        
        conn.close();
        }catch(SQLException e)
        {
            throw new RuntimeException(e);
        }
    }
    
}
