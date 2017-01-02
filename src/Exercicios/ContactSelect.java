package Exercicios;

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
        System.out.println(contact.getBirthDate());
    
    }
    
}
