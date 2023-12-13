package Modelo;

import java.sql.Date;

public class Productos {
     int codigo;
    String nombre_producto;
    String tipo_producto;
    int exitencia;
   int precio_adquirido;
   int precio_vender;
   Date fecha_caducidad;
   
public Productos() {

}
public Productos(int codigo,  String nombre_producto, String tipo_producto,int exitencia,int precio_adquirido,int precio_vender,Date fecha_caducidad) {
    this.codigo = codigo;
    this.nombre_producto = nombre_producto;
    this.tipo_producto = tipo_producto;
    this.exitencia = exitencia;
    this.precio_adquirido=precio_adquirido;
    this.precio_vender=precio_vender;
    this.fecha_caducidad=fecha_caducidad;
    
}
public int getcodigo(){
return codigo;
}
public void setcodigo(int codigo){
this.codigo=codigo;
}
public String getnombre_producto(){
return nombre_producto;
}
public void setnombre_producto(String nombre_producto){
this.nombre_producto=nombre_producto;
}
public String gettipo_producto(){
return tipo_producto;
}
public void settipo_producto(String tipo_producto){
this.tipo_producto=tipo_producto;
}
public int getexitencia(){
return exitencia;
}
public void settipo_producto(int exitencia){
this.exitencia=exitencia;
}
public int precio_adquirido(){
return precio_adquirido;
}
public void setprecio_adquirido(int precio_adquirido){
this.precio_adquirido=precio_adquirido;
}
public int getprecio_vender(){
return precio_vender;
}
public void setprecio_vender(int precio_vender){
this.precio_vender=precio_vender;
}
public Date fecha_caducidad(){
return fecha_caducidad;
}
public void setfecha_caducidad(Date fecha_caducidad){
this.fecha_caducidad=fecha_caducidad;
}
}
