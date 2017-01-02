package Exercicios;

import java.util.Calendar;

/**
 *
 * @author marce
 */
public class ContactUpdate 
{
    
    public static void main (String [] args)
    {
        Contact contact = new Contact();
        contact.setId(2l);//L because is long type
        contact.setName("Caelum2");
        contact.setEmail("contato@caelum.com.br2");
        contact.setAddress("R. Vergueiro 31852");
        contact.setBirthDate(Calendar.getInstance());
        
        ContactDAO dao = new ContactDAO();
        
        dao.updateContact(contact);
    }
    
}
