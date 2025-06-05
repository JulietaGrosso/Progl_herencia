import model.Bicicleta;
import model.Generico;
import model.Producto;

public class Main {
  public static void main(String[] args) {


    Bicicleta producto1= new Bicicleta("Bicicleta", 248492, "Bici bmx", 26, "azul");

    System.out.println(producto1.toString());

    Producto producto2 = new Bicicleta("cadena", 4555, "Cadena bici ´para rodado 26", 26, "blanca");

    Producto producto3 = new Bicicleta("Bicicleta arcoiris", 99876, "Bici niña", 14, "Blanca");
    if (producto3 instanceof Bicicleta)
      System.out.println("Es una bici");
    else
      System.out.println("Es un producto");

  }

  producto1.MostrarBienvenida();
  producto1.MostrarDatos();
  producto1.CalcularImpuesto(producto1.getPrecio());


 /* Generico g = new Generico();
  g.Mostrar(); */
}