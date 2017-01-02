package Exercicios;

import java.util.Calendar;

/**
 *
 * @author marcella
 */
public class ContactSelect 
{
    
    public static void main (String [] args)
    {
    
        ContactDAO dao = new ContactDAO();
        
        Contact contact;
        
        contact = dao.SelectContact();
        
        System.out.println("Name:");
        System.out.println(contact.getName());
        System.out.println("Email:");
        System.out.println(contact.getEmail());
        System.out.println("Address:");
        System.out.println(contact.getAddress());
        System.out.println("BirthDate:");
        System.out.print(contact.getBirthDate().get(Calendar.DAY_OF_MONTH) + "/");
        System.out.print(contact.getBirthDate().get(Calendar.MONTH)+ "/");
        System.out.println(contact.getBirthDate().get(Calendar.YEAR));
    
    }
    
}
