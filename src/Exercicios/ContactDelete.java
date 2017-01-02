package Exercicios;

/**
 *
 * @author marcella
 */
public class ContactDelete 
{
    public static void main (String [] args)
    {
        ContactDAO dao = new ContactDAO();
        dao.deleteContact(1);
        System.out.print("Contact Deleted!");
    }
    
    
}
