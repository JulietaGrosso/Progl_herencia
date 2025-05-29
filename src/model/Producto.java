package model;

public class Producto {

 private int id;
 private String producto;
 private double precio;
 private String descripcion;


 static int cantidadProductos = 0;

  public Producto(String producto, double precio, String descripcion) {
    this.id = id;
    this.producto = producto;
    this.precio = precio;
    this.descripcion = descripcion;
  }



  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getProducto() {
    return producto;
  }

  public void setProducto(String producto) {
    this.producto = producto;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public static int getCantidadProductos() {
    return cantidadProductos;
  }

  public static void setCantidadProductos(int cantidadProductos) {
    Producto.cantidadProductos = cantidadProductos;
  }

  @Override
  public String toString(){
    return "Id" + id + "/n" +
        "producto" + producto + "/n" +
        "precio" + precio + "/n" +
        "descripcion" + descripcion;
  }

  @Override
  public boolean equals(Object o){
    if (this == o) return true;
    if(!(o instanceof Producto)) return false;
    Producto producto1 = (producto) o;
    if (Double.compare(producto1.producto, precio) !=0) return false;
    if(!producto.equals(producto1.producto)) return false;
    return descripcion.equals(producto1.descripcion);
  }

  @Override int hashCode(){
    int result=1;
    return result;
  }

}
