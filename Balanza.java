
package ejercicio24;

/**
 *
 * @author raulz
 */
public class Balanza {

  
    public static void main(String[] args) {
     Menu menu1 = new Menu();
     Vendedor vendedor1 = new Vendedor(menu1);
     Ticket ticket1 = new Ticket(menu1);
     vendedor1.verDatos();
    
   
       
    }
    
}
