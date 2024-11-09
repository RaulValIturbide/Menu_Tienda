
package ejercicio24;

public class Vendedor {
    private Menu Menu;
    static private int contadorID;
    private int personalID;
    public String nombre;
    
    public Vendedor(Menu Menu){
        this.Menu=Menu;
        contadorID++;
        this.personalID=contadorID;
        this.nombre=nombreVendedor();
        }
    
    
      public void verDatos(){
          System.out.println("El nombre del vendedor es: " + this.nombre);
          System.out.println("El ID del vendedor es: "+ this.personalID);}
      
      public String nombreVendedor(){
      if (Menu.eleccion==1){
          this.nombre="Juan";
      }else if (Menu.eleccion==2){
          this.nombre="Ana";
      }else if (Menu.eleccion==3){
          this.nombre="Luis";
      }else {}
      return this.nombre;}
}       
