
package Modelo;

/**
 *
 */
public class Ventav {
    int id_venta;
    int id_empleado;
    int codigo;
    String nombre_producto;
   int cantidad;
   double precio;
   
   public Ventav(){
    
}
public Ventav(int id_venta,int id_empleado,int codigo,String nombre_producto,int cantidad ) {
    this.id_venta=id_venta;
    this.id_empleado = id_empleado;
    this.codigo = codigo;
    this.nombre_producto = nombre_producto;
    this.cantidad = cantidad;
}
    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
   
}
