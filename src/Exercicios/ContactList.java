package Exercicios;

import java.util.List;

/**
 *
 * @author marcella
 */
public class ContactList 
{
     public static void main (String [] args)
    {
    
        ContactDAO dao = new ContactDAO();
        
        List<Contact> contacts;
        
        contacts = dao.ContactList();
        
        for (Contact contact : contacts) {
            System.out.println("===========================================================");
            
            System.out.println("Name:");
            System.out.println(contact.getName());
            System.out.println("Email:");
            System.out.println(contact.getEmail());
            System.out.println("Address:");
            System.out.println(contact.getAddress());
            System.out.println("BirthDate:");
            System.out.println(contact.getBirthDate());

            System.out.println("===========================================================");
        }
        
    }
    
    
}
