package Exercicios;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

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
      
        try{
            
        

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
    
    public Contact SelectContact()
    {
        Contact contact = new Contact();
        try
        {
        
            String sql = "select * from contatos";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            
            ResultSet rs = pstmt.executeQuery();
            
            while(rs.next())
            {
                
                contact.setName(rs.getString("nome"));
                contact.setEmail(rs.getString("email"));
                contact.setAddress(rs.getString("endereco"));
                
                Calendar data = Calendar.getInstance();
                data.setTime(rs.getDate("datanasc"));
                contact.setBirthDate(data);
                
            }
            
            rs.close();
            pstmt.close();;
            conn.close();
            
        }catch(SQLException e)
        {
            throw new RuntimeException(e);
        }
        return contact;
    }
    
    
    public List<Contact> ContactList()
    {
        List<Contact> contacts = new ArrayList<>();
        try
        {
        
            String sql = "select * from contatos";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            
            ResultSet rs = pstmt.executeQuery();
            
            while(rs.next())
            {
                Contact contact = new Contact();
                contact.setName(rs.getString("nome"));
                contact.setEmail(rs.getString("email"));
                contact.setAddress(rs.getString("endereco"));
                
                Calendar data = Calendar.getInstance();
                data.setTime(rs.getDate("datanasc"));
                contact.setBirthDate(data);
                
                contacts.add(contact);
            }
            
            rs.close();
            pstmt.close();;
            conn.close();
            
        }catch(SQLException e)
        {
            throw new RuntimeException(e);
        }
        return contacts;
    }
}
