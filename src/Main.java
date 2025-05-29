import model.Bicicleta;
import model.Producto;

public class Main {
  public static void main(String[] args) {


    Bicicleta producto1= new Producto("Bicicleta", 248492, "Bici bmx", 26, "azul");

    System.out.println(producto1.toString());

    Producto producto2 = new Producto("cadena", 4555, "Cadena bici ´para rodado 26", 26, "blanca");

    Bicicleta producto3 = new Bicicleta("Bicicleta arcoiris", 99876, "Bici niña", 14, "Blanca");
    if (producto3 instanceof Bicicleta)
      System.out.println("Es una bici");
    else
      System.out.println("Es un producto");

  }
}