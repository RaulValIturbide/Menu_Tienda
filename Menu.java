
package ejercicio24;
import java.util.Scanner;

public class Menu {
    Scanner teclado = new Scanner(System.in);
    public  int numeroArticulos;
    public int eleccion;
    public String nombre;
    private Vendedor vendedor;
    
    
    
    public Menu(){
        System.out.println("""
                           ¿Quien deseas que te atienda?
                           1-Juan
                           2-Ana
                           3-Luis
                           """);
        this.eleccion = teclado.nextInt();
        System.out.println("Cuantos articulos?");
        this.numeroArticulos=teclado.nextInt();}
    
    
    public void setNumeroArticulos(int numero){
    this.numeroArticulos=numero;
    }
    public  int getNumeroArticulos(){
    return numeroArticulos;}
    public int getEleccion(){
    return eleccion;}
 
  
    
    
}
