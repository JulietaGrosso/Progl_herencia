package model;

public interface Impuesto {
  public static final double IVA = 0.21;

  //Metodo privado
  private static double AlicuotaEnPorcentaje(){
    return IVA * 100;
  }

  //Metodo estático
  static void MostrarAlicuotaIva(){
    System.out.println("Alicuota IVA: " + IVA * 100 + "%");
  }

  //Metodo abstracto
  public void CalcularImpuesto(double precio);
}
