package com.example.inventario.model;

public abstract class Producto{
    private String codigo;
    private String nombre;
    private String categoria;
    private double precio;
    private  int stock;

    public Producto(String codigo, String nombre, String categoria, double precio, int stock) {
        setCodigo(codigo);
        setNombre(nombre);
       setCategoria(categoria);
       setPrecio(precio);
        setStock(stock);
    }



    public abstract double calcularValorInventario();

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {

        if (codigo == null || codigo.isBlank()){
            throw  new IllegalArgumentException("El codigo es obligatorio");
        }
        this.codigo = codigo.trim().toUpperCase();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()){
            throw  new IllegalArgumentException("El nombre es obligatorio");
        }
        this.nombre = nombre.trim();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        if (categoria == null || categoria.isBlank()){
            throw  new IllegalArgumentException("La categoria es obligatorio");
        }
        this.categoria= categoria.trim();
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock < 0){
            throw  new IllegalArgumentException("El stock debe ser superior a cero");
        }
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio < 0){
            throw  new IllegalArgumentException("El precio debe ser superior a cero");
        }
        this.precio = precio;
    }
}
