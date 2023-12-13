package Modelo;
public class Empleado {

    String nombre;
    String contraseña;

public Empleado() {

}
public Empleado(String nombre,String contraseña) {

    this.nombre = nombre;

    this.contraseña=contraseña;
}

public String getnombre(){
return nombre;
}
public void setnombre(String nombre){
this.nombre=nombre;
}

public String getcontraseña(){
return contraseña;
}
public void setcontraseña(String contraseña){
this.contraseña = contraseña;
}
}