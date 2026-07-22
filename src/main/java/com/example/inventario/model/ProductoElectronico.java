package com.example.inventario.model;

public class ProductoElectronico extends Producto {
    private static final  double COSTO_SEGURO_MENSUAL = 2.50;
    private int mesesGarantia;

    public ProductoElectronico(String codigo, String nombre, String categoria, double precio, int stock, int mesesGarantia) {
        super(codigo, nombre, categoria, precio, stock);
      setMesesGarantia(mesesGarantia);
    }

    @Override
    public double calcularValorInventario() {
double seguridadPorUnidad = mesesGarantia * COSTO_SEGURO_MENSUAL;
return (getPrecio() + seguridadPorUnidad * getStock());
    }

    public int getMesesGarantia() {
        return mesesGarantia;
    }

    public void setMesesGarantia(int mesesGarantia) {
       if (mesesGarantia < 0){
           throw  new IllegalArgumentException("Los meses no pueden ser menores a 0");
       }
    }
}