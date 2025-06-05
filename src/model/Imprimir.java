package model;

public interface Imprimir{
  //Metodo abstracto para mostrar datos
  //abstracto porque no tiene cuerpo

  public static final String
        MENSAJE_BIENVENIDA = "Bienvenido al sistema de gestión de productos";


  public void MostrarDatos();
  default void MostrarBienvenida() {
    System.out.println(MENSAJE_BIENVENIDA);
  }
}
