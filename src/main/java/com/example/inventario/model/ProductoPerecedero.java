package  com.example.inventario.model;

public class ProductoPerecedero extends Producto{
    private  int diasParaVencer;

    public  ProductoPerecedero(String codigo,String nombre,String categoria,double precio,int stock,int diasParaVencer){
        super(codigo,nombre,categoria,precio,stock);
        setDiasParaVencer(diasParaVencer);
    }

    @Override
    public double calcularValorInventario() {
      double valorBase = getPrecio() * getStock();
      if (diasParaVencer <= 3){
          return valorBase * 0.50;
      }
      if (diasParaVencer <= 7){
          return valorBase * 0.80;
      }
      return valorBase;
    }

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        if (diasParaVencer < 0){
            throw new IllegalArgumentException("Los dias de vencimiento no pueden ser negativos");
        }
        this.diasParaVencer = diasParaVencer;
    }
}