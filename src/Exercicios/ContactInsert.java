package Exercicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Calendar;

/**
 *Objective: Try an insert
 * @author marcella
 */
public class ContactInsert 
{
    
    
    public static void main (String [] args) 
    {
        Contact contact = new Contact();
    
        contact.setName("Caelum");
        contact.setEmail("contato@caelum.com.br");
        contact.setAddress("R. Vergueiro 3185");
        contact.setBirthDate(Calendar.getInstance());
        
        ContactDAO dao = new ContactDAO();
        
        dao.add(contact);
    }
}
