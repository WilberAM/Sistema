package Modelo;

import java.sql.Date;

public class DetalleVentas {

    int Id_producto_Ve;
    int codigo;
    String nombre_producto;
    Date fecha_salida;
    int precio;
    int total_venda;

    public DetalleVentas() {

    }

    public DetalleVentas(int Id_producto_Ve, int codigo, String nombre_producto, Date fecha_salida, int precio, int total_venda) {
        this.Id_producto_Ve = Id_producto_Ve;
        this.codigo = codigo;
        this.nombre_producto = nombre_producto;
        this.fecha_salida = fecha_salida;
        this.precio = precio;
        this.total_venda = total_venda;

    }

    public int getId_producto_Ve() {
        return Id_producto_Ve;
    }

    public void setId_producto_Ve(int Id_producto_Ve) {
        this.Id_producto_Ve = Id_producto_Ve;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public Date getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getTotal_venda() {
        return total_venda;
    }

    public void setTotal_venda(int total_venda) {
        this.total_venda = total_venda;
    }

}
