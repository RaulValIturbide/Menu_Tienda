
package ejercicio24;
import java.util.Scanner;

public class Ticket {
    private Menu Menu;
    Scanner teclado = new Scanner(System.in);
    private int numeroArticulos;
    private double precioArticulos;
    
    
    public Ticket(Menu Menu){
        this.Menu=Menu;
        System.out.println(calcularPrecio(Menu.getNumeroArticulos()));
    }
    
    public double calcularPrecio(int numeroArticulos){
    double precioTotal=0;
    for (int i = 1;i<=numeroArticulos;i++){
        System.out.println("precio del articulo:" + i);
        precioTotal+=teclado.nextDouble();
    }
    return precioTotal;}
    
    public int getNumeroArticulos(Menu Menu) {
      return Menu.getNumeroArticulos();}
    
}
