package model;

public class Bicicleta extends Producto{
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
}
