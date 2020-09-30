package cl.roman.imc_app.model;

public class Producto {

    private int codigo;
    private String nombre;
    private String categoria;
    private int cantidad;

    public Producto(int codigo, String nombre, String categoria, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.cantidad = cantidad;
    }
}
