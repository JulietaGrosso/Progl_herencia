package model;

public class Bicicleta extends Producto implements Imprimir, Impuesto{
  private int rodado;
  private String color;



  //llamo al constructor vacio de la clase padre Producto.
  public Bicicleta(String producto, double precio, String descripcion, int rodado, String color){
    super(producto, precio,descripcion);
    this.rodado = rodado;
    this.color = color;
  }

  public int getRodado() {
    return rodado;
  }

  public void setRodado(int rodado) {
    this.rodado = rodado;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public String toString(){
    return "Bicicleta" +
        "id=" + getId() +
        ", precio=" + getPrecio() + "/" +
        ", descripción= " + getDescripcion() + "/" +
        ", rodado=" + rodado + "/" +
        ", color=" + color;
  }


  @Override
  public void Mostrar(){
    super.toString();
    System.out.println("Bici rodado " + rodado +
        " Color " + color);
  }

  @Override
  public void MostrarDatos() {
    System.out.println("Muestra los datos de la bicicleta: " + this.toString()
    + "otra vez");
  }

  @Override
  public void MostrarBienvenida() {
    System.out.println(Imprimir.MENSAJE_BIENVENIDA);
  }

  @Override
  public void CalcularImpuesto(double precio) {
    System.out.println(precio * Impuesto.IVA);
  }
}
